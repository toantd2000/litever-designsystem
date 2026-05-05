package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverShapes
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * A standard modal navigation drawer for the Litever application.
 * Wraps Material 3 ModalNavigationDrawer with the app's design tokens.
 */
@Composable
fun LiteverNavigationDrawer(
    drawerContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    drawerState: DrawerState = rememberDrawerState(DrawerValue.Closed),
    gesturesEnabled: Boolean = true,
    scrimColor: Color = DrawerDefaults.scrimColor,
    content: @Composable () -> Unit
) {
    ModalNavigationDrawer(
        drawerContent = drawerContent,
        modifier = modifier,
        drawerState = drawerState,
        gesturesEnabled = gesturesEnabled,
        scrimColor = scrimColor,
        content = content
    )
}

/**
 * A standard drawer sheet for the Litever application.
 * Wraps Material 3 ModalDrawerSheet with the app's design tokens.
 */
@Composable
fun LiteverDrawerSheet(
    modifier: Modifier = Modifier,
    drawerShape: Shape = LiteverShapes.large,
    drawerContainerColor: Color = LiteverTheme.colors.surface,
    drawerContentColor: Color = LiteverTheme.colors.onSurface,
    drawerTonalElevation: Dp = DrawerDefaults.ModalDrawerElevation,
    windowInsets: WindowInsets = DrawerDefaults.windowInsets,
    content: @Composable ColumnScope.() -> Unit
) {
    ModalDrawerSheet(
        modifier = modifier.width(320.dp),
        drawerShape = drawerShape,
        drawerContainerColor = drawerContainerColor,
        drawerContentColor = drawerContentColor,
        drawerTonalElevation = drawerTonalElevation,
        windowInsets = windowInsets,
        content = content
    )
}

/**
 * A standard navigation drawer item for the Litever application.
 * Wraps Material 3 NavigationDrawerItem with the app's design tokens.
 */
@Composable
fun LiteverNavigationDrawerItem(
    label: @Composable () -> Unit,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)? = null,
    badge: @Composable (() -> Unit)? = null,
    shape: Shape = LiteverShapes.large,
    colors: NavigationDrawerItemColors = NavigationDrawerItemDefaults.colors(
        selectedContainerColor = LiteverTheme.colors.primaryContainer,
        unselectedContainerColor = Color.Transparent,
        selectedIconColor = LiteverTheme.colors.onPrimaryContainer,
        unselectedIconColor = LiteverTheme.colors.onSurfaceVariant,
        selectedTextColor = LiteverTheme.colors.onPrimaryContainer,
        unselectedTextColor = LiteverTheme.colors.onSurfaceVariant
    )
) {
    NavigationDrawerItem(
        label = label,
        selected = selected,
        onClick = onClick,
        modifier = modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
        icon = icon,
        badge = badge,
        shape = shape,
        colors = colors
    )
}
