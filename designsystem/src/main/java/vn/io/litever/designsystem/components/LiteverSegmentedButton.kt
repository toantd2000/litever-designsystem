package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * A standard segmented button row for the Litever application.
 * Wraps Material 3 SingleChoiceSegmentedButtonRow with the app's design tokens.
 */
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun LiteverSingleChoiceSegmentedButtonRow(
    modifier: Modifier = Modifier,
    space: androidx.compose.ui.unit.Dp = SegmentedButtonDefaults.BorderWidth,
    content: @Composable RowScope.() -> Unit
) {
    SingleChoiceSegmentedButtonRow(
        modifier = modifier,
        space = space,
        content = content
    )
}

/**
 * A standard segmented button for the Litever application.
 * Wraps Material 3 SegmentedButton with the app's design tokens.
 */
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun SingleChoiceSegmentedButtonRowScope.LiteverSegmentedButton(
    selected: Boolean,
    onClick: () -> Unit,
    shape: Shape,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: @Composable () -> Unit = { SegmentedButtonDefaults.Icon(selected) },
    label: @Composable () -> Unit,
    colors: SegmentedButtonColors = SegmentedButtonDefaults.colors(
        activeContainerColor = LiteverTheme.colors.primaryContainer,
        activeContentColor = LiteverTheme.colors.onPrimaryContainer,
        activeBorderColor = LiteverTheme.colors.outline,
        inactiveContainerColor = LiteverTheme.colors.surface,
        inactiveContentColor = LiteverTheme.colors.onSurface,
        inactiveBorderColor = LiteverTheme.colors.outline,
    )
) {
    SegmentedButton(
        selected = selected,
        onClick = onClick,
        shape = shape,
        modifier = modifier,
        enabled = enabled,
        icon = icon,
        label = label,
        colors = colors
    )
}
