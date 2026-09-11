---
name: design-system-usage
description: Guidelines and rules for implementing and consuming LiteVer Design System in Android Compose applications (FinLog, ReMind, etc.).
---

# Skill: LiteVer Design System Usage

Kỹ năng này định nghĩa các quy chuẩn bắt buộc khi phát triển UI và tiêu thụ thư viện `litever-designsystem`.

## 1. Nguyên tắc sử dụng Spacing (Khoảng cách)
- **Tuyệt đối KHÔNG hardcode giá trị dp** (như `padding(16.dp)`, `Spacer(height = 8.dp)`) trong UI.
- **Bắt buộc sử dụng hệ thống Spacing** từ `LiteverTheme.spacing`:
  - `LiteverTheme.spacing.none` (0.dp)
  - `LiteverTheme.spacing.tiny` (2.dp)
  - `LiteverTheme.spacing.extraSmall` (4.dp): Khoảng cách icon và text.
  - `LiteverTheme.spacing.small` (8.dp): Khoảng cách các phần tử nội bộ.
  - `LiteverTheme.spacing.smallMedium` (12.dp)
  - `LiteverTheme.spacing.medium` (16.dp): Padding viền màn hình và phân tách thẻ Card mặc định.
  - `LiteverTheme.spacing.mediumLarge` (20.dp)
  - `LiteverTheme.spacing.large` (24.dp): Khoảng cách chia khối nội dung chính.
  - `LiteverTheme.spacing.extraLarge` (32.dp), `doubleLarge` (48.dp), `tripleLarge` (64.dp)

```kotlin
// ĐÚNG:
Modifier.padding(LiteverTheme.spacing.medium)
Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))

// SAI:
Modifier.padding(16.dp)
Spacer(modifier = Modifier.height(8.dp))
```

## 2. Nguyên tắc sử dụng Colors (Màu sắc) & Dynamic Theming
- Luôn truy xuất màu thông qua `LiteverTheme.colors` hoặc `MaterialTheme.colorScheme`.
- Khi app con (FinLog, ReMind) cần bảng màu thương hiệu riêng:
  Truyền trực tiếp `colorScheme = myAppColorScheme` vào `LiteverTheme(colorScheme = ...)` ở cấp Root.
- Hệ thống tự động bảo toàn và fallback các màu semantic ngoài M3 (`success`, `warning`, `neutral`).

## 3. Nguyên tắc sử dụng Typography & Shapes
- `Text` dùng style từ `LiteverTheme.typography` (font Be Vietnam Pro).
- Container dùng `LiteverTheme.shapes` (hoặc `MaterialTheme.shapes`).

## 4. Opinionated Components & Component Defaults
Để giảm thiểu boilerplate và đảm bảo trải nghiệm thống nhất (bo góc 6.dp, màu ngữ nghĩa), ưu tiên sử dụng:
- **LvButton:** Hỗ trợ ma trận `(Type x Semantic)` không cần truyền `shape` hay `colors`:
  ```kotlin
  // Nút chính Filled mặc định:
  LvButton(onClick = { ... }) { Text("Lưu") }

  // Nút Success Filled:
  LvButton(onClick = { ... }, semantic = LvSemantic.Success) { Text("Hoàn tất") }

  // Nút Destructive Outlined:
  LvButton(onClick = { ... }, type = LvButtonType.Outlined, semantic = LvSemantic.Destructive) { Text("Xóa") }
  ```
- **LvIconButton:** Hỗ trợ bo góc 6.dp (thay vì hình tròn mặc định của M3) và ma trận `(Type x Semantic)`:
  ```kotlin
  // Icon button Filled:
  LvIconButton(onClick = { ... }, type = LvButtonType.Filled) {
      Icon(Icons.AutoMirrored.Rounded.Send, contentDescription = "Send")
  }

  // Icon button Outlined Destructive:
  LvIconButton(onClick = { ... }, type = LvButtonType.Outlined, semantic = LvSemantic.Destructive) {
      Icon(Icons.Rounded.Delete, contentDescription = "Delete")
  }
  ```
- **LvTextField:** Tự động áp dụng bo góc 6.dp, hỗ trợ cả 2 kiểu `Outlined` và `Filled` (`type = LvTextFieldType.Outlined / Filled`), cùng `errorMessage` và `semantic`:
  ```kotlin
  LvTextField(
      value = text,
      onValueChange = { text = it },
      type = LvTextFieldType.Outlined, // hoặc LvTextFieldType.Filled
      label = "Email",
      errorMessage = if (isError) "Email không hợp lệ" else null
  )
  ```
- **LvChip:** Chuẩn hóa Filter/Assist chip góc bo 6.dp (thay vì hình viên thuốc tròn) kèm semantic:
  ```kotlin
  LvChip(
      selected = isSelected,
      onClick = { isSelected = !isSelected },
      label = "Danh mục",
      semantic = LvSemantic.Primary // hoặc Tertiary, Neutral, Success...
  )
  ```
- **LvAlertDialog:** Dialog chuẩn hóa góc bo vừa phải 10.dp (thay vì 28.dp của M3) và tích hợp các nút bấm chuẩn:
  ```kotlin
  LvAlertDialog(
      onDismissRequest = { ... },
      title = { Text("Xác nhận") },
      text = { Text("Bạn có chắc muốn thực hiện thao tác này?") },
      confirmButton = { LvButton(onClick = { ... }) { Text("Đồng ý") } },
      dismissButton = { LvButton(onClick = { ... }, type = LvButtonType.Text) { Text("Hủy") } }
  )
  ```
- **LvSnackbar:** Hiển thị thông báo với bo góc 6.dp và màu sắc theo `LvSemantic`. Yêu cầu sử dụng `LvSnackbarHost` thay cho `SnackbarHost` mặc định.
  ```kotlin
  // Cài đặt Host
  LvSnackbarHost(hostState = snackbarHostState)

  // Hiển thị Snackbar với Semantic
  scope.launch {
      snackbarHostState.showSnackbar(
          LvSnackbarVisuals(
              message = "Thao tác thành công!",
              semantic = LvSemantic.Success
          )
      )
  }
  ```
- **Material 3 Gốc + Component Defaults:** Khi cần tùy biến sâu hoặc dùng các component M3 khác (`Card`, `Surface`), dùng thẳng M3 kèm `LiteVerButtonDefaults` / `LiteVerTextFieldDefaults`.

## 5. Dùng Shared UI Views khi cần
Khi hiển thị các trạng thái xuyên suốt app, sử dụng các Shared UI chuẩn:
- `FeedbackStateView(type = FeedbackStateType.EMPTY / SUCCESS / ERROR / INFO)`
- `FullScreenLoading(message = "...")`
- `OfflineWarning(message = "...", onRetry = { ... })`
- `LiteverLogo(fontSize = ...)`
