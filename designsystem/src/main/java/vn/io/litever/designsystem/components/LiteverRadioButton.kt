package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverRadioButton(
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: RadioButtonColors = RadioButtonDefaults.colors(
        selectedColor = LiteverTheme.colors.primary,
        unselectedColor = LiteverTheme.colors.onSurfaceVariant,
        disabledSelectedColor = LiteverTheme.colors.onSurface.copy(alpha = 0.38f),
        disabledUnselectedColor = LiteverTheme.colors.onSurface.copy(alpha = 0.38f)
    )
) {
    RadioButton(
        selected = selected,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverRadioButtonPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(modifier = Modifier.padding(LiteverTheme.spacing.medium)) {
            var selectedOption by remember { mutableStateOf("Option 1") }
            Column {
                LiteverRadioButton(
                    selected = selectedOption == "Option 1",
                    onClick = { selectedOption = "Option 1" }
                )
                Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                LiteverRadioButton(
                    selected = selectedOption == "Option 2",
                    onClick = { selectedOption = "Option 2" }
                )
                Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                LiteverRadioButton(
                    selected = true,
                    onClick = null,
                    enabled = false
                )
            }
        }
    }
}
