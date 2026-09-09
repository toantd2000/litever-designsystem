package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.WifiOff
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * Standardized warning banner composable indicating network disconnection or offline state.
 *
 * @param modifier The modifier to apply to this banner.
 * @param message Primary warning message. Defaults to "No internet connection".
 * @param description Optional secondary description explaining the offline status.
 * @param icon The leading icon to display. Defaults to [Icons.Rounded.WifiOff].
 * @param shape Shape of the banner surface. Defaults to [LiteverTheme.shapes.small].
 * @param containerColor Background color of the banner. Defaults to [LiteverTheme.colors.warningContainer].
 * @param contentColor Text and icon color. Defaults to [LiteverTheme.colors.onWarningContainer].
 * @param onRetry Optional callback triggered when user taps the retry button.
 * @param retryLabel Label text for the retry button. Defaults to "Retry".
 * @param action Optional composable slot for custom actions, taking precedence over [onRetry].
 */
@Composable
fun OfflineWarning(
    modifier: Modifier = Modifier,
    message: String = "No internet connection",
    description: String? = null,
    icon: ImageVector? = Icons.Rounded.WifiOff,
    shape: Shape = LiteverTheme.shapes.small,
    containerColor: Color = LiteverTheme.colors.warningContainer,
    contentColor: Color = LiteverTheme.colors.onWarningContainer,
    onRetry: (() -> Unit)? = null,
    retryLabel: String = "Retry",
    action: @Composable (() -> Unit)? = null,
) {
    val spacing = LiteverTheme.spacing

    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = shape,
        color = containerColor,
        contentColor = contentColor,
        tonalElevation = 0.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = spacing.medium,
                    vertical = spacing.smallMedium
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (icon != null) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        modifier = Modifier.size(spacing.large),
                        tint = contentColor
                    )
                    Spacer(modifier = Modifier.width(spacing.smallMedium))
                }

                Column {
                    Text(
                        text = message,
                        style = LiteverTheme.typography.labelLarge,
                        fontWeight = FontWeight.SemiBold,
                        color = contentColor
                    )
                    if (!description.isNullOrBlank()) {
                        Text(
                            text = description,
                            style = LiteverTheme.typography.bodySmall,
                            color = contentColor.copy(alpha = 0.85f)
                        )
                    }
                }
            }

            when {
                action != null -> {
                    Spacer(modifier = Modifier.width(spacing.small))
                    action()
                }
                onRetry != null -> {
                    Spacer(modifier = Modifier.width(spacing.small))
                    TextButton(
                        onClick = onRetry,
                        colors = ButtonDefaults.textButtonColors(contentColor = contentColor)
                    ) {
                        Text(
                            text = retryLabel,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Offline Warning - Light")
@Composable
fun OfflineWarningPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(modifier = Modifier.padding(16.dp)) {
            OfflineWarning(
                description = "Changes will be saved locally and synced once reconnected.",
                onRetry = {}
            )
        }
    }
}

@Preview(showBackground = true, name = "Offline Warning - Dark")
@Composable
fun OfflineWarningDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(modifier = Modifier.padding(16.dp)) {
            OfflineWarning(
                description = "Changes will be saved locally and synced once reconnected.",
                onRetry = {}
            )
        }
    }
}
