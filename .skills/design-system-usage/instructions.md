# Skill: Litever Design System Usage (@litever-design-system-usage)

Kỹ năng này định nghĩa các quy tắc bắt buộc khi thiết kế và lập trình giao diện sử dụng thư viện `litever-designsystem`. Mọi AI Agent và Lập trình viên khi làm việc với UI của thương hiệu đều phải tuân thủ nghiêm ngặt.

## 1. Nguyên tắc sử dụng Spacing (Khoảng cách)
- **Tuyệt đối KHÔNG hardcode giá trị dp** (ví dụ: `padding(16.dp)`, `Spacer(height = 8.dp)`) trong UI Component.
- **Bắt buộc sử dụng hệ thống Spacing** từ `LiteverTheme`:
  - `LiteverTheme.spacing.none` (0.dp)
  - `LiteverTheme.spacing.extraSmall` (4.dp): Dành cho khoảng cách giữa các thành phần rất nhỏ gọn (như icon và text trong nút).
  - `LiteverTheme.spacing.small` (8.dp): Khoảng cách các thành phần trong cùng một nhóm.
  - `LiteverTheme.spacing.medium` (16.dp): Khoảng cách mặc định (Padding của viền màn hình, khoảng cách giữa các khối nội dung).
  - `LiteverTheme.spacing.large` (24.dp): Khoảng cách chia cắt các khu vực lớn trên màn hình.
  - `LiteverTheme.spacing.extraLarge` (32.dp), `doubleLarge` (48.dp), `tripleLarge` (64.dp) cho các vùng không gian lớn.

**Ví dụ chuẩn:**
```kotlin
Modifier.padding(LiteverTheme.spacing.medium) // ĐÚNG
Modifier.padding(16.dp)                       // SAI
```

## 2. Nguyên tắc sử dụng Colors (Màu sắc)
- Luôn truy xuất màu thông qua `LiteverTheme.colors`.
- Không sử dụng các màu tùy tiện như `Color.Red` hay `Color(0xFF...)` trong App, trừ khi đang ở file định nghĩa Theme.
- Ví dụ: `color = LiteverTheme.colors.primary`, `background = LiteverTheme.colors.surface`.

## 3. Nguyên tắc sử dụng Typography (Kiểu chữ)
- Mọi `Text` phải được gán thuộc tính `style` từ `LiteverTheme.typography`.
- Ví dụ: `style = LiteverTheme.typography.titleLarge`.

## 4. Ưu tiên Component có sẵn
- Trước khi sử dụng các Component chuẩn của Material3, hãy kiểm tra xem `litever-designsystem` đã có phiên bản tương ứng chưa.
- **Bắt buộc dùng:**
  - `LiteverButton`, `LiteverTextButton`, `LiteverOutlinedButton` (Thay vì Button thông thường).
  - `LiteverTextField` (Thay cho OutlinedTextField).
  - `LiteverCard`, `LiteverElevatedCard`, `LiteverOutlinedCard` (Thay cho Card thông thường).
  - `LiteverCircularProgressIndicator` (Thay cho CircularProgressIndicator).
  - `LiteverTopAppBar`.

## 5. Cập nhật Backlog
- Bất cứ khi nào bạn nhận thấy UI cần một thành phần (Component) chưa có sẵn trong thư viện, đừng tự ý viết Component "tạm thời" lộn xộn trong App. Hãy thêm nó vào file `DESIGN_SYSTEM_BACKLOG.md` tại root của Design System module.
