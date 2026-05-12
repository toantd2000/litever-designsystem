package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * A standard segmented button row for the Litever application.
 * Wraps Material 3 SingleChoiceSegmentedButtonRow with the app's design tokens.
 */
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun LiteverSingleChoiceSegmentedButtonRow(
    modifier: Modifier = Modifier,
    space: androidx.compose.ui.unit.Dp = 8.dp,
    content: @Composable SingleChoiceSegmentedButtonRowScope.() -> Unit
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
    shape: Shape = SegmentedButtonDefaults.itemShape(index = 0, count = 1), // This will be overridden by row logic usually, but we can set a default
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

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LiteverSegmentedButtonPreview() {
    LiteverTheme {
        Surface(modifier = Modifier.padding(16.dp)) {
            var selectedIndex by remember { mutableIntStateOf(0) }
            val options = listOf("Day", "Month", "Year")
            LiteverSingleChoiceSegmentedButtonRow {
                options.forEachIndexed { index, label ->
                    LiteverSegmentedButton(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        shape = SegmentedButtonDefaults.itemShape(index = index, count = options.size),
                        label = { Text(label) }
                    )
                }
            }
        }
    }
}
