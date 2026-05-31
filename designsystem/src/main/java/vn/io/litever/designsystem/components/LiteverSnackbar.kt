package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.SnackbarDefaults
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverShapes
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverSnackbar(
    snackbarData: SnackbarData,
    modifier: Modifier = Modifier,
    actionOnNewLine: Boolean = false,
    shape: Shape = LiteverShapes.medium,
    containerColor: Color = LiteverTheme.colors.inverseSurface,
    contentColor: Color = LiteverTheme.colors.inverseOnSurface,
    actionColor: Color = LiteverTheme.colors.inversePrimary,
    dismissActionContentColor: Color = LiteverTheme.colors.inverseOnSurface
) {
    Snackbar(
        snackbarData = snackbarData,
        modifier = modifier.padding(12.dp),
        actionOnNewLine = actionOnNewLine,
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        actionColor = actionColor,
        dismissActionContentColor = dismissActionContentColor
    )
}

@Composable
fun LiteverSnackbarHost(
    hostState: SnackbarHostState,
    modifier: Modifier = Modifier,
    snackbar: @Composable (SnackbarData) -> Unit = { LiteverSnackbar(it) }
) {
    SnackbarHost(
        hostState = hostState,
        modifier = modifier,
        snackbar = snackbar
    )
}
