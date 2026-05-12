package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
fun LiteverSwitch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier
) {
    Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        colors = SwitchDefaults.colors(
            checkedThumbColor = LiteverTheme.colors.primary,
            checkedTrackColor = LiteverTheme.colors.primaryContainer,
            uncheckedThumbColor = LiteverTheme.colors.onSurfaceVariant,
            uncheckedTrackColor = LiteverTheme.colors.surfaceVariant
        )
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverSwitchPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(modifier = Modifier.padding(16.dp)) {
            var checked1 by remember { mutableStateOf(true) }
            var checked2 by remember { mutableStateOf(false) }
            Column {
                LiteverSwitch(checked = checked1, onCheckedChange = { checked1 = it })
                Spacer(modifier = Modifier.height(8.dp))
                LiteverSwitch(checked = checked2, onCheckedChange = { checked2 = it })
            }
        }
    }
}

@Preview(showBackground = true, name = "Dark Mode")
@Composable
fun LiteverSwitchDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(modifier = Modifier.padding(16.dp)) {
            var checked1 by remember { mutableStateOf(true) }
            var checked2 by remember { mutableStateOf(false) }
            Column {
                LiteverSwitch(checked = checked1, onCheckedChange = { checked1 = it })
                Spacer(modifier = Modifier.height(8.dp))
                LiteverSwitch(checked = checked2, onCheckedChange = { checked2 = it })
            }
        }
    }
}
