package vn.io.litever.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
    drawerShape: Shape = LiteverTheme.shapes.large,
    drawerContainerColor: Color = LiteverTheme.colors.surface,
    drawerContentColor: Color = LiteverTheme.colors.onSurface,
    drawerTonalElevation: Dp = DrawerDefaults.ModalDrawerElevation,
    windowInsets: WindowInsets = DrawerDefaults.windowInsets,
    content: @Composable ColumnScope.() -> Unit
) {
    ModalDrawerSheet(
        modifier = modifier.fillMaxWidth(fraction = 0.75f),
        drawerShape = drawerShape,
        drawerContainerColor = drawerContainerColor,
        drawerContentColor = drawerContentColor,
        drawerTonalElevation = drawerTonalElevation,
        windowInsets = windowInsets,
        content = content
    )
}

@Composable
fun LiteverNavigationDrawerItem(
    label: @Composable () -> Unit,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)? = null,
    badge: @Composable (() -> Unit)? = null,
    colors: NavigationDrawerItemColors = NavigationDrawerItemDefaults.colors(
        selectedContainerColor = LiteverTheme.colors.primary.copy(alpha = 0.12f),
        unselectedContainerColor = Color.Transparent,
        selectedIconColor = LiteverTheme.colors.primary,
        unselectedIconColor = LiteverTheme.colors.onSurfaceVariant,
        selectedTextColor = LiteverTheme.colors.primary,
        unselectedTextColor = LiteverTheme.colors.onSurfaceVariant
    )
) {
    val containerColor = colors.containerColor(selected).value
    val iconColor = colors.iconColor(selected).value
    val textColor = colors.textColor(selected).value

    val spacing = LiteverTheme.spacing
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        color = containerColor,
        onClick = onClick,
        shape = androidx.compose.ui.graphics.RectangleShape
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = spacing.medium, end = spacing.medium),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (icon != null) {
                    androidx.compose.runtime.CompositionLocalProvider(
                        LocalContentColor provides iconColor
                    ) {
                        Box(
                            modifier = Modifier.size(24.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            icon()
                        }
                    }
                    Spacer(modifier = Modifier.width(spacing.smallMedium))
                }

                androidx.compose.runtime.CompositionLocalProvider(
                    LocalContentColor provides textColor,
                    LocalTextStyle provides LiteverTheme.typography.bodyLarge
                ) {
                    Box(modifier = Modifier.weight(1f)) {
                        label()
                    }
                }

                if (badge != null) {
                    Spacer(modifier = Modifier.width(spacing.smallMedium))
                    badge()
                }
            }

            if (selected) {
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .width(spacing.extraSmall)
                        .fillMaxHeight()
                        .background(
                            color = LiteverTheme.colors.primary,
                            shape = RoundedCornerShape(
                                topStart = spacing.tiny,
                                bottomStart = spacing.tiny
                            )
                        )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LiteverDrawerPreview() {
    LiteverTheme {
        LiteverDrawerSheet {
            Spacer(Modifier.height(LiteverTheme.spacing.smallMedium))
            LiteverNavigationDrawerItem(
                label = { Text("Home") },
                selected = true,
                onClick = {},
                icon = { Icon(Icons.Rounded.Home, contentDescription = null) }
            )
            LiteverNavigationDrawerItem(
                label = { Text("Settings") },
                selected = false,
                onClick = {},
                icon = { Icon(Icons.Rounded.Settings, contentDescription = null) }
            )
        }
    }
}
