package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import vn.io.litever.designsystem.theme.LiteverIcons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.automirrored.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverShapes
import vn.io.litever.designsystem.theme.LiteverTheme

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.ui.text.TextStyle

/**
 * A custom TextField wrapper for the Litever application.
 * Follows Material 3 design and includes a built-in clear button.
 */
@Composable
fun LiteverTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource? = null,
    shape: Shape = LiteverShapes.large,
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors()
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        prefix = prefix,
        suffix = suffix,
        supportingText = supportingText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        interactionSource = interactionSource,
        shape = shape,
        colors = colors
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverTextFieldPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(modifier = Modifier.padding(16.dp)) {
            var text by remember { mutableStateOf("Hello") }
            Column {
                LiteverTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Label") },
                    placeholder = { Text("Placeholder") },
                    leadingIcon = { Icon(LiteverIcons.Rounded.Email, contentDescription = null) },
                    trailingIcon = {
                        if (text.isNotEmpty()) {
                            IconButton(onClick = { text = "" }) {
                                Icon(LiteverIcons.Rounded.Clear, contentDescription = "Clear")
                            }
                        }
                    }
                )
                Spacer(modifier = Modifier.height(8.dp))
                LiteverTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Error State") },
                    isError = true,
                    supportingText = { Text("Error message") }
                )
            }
        }
    }
}
