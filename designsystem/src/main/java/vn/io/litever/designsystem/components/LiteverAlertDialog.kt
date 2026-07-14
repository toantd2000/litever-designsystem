package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
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
            LiteverButton(onClick = onConfirmClick) {
                Text(text = confirmButtonText)
            }
        },
        dismissButton = dismissButtonText?.let {
            {
                LiteverOutlinedButton(onClick = onDismissClick ?: onDismissRequest) {
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
    val context = LocalContext.current
    val configuration = LocalConfiguration.current
    val layoutDirection = LocalLayoutDirection.current

    val provideLocals: @Composable (@Composable () -> Unit) -> Unit = { content ->
        CompositionLocalProvider(
            LocalContext provides context,
            LocalConfiguration provides configuration,
            LocalLayoutDirection provides layoutDirection
        ) {
            content()
        }
    }

    AlertDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = { provideLocals { confirmButton() } },
        modifier = modifier,
        dismissButton = dismissButton?.let { { provideLocals { it() } } },
        icon = icon?.let { { provideLocals { it() } } },
        title = title?.let { { provideLocals { it() } } },
        text = text?.let { { provideLocals { it() } } },
        shape = shape,
        containerColor = containerColor,
        iconContentColor = iconContentColor,
        titleContentColor = titleContentColor,
        textContentColor = textContentColor,
        tonalElevation = tonalElevation,
        properties = properties
    )
}

@Preview(showBackground = true)
@Composable
fun LiteverAlertDialogPreview() {
    LiteverTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            LiteverAlertDialog(
                onDismissRequest = {},
                confirmButtonText = "Confirm",
                onConfirmClick = {},
                title = "Alert Title",
                text = "This is the alert message text.",
                dismissButtonText = "Cancel"
            )
        }
    }
}
