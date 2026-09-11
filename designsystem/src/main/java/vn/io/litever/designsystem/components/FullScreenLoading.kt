package vn.io.litever.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import vn.io.litever.designsystem.theme.LiteverSpacing
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * Standardized full-screen loading composable.
 *
 * @param modifier Modifier applied to the outer container.
 * @param message Optional status message displayed beneath the loading indicator.
 * @param containerColor Background color for the loading screen. Defaults to theme background.
 * @param indicatorColor Color for the circular progress indicator.
 * @param indicatorSize Diameter of the indicator. Defaults to 48.dp.
 * @param strokeWidth Stroke width of the circular progress indicator. Defaults to 4.dp.
 * @param indicator Custom indicator composable slot, overriding default circular progress.
 */
@Composable
fun FullScreenLoading(
    modifier: Modifier = Modifier,
    message: String? = null,
    containerColor: Color = MaterialTheme.colorScheme.background,
    indicatorColor: Color = MaterialTheme.colorScheme.primary,
    indicatorSize: Dp = LiteverSpacing().doubleLarge,
    strokeWidth: Dp = LiteverSpacing().extraSmall,
    indicator: @Composable (() -> Unit)? = null,
) {
    val spacing = LiteverTheme.spacing

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(containerColor)
            .pointerInput(Unit) {
                awaitPointerEventScope {
                    while (true) {
                        val event = awaitPointerEvent(PointerEventPass.Initial)
                        event.changes.forEach { it.consume() }
                    }
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(spacing.large)
        ) {
            if (indicator != null) {
                indicator()
            } else {
                CircularProgressIndicator(
                    modifier = Modifier.size(indicatorSize),
                    color = indicatorColor,
                    strokeWidth = strokeWidth
                )
            }

            if (!message.isNullOrBlank()) {
                Spacer(modifier = Modifier.height(spacing.medium))
                Text(
                    text = message,
                    style = LiteverTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "Full Screen Loading - Light")
@Composable
fun FullScreenLoadingPreview() {
    LiteverTheme(darkTheme = false) {
        Surface {
            FullScreenLoading(message = "Synchronizing your data...")
        }
    }
}

@Preview(showBackground = true, name = "Full Screen Loading - Dark")
@Composable
fun FullScreenLoadingDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface {
            FullScreenLoading(message = "Loading...")
        }
    }
}
