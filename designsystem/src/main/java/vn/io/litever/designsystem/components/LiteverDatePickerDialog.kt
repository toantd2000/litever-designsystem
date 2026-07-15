package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
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
import androidx.compose.foundation.layout.ColumnScope
import vn.io.litever.designsystem.theme.LiteverShapes
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * A wrapper around Material 3's [DatePickerDialog] that integrates with Litever design tokens
 * and strictly preserves CompositionLocals.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverDatePickerDialog(
    onDismissRequest: () -> Unit,
    confirmButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dismissButton: @Composable (() -> Unit)? = null,
    shape: Shape = LiteverShapes.extraLarge,
    containerColor: Color = LiteverTheme.colors.surface,
    tonalElevation: Dp = DatePickerDefaults.TonalElevation,
    properties: DialogProperties = DialogProperties(usePlatformDefaultWidth = false),
    content: @Composable ColumnScope.() -> Unit
) {
    val context = LocalContext.current
    val configuration = LocalConfiguration.current
    val layoutDirection = LocalLayoutDirection.current

    val provideLocals: @Composable (@Composable () -> Unit) -> Unit = { innerContent ->
        CompositionLocalProvider(
            LocalContext provides context,
            LocalConfiguration provides configuration,
            LocalLayoutDirection provides layoutDirection
        ) {
            innerContent()
        }
    }

    provideLocals {
        DatePickerDialog(
            onDismissRequest = onDismissRequest,
            confirmButton = confirmButton,
            modifier = modifier,
            dismissButton = dismissButton,
            shape = shape,
            tonalElevation = tonalElevation,
            colors = DatePickerDefaults.colors(
                containerColor = containerColor,
            ),
            properties = properties,
            content = content
        )
    }
}

/**
 * A variant of [LiteverDatePickerDialog] that automatically provides [LiteverButton]
 * and [LiteverOutlinedButton] for the confirm and dismiss actions.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverDatePickerDialog(
    onDismissRequest: () -> Unit,
    confirmButtonText: String,
    onConfirmClick: () -> Unit,
    modifier: Modifier = Modifier,
    dismissButtonText: String? = null,
    onDismissClick: (() -> Unit)? = null,
    shape: Shape = LiteverShapes.extraLarge,
    containerColor: Color = LiteverTheme.colors.surface,
    tonalElevation: Dp = DatePickerDefaults.TonalElevation,
    properties: DialogProperties = DialogProperties(usePlatformDefaultWidth = false),
    content: @Composable ColumnScope.() -> Unit
) {
    LiteverDatePickerDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            LiteverButton(onClick = onConfirmClick) {
                Text(text = confirmButtonText)
            }
        },
        modifier = modifier,
        dismissButton = dismissButtonText?.let {
            {
                LiteverOutlinedButton(onClick = onDismissClick ?: onDismissRequest) {
                    Text(text = it)
                }
            }
        },
        shape = shape,
        containerColor = containerColor,
        tonalElevation = tonalElevation,
        properties = properties,
        content = content
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LiteverDatePickerDialogPreview() {
    LiteverTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            val state = rememberDatePickerState()
            LiteverDatePickerDialog(
                onDismissRequest = {},
                confirmButtonText = "OK",
                onConfirmClick = {},
                dismissButtonText = "Cancel"
            ) {
                DatePicker(state = state)
            }
        }
    }
}
