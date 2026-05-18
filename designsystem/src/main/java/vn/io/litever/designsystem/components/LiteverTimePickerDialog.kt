package vn.io.litever.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import vn.io.litever.designsystem.R
import vn.io.litever.designsystem.theme.LiteverShapes
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverTimePickerDialog(
    onDismissRequest: () -> Unit,
    confirmButton: @Composable () -> Unit,
    title: String = stringResource(R.string.select_time),
    dismissButton: @Composable (() -> Unit)? = null,
    containerColor: Color = LiteverTheme.colors.surface,
    tonalElevation: Dp = AlertDialogDefaults.TonalElevation,
    content: @Composable () -> Unit
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            shape = LiteverShapes.extraLarge,
            tonalElevation = tonalElevation,
            modifier = Modifier
                .width(IntrinsicSize.Max)
                .height(IntrinsicSize.Min),
            color = containerColor
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    text = title,
                    style = MaterialTheme.typography.headlineSmall
                )
                content()
                Row(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.End),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    dismissButton?.invoke()
                    confirmButton()
                }
            }
        }
    }
}

@Composable
fun LiteverTimePickerDialog(
    onDismissRequest: () -> Unit,
    confirmButtonText: String,
    onConfirmClick: () -> Unit,
    modifier: Modifier = Modifier,
    title: String = stringResource(R.string.select_time),
    dismissButtonText: String? = null,
    onDismissClick: (() -> Unit)? = null,
    containerColor: Color = LiteverTheme.colors.surface,
    tonalElevation: Dp = AlertDialogDefaults.TonalElevation,
    content: @Composable () -> Unit
) {
    LiteverTimePickerDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            LiteverButton(onClick = onConfirmClick) {
                Text(text = confirmButtonText)
            }
        },
        title = title,
        dismissButton = dismissButtonText?.let {
            {
                LiteverOutlinedButton(onClick = onDismissClick ?: onDismissRequest) {
                    Text(text = it)
                }
            }
        },
        containerColor = containerColor,
        tonalElevation = tonalElevation,
        content = content
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LiteverTimePickerDialogPreview() {
    LiteverTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            val state = rememberTimePickerState()
            LiteverTimePickerDialog(
                onDismissRequest = {},
                confirmButton = { TextButton(onClick = {}) { Text("OK") } },
                dismissButton = { TextButton(onClick = {}) { Text("Cancel") } }
            ) {
                TimePicker(state = state)
            }
        }
    }
}
