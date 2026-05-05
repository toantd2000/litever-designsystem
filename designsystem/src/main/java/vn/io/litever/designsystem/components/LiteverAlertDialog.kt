package vn.io.litever.designsystem.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.DialogProperties
import vn.io.litever.designsystem.theme.LiteverShapes
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * A standard Alert Dialog for the Litever application.
 * Wraps Material 3 AlertDialog with the app's design tokens.
 */
@Composable
fun LiteverAlertDialog(
    onDismissRequest: () -> Unit,
    confirmButtonText: String,
    onConfirmClick: () -> Unit,
    modifier: Modifier = Modifier,
    title: String? = null,
    text: String? = null,
    dismissButtonText: String? = null,
    onDismissClick: (() -> Unit)? = null,
    content: @Composable (() -> Unit)? = null,
) {
    LiteverDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            Button(onClick = onConfirmClick) {
                Text(text = confirmButtonText)
            }
        },
        dismissButton = dismissButtonText?.let {
            {
                TextButton(onClick = onDismissClick ?: onDismissRequest) {
                    Text(text = it)
                }
            }
        },
        title = title?.let {
            {
                Text(
                    text = it,
                    style = LiteverTheme.typography.headlineSmall
                )
            }
        },
        text = content ?: text?.let {
            {
                Text(
                    text = it,
                    style = LiteverTheme.typography.bodyMedium
                )
            }
        },
        modifier = modifier
    )
}

/**
 * A flexible Dialog for the Litever application.
 * Allows custom button layouts while maintaining consistent Litever styling.
 */
@Composable
fun LiteverDialog(
    onDismissRequest: () -> Unit,
    confirmButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dismissButton: @Composable (() -> Unit)? = null,
    icon: @Composable (() -> Unit)? = null,
    title: @Composable (() -> Unit)? = null,
    text: @Composable (() -> Unit)? = null,
    shape: Shape = LiteverShapes.extraLarge,
    containerColor: Color = LiteverTheme.colors.surface,
    iconContentColor: Color = LiteverTheme.colors.primary,
    titleContentColor: Color = LiteverTheme.colors.onSurface,
    textContentColor: Color = LiteverTheme.colors.onSurfaceVariant,
    tonalElevation: Dp = AlertDialogDefaults.TonalElevation,
    properties: DialogProperties = DialogProperties()
) {
    AlertDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = confirmButton,
        modifier = modifier,
        dismissButton = dismissButton,
        icon = icon,
        title = title,
        text = text,
        shape = shape,
        containerColor = containerColor,
        iconContentColor = iconContentColor,
        titleContentColor = titleContentColor,
        textContentColor = textContentColor,
        tonalElevation = tonalElevation,
        properties = properties
    )
}
