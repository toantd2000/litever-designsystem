package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverFloatingActionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    FloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun LiteverFloatingActionButtonPreview() {
    LiteverTheme {
        Surface(modifier = Modifier.padding(16.dp)) {
            LiteverFloatingActionButton(onClick = {}) {
                Icon(Icons.Rounded.Add, contentDescription = null)
            }
        }
    }
}
