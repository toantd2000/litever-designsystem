package vn.io.litever.designsystem.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Visibility
import androidx.compose.material.icons.rounded.VisibilityOff
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import vn.io.litever.designsystem.theme.LiteverTheme

object LiteverTextFieldDefaults {
    @Composable
    fun shape(): Shape = LiteverTheme.shapes.medium

    @Composable
    fun textFieldColors(): TextFieldColors = TextFieldDefaults.colors()

    @Composable
    fun outlinedTextFieldColors(): TextFieldColors = OutlinedTextFieldDefaults.colors()
}

/**
 * Standard Material 3 Filled TextField with Litever styling.
 * Supports both String and Composable slots for labels and placeholders.
 */
@Composable
fun LiteverTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
    labelContent: @Composable (() -> Unit)? = null,
    placeholder: String? = null,
    placeholderContent: @Composable (() -> Unit)? = null,
    supportingText: String? = null,
    supportingTextContent: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: String? = null,
    prefixContent: @Composable (() -> Unit)? = null,
    suffix: String? = null,
    suffixContent: @Composable (() -> Unit)? = null,
    showClearButton: Boolean = false,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource? = null,
    shape: Shape = LiteverTextFieldDefaults.shape(),
    colors: TextFieldColors = LiteverTextFieldDefaults.textFieldColors()
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = labelContent ?: label?.let { @Composable { Text(it) } },
        placeholder = placeholderContent ?: placeholder?.let { @Composable { Text(it) } },
        leadingIcon = leadingIcon,
        trailingIcon = resolveTrailingIcon(value, onValueChange, showClearButton, trailingIcon),
        prefix = prefixContent ?: prefix?.let { @Composable { Text(it) } },
        suffix = suffixContent ?: suffix?.let { @Composable { Text(it) } },
        supportingText = supportingTextContent ?: supportingText?.let { @Composable { Text(it) } },
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

/**
 * Standard Material 3 Outlined TextField with Litever styling.
 * Supports both String and Composable slots for labels and placeholders.
 */
@Composable
fun LiteverOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
    labelContent: @Composable (() -> Unit)? = null,
    placeholder: String? = null,
    placeholderContent: @Composable (() -> Unit)? = null,
    supportingText: String? = null,
    supportingTextContent: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: String? = null,
    prefixContent: @Composable (() -> Unit)? = null,
    suffix: String? = null,
    suffixContent: @Composable (() -> Unit)? = null,
    showClearButton: Boolean = false,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource? = null,
    shape: Shape = LiteverTextFieldDefaults.shape(),
    colors: TextFieldColors = LiteverTextFieldDefaults.outlinedTextFieldColors()
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = labelContent ?: label?.let { @Composable { Text(it) } },
        placeholder = placeholderContent ?: placeholder?.let { @Composable { Text(it) } },
        leadingIcon = leadingIcon,
        trailingIcon = resolveTrailingIcon(value, onValueChange, showClearButton, trailingIcon),
        prefix = prefixContent ?: prefix?.let { @Composable { Text(it) } },
        suffix = suffixContent ?: suffix?.let { @Composable { Text(it) } },
        supportingText = supportingTextContent ?: supportingText?.let { @Composable { Text(it) } },
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

/**
 * Pure BasicTextField from Compose Foundation for full customization.
 */
@Composable
fun LiteverBasicTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onTextLayout: (androidx.compose.ui.text.TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource? = null,
    cursorBrush: androidx.compose.ui.graphics.Brush = SolidColor(Color.Unspecified),
    decorationBox: @Composable (innerTextField: @Composable () -> Unit) -> Unit = { it() }
) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        visualTransformation = visualTransformation,
        onTextLayout = onTextLayout,
        interactionSource = interactionSource,
        cursorBrush = cursorBrush,
        decorationBox = decorationBox
    )
}

/**
 * Specialized Password TextField with visibility toggle.
 */
@Composable
fun LiteverPasswordTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
    placeholder: String? = null,
    isOutlined: Boolean = true,
    enabled: Boolean = true,
    isError: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    shape: Shape = LiteverTextFieldDefaults.shape(),
) {
    var passwordVisible by remember { mutableStateOf(false) }

    val trailingIcon = @Composable {
        LiteverIconButton(onClick = { passwordVisible = !passwordVisible }) {
            Icon(
                imageVector = if (passwordVisible) Icons.Rounded.VisibilityOff else Icons.Rounded.Visibility,
                contentDescription = if (passwordVisible) "Hide password" else "Show password"
            )
        }
    }

    if (isOutlined) {
        LiteverOutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            label = label,
            placeholder = placeholder,
            enabled = enabled,
            isError = isError,
            trailingIcon = trailingIcon,
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = true,
            shape = shape
        )
    } else {
        LiteverTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            label = label,
            placeholder = placeholder,
            enabled = enabled,
            isError = isError,
            trailingIcon = trailingIcon,
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = true,
            shape = shape
        )
    }
}

/**
 * Specialized Search TextField with search icon and clear button.
 */
@Composable
fun LiteverSearchTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String? = "Search...",
    isOutlined: Boolean = true,
    onSearch: (String) -> Unit = {},
    shape: Shape = LiteverTextFieldDefaults.shape(),
) {
    if (isOutlined) {
        LiteverOutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            placeholder = placeholder,
            leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null) },
            showClearButton = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { onSearch(value) }),
            singleLine = true,
            shape = shape
        )
    } else {
        LiteverTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            placeholder = placeholder,
            leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null) },
            showClearButton = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { onSearch(value) }),
            singleLine = true,
            shape = shape
        )
    }
}

/**
 * Material 3 Exposed Dropdown Menu combined with LiteverTextField.
 */
@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun LiteverExposedDropdownMenu(
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
    isOutlined: Boolean = true,
    readOnly: Boolean = true,
    content: @Composable androidx.compose.material3.ExposedDropdownMenuBoxScope.() -> Unit
) {
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = onExpandedChange,
        modifier = modifier
    ) {
        if (isOutlined) {
            LiteverOutlinedTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor(androidx.compose.material3.MenuAnchorType.PrimaryEditable, true),
                label = label,
                readOnly = readOnly,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                colors = LiteverTextFieldDefaults.outlinedTextFieldColors()
            )
        } else {
            LiteverTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor(androidx.compose.material3.MenuAnchorType.PrimaryEditable, true),
                label = label,
                readOnly = readOnly,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                colors = LiteverTextFieldDefaults.textFieldColors()
            )
        }
        content()
    }
}

@Composable
private fun resolveTrailingIcon(
    value: String,
    onValueChange: (String) -> Unit,
    showClearButton: Boolean,
    customTrailingIcon: @Composable (() -> Unit)?
): @Composable (() -> Unit)? {
    return when {
        showClearButton && value.isNotEmpty() -> {
            @Composable {
                LiteverIconButton(onClick = { onValueChange("") }) {
                    Icon(Icons.Rounded.Clear, contentDescription = "Clear")
                }
            }
        }
        else -> customTrailingIcon
    }
}

@Preview(showBackground = true, name = "TextField Variants")
@Composable
fun LiteverTextFieldShowcasePreview() {
    LiteverTheme {
        Column(modifier = Modifier.padding(LiteverTheme.spacing.medium)) {
            var text by remember { mutableStateOf("") }
            
            Text("Filled TextField (String Shortcut)", style = MaterialTheme.typography.labelMedium)
            LiteverTextField(
                value = text,
                onValueChange = { text = it },
                label = "Full Name",
                placeholder = "John Doe",
                showClearButton = true,
                modifier = Modifier.fillMaxWidth()
            )
            
            Spacer(Modifier.height(LiteverTheme.spacing.medium))
            
            Text("Outlined TextField (String Shortcut)", style = MaterialTheme.typography.labelMedium)
            LiteverOutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = "Email",
                placeholder = "example@mail.com",
                modifier = Modifier.fillMaxWidth()
            )
            
            Spacer(Modifier.height(LiteverTheme.spacing.medium))
            
            Text("Password Field", style = MaterialTheme.typography.labelMedium)
            LiteverPasswordTextField(
                value = text,
                onValueChange = { text = it },
                label = "Password",
                modifier = Modifier.fillMaxWidth()
            )
            
            Spacer(Modifier.height(LiteverTheme.spacing.medium))
            
            Text("Search Field", style = MaterialTheme.typography.labelMedium)
            LiteverSearchTextField(
                value = text,
                onValueChange = { text = it },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
