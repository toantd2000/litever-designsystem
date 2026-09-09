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
- Hệ thống tự động bảo toàn và fallback các màu semantic ngoài M3 (`success`, `warning`).

## 3. Nguyên tắc sử dụng Typography & Shapes
- `Text` dùng style từ `LiteverTheme.typography` (font Be Vietnam Pro).
- Container dùng `LiteverTheme.shapes` (hoặc `MaterialTheme.shapes`).

## 4. Dùng thẳng Material 3 Component kèm LiteVer Defaults
Không bọc lót component (No wrapper classes). Thay vào đó, gọi component gốc của Compose M3 và truyền Defaults:
- **Button:**
  ```kotlin
  Button(
      onClick = { ... },
      shape = LiteVerButtonDefaults.shape,
      colors = LiteVerButtonDefaults.primaryColors() // hoặc secondaryColors(), successColors(), destructiveColors()
  ) { ... }
  ```
- **OutlinedTextField / TextField:**
  ```kotlin
  OutlinedTextField(
      value = text,
      onValueChange = { text = it },
      shape = LiteVerTextFieldDefaults.shape,
      colors = LiteVerTextFieldDefaults.outlinedColors()
  )
  ```

## 5. Dùng Shared UI Views khi cần
Khi hiển thị các trạng thái xuyên suốt app, sử dụng các Shared UI chuẩn:
- `FeedbackStateView(type = FeedbackStateType.EMPTY / SUCCESS / ERROR / INFO)`
- `FullScreenLoading(message = "...")`
- `OfflineWarning(message = "...", onRetry = { ... })`
- `LiteverLogo(fontSize = ...)`
