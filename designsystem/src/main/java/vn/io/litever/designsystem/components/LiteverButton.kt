package vn.io.litever.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = LiteverTheme.shapes.medium,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable RowScope.() -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = { content() }
    )
}

@Composable
fun LiteverOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = LiteverTheme.shapes.medium,
    colors: ButtonColors = ButtonDefaults.outlinedButtonColors(),
    elevation: ButtonElevation? = null,
    border: BorderStroke? = ButtonDefaults.outlinedButtonBorder(enabled),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable RowScope.() -> Unit,
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = content,
    )
}

@Composable
fun LiteverTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = LiteverTheme.shapes.medium,
    colors: ButtonColors = ButtonDefaults.textButtonColors(),
    elevation: ButtonElevation? = null,
    border: BorderStroke? = null,
    contentPadding: PaddingValues = ButtonDefaults.TextButtonContentPadding,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable RowScope.() -> Unit,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = content,
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
