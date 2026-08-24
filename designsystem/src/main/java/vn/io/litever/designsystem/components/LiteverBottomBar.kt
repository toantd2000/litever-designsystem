package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * A flexible bottom bar container with Litever styling.
 * Typically used in the bottomBar slot of a Scaffold.
 * Automatically handles IME (keyboard) insets to stay visible above the keyboard.
 */
@Composable
fun LiteverBottomBar(
    modifier: Modifier = Modifier,
    containerColor: Color = LiteverTheme.colors.surfaceContainer,
    contentColor: Color = contentColorFor(containerColor),
    tonalElevation: Dp = 3.dp,
    windowInsets: WindowInsets = NavigationBarDefaults.windowInsets.union(WindowInsets.ime),
    content: @Composable () -> Unit
) {
    Surface(
        color = containerColor,
        contentColor = contentColor,
        tonalElevation = tonalElevation,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsPadding(windowInsets)
                .padding(horizontal = LiteverTheme.spacing.medium, vertical = LiteverTheme.spacing.small),
            contentAlignment = Alignment.CenterStart
        ) {
            content()
        }
    }
}

/**
 * A specialized bottom bar for common screen actions (e.g., Save, Cancel).
 * Features a secondary button (wrap content, outlined) and a primary button (weight 1, filled).
 * Buttons are sized larger (48dp height) with bold text for better accessibility and emphasis.
 */
@Composable
fun LiteverActionButtonBar(
    primaryText: String,
    onPrimaryClick: () -> Unit,
    modifier: Modifier = Modifier,
    secondaryText: String? = null,
    onSecondaryClick: (() -> Unit)? = null,
    primaryEnabled: Boolean = true,
    secondaryEnabled: Boolean = true,
    containerColor: Color = LiteverTheme.colors.surfaceContainer,
    windowInsets: WindowInsets = NavigationBarDefaults.windowInsets.union(WindowInsets.ime),
) {
    val buttonHeight = 48.dp
    val textStyle = LiteverTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
    
    LiteverBottomBar(
        modifier = modifier,
        containerColor = containerColor,
        windowInsets = windowInsets
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(LiteverTheme.spacing.small),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (secondaryText != null && onSecondaryClick != null) {
                LiteverOutlinedButton(
                    onClick = onSecondaryClick,
                    enabled = secondaryEnabled,
                    modifier = Modifier
                        .wrapContentWidth()
                        .height(buttonHeight)
                ) {
                    Text(text = secondaryText, style = textStyle)
                }
            }
            LiteverButton(
                onClick = onPrimaryClick,
                enabled = primaryEnabled,
                modifier = Modifier
                    .weight(1f)
                    .height(buttonHeight)
            ) {
                Text(text = primaryText, style = textStyle)
            }
        }
    }
}

@Preview(showBackground = true, name = "Generic Bottom Bar")
@Composable
fun LiteverBottomBarPreview() {
    LiteverTheme {
        LiteverBottomBar {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(LiteverTheme.spacing.small)
            ) {
                LiteverIconButton(onClick = {}) {
                    Text("A")
                }
                LiteverIconButton(onClick = {}) {
                    Text("B")
                }
                LiteverIconButton(onClick = {}) {
                    Text("C")
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Action Button Bar")
@Composable
fun LiteverActionButtonBarPreview() {
    LiteverTheme {
        LiteverActionButtonBar(
            primaryText = "Save Changes",
            onPrimaryClick = {},
            secondaryText = "Cancel",
            onSecondaryClick = {}
        )
    }
}

@Preview(showBackground = true, name = "Action Button Bar (Single)")
@Composable
fun LiteverActionButtonBarSinglePreview() {
    LiteverTheme {
        LiteverActionButtonBar(
            primaryText = "Confirm",
            onPrimaryClick = {}
        )
    }
}
