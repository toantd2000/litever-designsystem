# Litever Design System - Backlog

Tài liệu này theo dõi các tính năng, token và component dùng chung cần được bổ sung vào `litever-designsystem` trong tương lai.

## 1. Icon System (`LiteverIcons.kt`)
- Xây dựng object quản lý tập trung các icon thương hiệu / icon tùy chỉnh nếu có.
- Tránh trùng lặp tài nguyên đồ họa giữa các ứng dụng (FinLog, ReMind).

## 2. Shared UI / Layout Templates
- **Standardized TopBar / BottomBar Defaults**: Cung cấp WindowInsets và styling defaults cho TopAppBar và NavigationBar của M3.
- **Pull-to-refresh / Swipe-to-refresh**: Custom refresh indicator chuẩn hóa theo phong cách Litever.
- **Skeleton Loading View**: Hỗ trợ hiệu ứng shimmer loading đồng nhất cho các list item hoặc card.

## 3. Component Defaults bổ sung
- **`LiteVerCardDefaults`**: Cung cấp default shapes (squircle) và elevation/border cho Card / ElevatedCard / OutlinedCard M3.
- **`LiteVerChipDefaults`**: Cung cấp colors, shapes chuẩn cho AssistChip, FilterChip, InputChip của M3.

---

## ✅ Completed (V2 Lean Architecture)
- **Token System**: Typography (Google Font Be Vietnam Pro), Shapes (Squircle), Spacing scale (`LiteverSpacing`).
- **Dynamic Theming**: `LiteverTheme` cho phép inject `colorScheme` từ client apps hoặc chọn sẵn 1 trong 7 bộ màu (Rainbow Palettes) thông qua enum `LiteverThemeColor`. Tự động giữ nguyên các semantic tokens (`warning`, `success`).
- **Eliminate Over-Engineering**: Loại bỏ toàn bộ 24 pass-through wrappers; chuyển sang dùng Material 3 gốc kèm Component Defaults.
- **Component Defaults**: `LiteVerButtonDefaults`, `LiteVerTextFieldDefaults`.
- **Shared UI Views**: `FeedbackStateView` (Empty, Success, Error, Info), `FullScreenLoading`, `OfflineWarning`, `LiteverLogo`.
- **Streamlined Sample App**: Tinh gọn các màn hình demo thành Overview, Components và Tokens, bổ sung Palette Switcher trực quan.

