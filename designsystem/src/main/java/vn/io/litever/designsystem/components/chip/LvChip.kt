package vn.io.litever.designsystem.components.chip

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SelectableChipColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.components.core.LvSemantic
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * Standard opinionated Filter/Selection Chip for LiteVer applications.
 *
 * Overrides Material 3's default pill/circular shape with LiteVer squircle shape (6.dp),
 * and provides standardized semantic coloring.
 *
 * @param selected Whether this chip is selected.
 * @param onClick Called when this chip is clicked.
 * @param label The text label of the chip.
 * @param modifier Modifier for the chip.
 * @param enabled Whether the chip is enabled for interaction.
 * @param semantic Visual intent color for selected states.
 * @param leadingIcon Optional icon at the start of the chip.
 * @param trailingIcon Optional icon at the end of the chip.
 * @param shape Corner shape defaulting to [LiteverTheme.shapes.medium] (6.dp).
 */
@Composable
fun LvChip(
    selected: Boolean,
    onClick: () -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    semantic: LvSemantic = LvSemantic.Primary,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    shape: Shape = LiteverTheme.shapes.medium,
    interactionSource: MutableInteractionSource? = null
) {
    @Suppress("NAME_SHADOWING")
    val interactionSource = interactionSource ?: remember { MutableInteractionSource() }

    val selectedColor = when (semantic) {
        LvSemantic.Primary -> MaterialTheme.colorScheme.primaryContainer
        LvSemantic.Secondary -> MaterialTheme.colorScheme.secondaryContainer
        LvSemantic.Tertiary -> MaterialTheme.colorScheme.tertiaryContainer
        LvSemantic.Success -> LiteverTheme.colors.successContainer
        LvSemantic.Destructive -> MaterialTheme.colorScheme.errorContainer
        LvSemantic.Warning -> LiteverTheme.colors.warningContainer
    }

    val selectedLabelColor = when (semantic) {
        LvSemantic.Primary -> MaterialTheme.colorScheme.onPrimaryContainer
        LvSemantic.Secondary -> MaterialTheme.colorScheme.onSecondaryContainer
        LvSemantic.Tertiary -> MaterialTheme.colorScheme.onTertiaryContainer
        LvSemantic.Success -> LiteverTheme.colors.onSuccessContainer
        LvSemantic.Destructive -> MaterialTheme.colorScheme.onErrorContainer
        LvSemantic.Warning -> LiteverTheme.colors.onWarningContainer
    }

    val colors: SelectableChipColors = FilterChipDefaults.filterChipColors(
        selectedContainerColor = selectedColor,
        selectedLabelColor = selectedLabelColor,
        selectedLeadingIconColor = selectedLabelColor,
        selectedTrailingIconColor = selectedLabelColor
    )

    FilterChip(
        selected = selected,
        onClick = onClick,
        label = { Text(label) },
        modifier = modifier,
        enabled = enabled,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        shape = shape,
        colors = colors,
        border = FilterChipDefaults.filterChipBorder(
            enabled = enabled,
            selected = selected,
            borderColor = MaterialTheme.colorScheme.outline
        ),
        interactionSource = interactionSource
    )
}

@Preview(showBackground = true, name = "LvChip - Light")
@Composable
fun LvChipLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface {
            Row(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                LvChip(selected = true, onClick = {}, label = "Primary")
                LvChip(selected = true, onClick = {}, label = "Success", semantic = LvSemantic.Success)
                LvChip(selected = true, onClick = {}, label = "Destructive", semantic = LvSemantic.Destructive)
                LvChip(selected = false, onClick = {}, label = "Unselected")
            }
        }
    }
}

@Preview(showBackground = true, name = "LvChip - Dark")
@Composable
fun LvChipDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface {
            Row(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                LvChip(selected = true, onClick = {}, label = "Primary")
                LvChip(selected = true, onClick = {}, label = "Tertiary", semantic = LvSemantic.Tertiary)
                LvChip(selected = false, onClick = {}, label = "Unselected")
            }
        }
    }
}
