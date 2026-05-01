# Litever Design System - Backlog

This document tracks UI components and features that need to be added to `litever-designsystem` in the future to complete the design system.

## 1. Icon System (`LiteverIcons.kt`)
- Create a centralized object for all icons used in the application.
- Replace direct usages of `Icons.Rounded...` in components (like `LiteverTextField`, `LiteverTopAppBar`) with `LiteverIcons`.
- This ensures consistency and makes it easy to switch icon sets globally later.

## 2. Navigation Components
- **`LiteverNavigationBar` & `LiteverNavigationBarItem`**: For bottom navigation.
- **`LiteverNavigationDrawer`**: For side menus.

## 3. Selection Controls
- **`LiteverCheckbox`**: For multi-selection forms.
- **`LiteverRadioButton`**: For single-selection forms.

## 4. Feedback & Overlays
- **`LiteverSnackbar`**: Wrapper for showing brief messages at the bottom.
- **`LiteverModalBottomSheet`**: For bottom sheet dialogs, increasingly popular over traditional dialogs.

## 5. Auxiliary Components
- **`LiteverDivider`**: Standardized horizontal and vertical dividers.
- **`LiteverChip`** / **`LiteverFilterChip`**: For tags, filters, and quick actions.
- **`LiteverBadge`**: For notification counts on icons.

## Notes
The components above should follow the established pattern of wrapping Material 3 components and integrating seamlessly with `LiteverTheme` (using `LiteverTheme.colors`, `LiteverTheme.typography`, `LiteverTheme.spacing`, etc.).
