# Litever Design System

Đây là thư viện UI (Design System) chuẩn hóa dành cho các ứng dụng thuộc thương hiệu Litever. Thư viện này được xây dựng trên nền tảng **Jetpack Compose** và tuân thủ **Material Design 3 (M3)**.

## Mục tiêu
- **Tính đồng nhất (Consistency):** Đảm bảo mọi ứng dụng của thương hiệu đều có chung một ngôn ngữ thiết kế, màu sắc, font chữ và các thành phần giao diện.
- **Tái sử dụng (Reusability):** Giảm thiểu thời gian viết lại các component cơ bản.
- **Bảo trì dễ dàng (Maintainability):** Thay đổi ở một nơi (Design System), toàn bộ ứng dụng tự động cập nhật.

## Kiến trúc & Triết lý thiết kế (V2)

Thư viện được thiết kế theo triết lý **tinh gọn, linh hoạt và không over-engineering**:
- **Design Tokens:** Cung cấp đầy đủ các chuẩn hóa nền tảng: Typography (Google Font Be Vietnam Pro), Shapes (Squircle), Spacing (`LiteverSpacing`), Color tokens (kèm semantic `warning`, `success`).
- **Dynamic Theming:** Hỗ trợ các app con (FinLog, ReMind) truyền trực tiếp `colorScheme` tùy biến vào `LiteverTheme` mà vẫn giữ trọn các semantic tokens.
- **Component Defaults:** Thay vì bọc (wrapper) lại các thành phần cơ bản của Jetpack Compose gây cồng kềnh và hạn chế API gốc, thư viện cung cấp các Defaults (`LiteVerButtonDefaults`, `LiteVerTextFieldDefaults`) để sử dụng trực tiếp với Material 3 gốc.
- **Shared UI Views:** Cung cấp các thành phần giao diện dùng chung hoàn chỉnh: `FeedbackStateView`, `FullScreenLoading`, `OfflineWarning`, `LiteverLogo`.

## Khởi tạo và Sử dụng

### 1. Khởi tạo Theme
Bao bọc nội dung ứng dụng bằng `LiteverTheme`:

```kotlin
import vn.io.litever.designsystem.theme.LiteverTheme

setContent {
    // Mặc định dùng bảng màu chuẩn của Litever
    LiteverTheme {
        // App content
    }

    // Hoặc truyền ColorScheme tùy chỉnh của từng app:
    // LiteverTheme(colorScheme = customColorScheme) { ... }
}
```

### 2. Các hệ thống nền tảng (Foundation Tokens)

Truy xuất thông qua `LiteverTheme`:

1. **Colors (Màu sắc):**
   ```kotlin
   Modifier.background(LiteverTheme.colors.background)
   Text(color = LiteverTheme.colors.onBackground)
   // Các màu semantic bổ sung cho M3:
   Icon(tint = LiteverTheme.colors.warning, ...)
   Text(color = LiteverTheme.colors.success, ...)
   ```

2. **Typography (Kiểu chữ - Be Vietnam Pro):**
   ```kotlin
   Text("Xin chào", style = LiteverTheme.typography.titleLarge)
   ```

3. **Spacing (Khoảng cách):** *BẮT BUỘC sử dụng thay cho việc hardcode `dp`*
   - `tiny` (2.dp), `extraSmall` (4.dp), `small` (8.dp), `smallMedium` (12.dp)
   - `medium` (16.dp - Mặc định viền màn hình), `mediumLarge` (20.dp)
   - `large` (24.dp), `extraLarge` (32.dp), `doubleLarge` (48.dp), `tripleLarge` (64.dp)
   ```kotlin
   Modifier.padding(LiteverTheme.spacing.medium)
   Spacer(modifier = Modifier.height(LiteverTheme.spacing.large))
   ```

4. **Shapes (Bo góc):**
   ```kotlin
   Modifier.clip(LiteverTheme.shapes.medium)
   ```

## Sử dụng Components

### 1. Material 3 Gốc + LiteVer Component Defaults
Dùng trực tiếp các composable chuẩn của Material 3 kết hợp với Defaults của hệ thống:

```kotlin
// Button
Button(
    onClick = { /* action */ },
    shape = LiteVerButtonDefaults.shape,
    colors = LiteVerButtonDefaults.primaryColors() // hoặc secondaryColors(), successColors(), destructiveColors()
) {
    Text("Xác nhận")
}

// Outlined Button
OutlinedButton(
    onClick = { /* action */ },
    shape = LiteVerButtonDefaults.shape,
    colors = LiteVerButtonDefaults.outlinedColors()
) {
    Text("Huỷ bỏ")
}

// TextField / OutlinedTextField
OutlinedTextField(
    value = text,
    onValueChange = { text = it },
    shape = LiteVerTextFieldDefaults.shape,
    colors = LiteVerTextFieldDefaults.outlinedColors()
)
```

### 2. Shared UI Views
Các màn hình / trạng thái dùng chung sẵn có:
- **`FeedbackStateView`**: Hiển thị trạng thái rỗng, thành công, lỗi, thông tin (`FeedbackStateType.EMPTY`, `SUCCESS`, `ERROR`, `INFO`).
- **`FullScreenLoading`**: Trạng thái loading toàn màn hình kèm thông điệp và chặn tương tác.
- **`OfflineWarning`**: Banner cảnh báo mất kết nối mạng kèm nút thử lại.
- **`LiteverLogo`**: Logo thương hiệu chuẩn.

