package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.designsystem.theme.LiteverShapes

@Composable
fun LiteverButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = LiteverShapes.medium,
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = LiteverTheme.colors.primary,
        contentColor = LiteverTheme.colors.onPrimary
    ),
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
    content: @Composable () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier.heightIn(min = 48.dp),
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        content = { content() }
    )
}

@Composable
fun LiteverOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = LiteverShapes.medium,
    colors: ButtonColors = ButtonDefaults.outlinedButtonColors(
        contentColor = LiteverTheme.colors.primary
    ),
    elevation: ButtonElevation? = null,
    content: @Composable () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier.heightIn(min = 48.dp),
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        content = { content() }
    )
}

@Composable
fun LiteverTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = LiteverShapes.medium,
    colors: ButtonColors = ButtonDefaults.textButtonColors(
        contentColor = LiteverTheme.colors.primary
    ),
    content: @Composable () -> Unit
) {
    TextButton(
        onClick = onClick,
        modifier = modifier.heightIn(min = 48.dp),
        enabled = enabled,
        shape = shape,
        colors = colors,
        content = { content() }
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverButtonPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(modifier = Modifier.padding(16.dp)) {
            Column {
                LiteverButton(onClick = {}) {
                    Text("Primary Button")
                }
                Spacer(modifier = Modifier.height(8.dp))
                LiteverOutlinedButton(onClick = {}) {
                    Text("Outlined Button")
                }
                Spacer(modifier = Modifier.height(8.dp))
                LiteverTextButton(onClick = {}) {
                    Text("Text Button")
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Dark Mode")
@Composable
fun LiteverButtonDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(modifier = Modifier.padding(16.dp)) {
            Column {
                LiteverButton(onClick = {}) {
                    Text("Primary Button")
                }
                Spacer(modifier = Modifier.height(8.dp))
                LiteverOutlinedButton(onClick = {}) {
                    Text("Outlined Button")
                }
                Spacer(modifier = Modifier.height(8.dp))
                LiteverTextButton(onClick = {}) {
                    Text("Text Button")
                }
            }
        }
    }
}
