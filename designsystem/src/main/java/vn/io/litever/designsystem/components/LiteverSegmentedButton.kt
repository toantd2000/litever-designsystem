package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonColors
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.SingleChoiceSegmentedButtonRowScope
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
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
    space: Dp = (-4).dp,
    content: @Composable SingleChoiceSegmentedButtonRowScope.() -> Unit
) {
    SingleChoiceSegmentedButtonRow(
        modifier = modifier,
        space = space,
        content = content
    )
}

/**
 * Default configurations and shape factories for LiteverSegmentedButton.
 */
object LiteverSegmentedButtonDefaults {
    /**
     * Returns a uniform, theme-aware corner shape for the segmented button items.
     * Ensures all items (including middle items) match the overall shape rounding.
     */
    @Composable
    fun itemShape(
        index: Int,
        count: Int,
        baseShape: Shape = LiteverTheme.shapes.medium
    ): Shape {
        return baseShape
    }
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
    shape: Shape = LiteverTheme.shapes.medium,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: @Composable () -> Unit = { SegmentedButtonDefaults.Icon(selected) },
    label: @Composable () -> Unit,
    colors: SegmentedButtonColors = SegmentedButtonDefaults.colors()
) {
    SegmentedButton(
        selected = selected,
        onClick = onClick,
        shape = shape,
        modifier = modifier,
        enabled = enabled,
        icon = icon,
        label = label,
        colors = colors,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LiteverSegmentedButtonPreview() {
    LiteverTheme {
        Surface(modifier = Modifier.padding(LiteverTheme.spacing.medium)) {
            var selectedIndex by remember { mutableIntStateOf(0) }
            val options = listOf("Day", "Month", "Year")
            LiteverSingleChoiceSegmentedButtonRow {
                options.forEachIndexed { index, label ->
                    LiteverSegmentedButton(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        label = { Text(label) }
                    )
                }
            }
        }
    }
}
