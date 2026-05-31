package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverCheckbox(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CheckboxColors = CheckboxDefaults.colors(
        checkedColor = LiteverTheme.colors.primary,
        uncheckedColor = LiteverTheme.colors.onSurfaceVariant,
        checkmarkColor = LiteverTheme.colors.onPrimary,
        disabledCheckedColor = LiteverTheme.colors.onSurface.copy(alpha = 0.38f),
        disabledUncheckedColor = LiteverTheme.colors.onSurface.copy(alpha = 0.38f),
        disabledIndeterminateColor = LiteverTheme.colors.onSurface.copy(alpha = 0.38f)
    )
) {
    Checkbox(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = colors
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverCheckboxPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(modifier = Modifier.padding(16.dp)) {
            var checked1 by remember { mutableStateOf(true) }
            var checked2 by remember { mutableStateOf(false) }
            Column {
                LiteverCheckbox(checked = checked1, onCheckedChange = { checked1 = it })
                Spacer(modifier = Modifier.height(8.dp))
                LiteverCheckbox(checked = checked2, onCheckedChange = { checked2 = it })
                Spacer(modifier = Modifier.height(8.dp))
                LiteverCheckbox(checked = true, onCheckedChange = null, enabled = false)
            }
        }
    }
}
