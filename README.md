# Litever Design System

Đây là thư viện UI (Design System) chuẩn hóa dành cho các ứng dụng thuộc thương hiệu Litever. Thư viện này được xây dựng trên nền tảng **Jetpack Compose** và tuân thủ **Material Design 3 (M3)**.

## Mục tiêu
- **Tính đồng nhất (Consistency):** Đảm bảo mọi ứng dụng của thương hiệu đều có chung một ngôn ngữ thiết kế, màu sắc, font chữ và các thành phần giao diện.
- **Tái sử dụng (Reusability):** Giảm thiểu thời gian viết lại các component cơ bản.
- **Bảo trì dễ dàng (Maintainability):** Thay đổi ở một nơi (Design System), toàn bộ ứng dụng tự động cập nhật.

## Khởi tạo và Sử dụng

Trong root của ứng dụng (hoặc `MainActivity`), bạn cần bao bọc nội dung bằng `LiteverTheme`:

```kotlin
import vn.io.litever.designsystem.theme.LiteverTheme

setContent {
    LiteverTheme {
        // App content here
    }
}
```

### Các hệ thống nền tảng (Foundation)

Thư viện cung cấp 4 trụ cột chính, tất cả đều được truy xuất qua biến toàn cục `LiteverTheme`:

1. **Colors (Màu sắc):** Bao gồm 36 token màu chuẩn M3, tự động chuyển đổi Light/Dark mode.
   ```kotlin
   Modifier.background(LiteverTheme.colors.background)
   Text(color = LiteverTheme.colors.onBackground)
   ```

2. **Typography (Kiểu chữ):**
   ```kotlin
   Text("Xin chào", style = LiteverTheme.typography.titleLarge)
   ```

3. **Spacing (Khoảng cách):** *BẮT BUỘC sử dụng thay cho việc hardcode `dp`*
   - `extraSmall`: 4.dp
   - `small`: 8.dp
   - `medium`: 16.dp (Mặc định cho viền màn hình)
   - `large`: 24.dp
   ```kotlin
   Modifier.padding(LiteverTheme.spacing.medium)
   Spacer(modifier = Modifier.height(LiteverTheme.spacing.large))
   ```

4. **Shapes (Bo góc):**
   ```kotlin
   Modifier.clip(LiteverTheme.shapes.medium)
   ```

## UI Components
Hãy luôn ưu tiên sử dụng các `Litever...` component trước khi dùng các hàm Compose thuần:

- `LiteverButton`, `LiteverTextButton`, `LiteverOutlinedButton`
- `LiteverTextField`
- `LiteverCard`, `LiteverElevatedCard`, `LiteverOutlinedCard`
- `LiteverTopAppBar`
- `LiteverProgressIndicator` (Circular & Linear)
- `LiteverAlertDialog`, `LiteverTimePickerDialog`
- `LiteverSwitch`
- Và nhiều thành phần khác...

## Định hướng phát triển tương lai
Tham khảo file `DESIGN_SYSTEM_BACKLOG.md` ở root folder để xem danh sách các Component đang chờ được bổ sung vào hệ thống.
