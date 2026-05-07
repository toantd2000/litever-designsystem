# Litever Design System - Backlog

This document tracks UI components and features that need to be added to `litever-designsystem` in the future to complete the design system.

## 1. Icon System (`LiteverIcons.kt`)
- Create a centralized object for all icons used in the application.
- Replace direct usages of `Icons.Rounded...` in components (like `LiteverTextField`, `LiteverTopAppBar`) with `LiteverIcons`.
- This ensures consistency and makes it easy to switch icon sets globally later.

## 2. Selection Controls
- **`LiteverCheckbox`**: For multi-selection forms.
- **`LiteverRadioButton`**: For single-selection forms.

## 3. Feedback & Overlays
- **`LiteverSnackbar`**: Wrapper for showing brief messages at the bottom.
- **`LiteverModalBottomSheet`**: For bottom sheet dialogs, increasingly popular over traditional dialogs.

## 4. Auxiliary Components
- **`LiteverDivider`**: Standardized horizontal and vertical dividers.
- **`LiteverChip`** / **`LiteverFilterChip`**: For tags, filters, and quick actions.
- **`LiteverBadge`**: For notification counts on icons.

---

## ✅ Completed Components
- **`LiteverNavigationDrawer`**: Standardized modal navigation drawer and drawer sheet.
- **`LiteverListItem`**: Generic list item component for consistent lists.
- **`LiteverDialog`**: Flexible dialog component supporting custom button layouts.
- **`LiteverSegmentedButton`**: Themed segmented button for mode switching.
- **Tailwind Color Palette**: Comprehensive Tailwind CSS v4 color palette accessible via `TailwindColors`.

## Notes
The components above should follow the established pattern of wrapping Material 3 components and integrating seamlessly with `LiteverTheme` (using `LiteverTheme.colors`, `LiteverTheme.typography`, `LiteverTheme.spacing`, etc.).
