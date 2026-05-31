package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverIcons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.automirrored.rounded.*
import vn.io.litever.designsystem.theme.LiteverTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverBadge(
    modifier: Modifier = Modifier,
    containerColor: Color = LiteverTheme.colors.error,
    contentColor: Color = LiteverTheme.colors.onError,
    content: @Composable (RowScope.() -> Unit)? = null
) {
    Badge(
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
        content = content
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverBadgedBox(
    badge: @Composable BoxScope.() -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    BadgedBox(
        badge = badge,
        modifier = modifier,
        content = content
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LiteverBadgePreview() {
    LiteverTheme(darkTheme = false) {
        Surface(modifier = Modifier.padding(16.dp)) {
            androidx.compose.foundation.layout.Row(horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(16.dp)) {
                LiteverBadgedBox(
                    badge = {
                        LiteverBadge()
                    }
                ) {
                    Icon(LiteverIcons.Rounded.Email, contentDescription = null)
                }

                LiteverBadgedBox(
                    badge = {
                        LiteverBadge {
                            Text("99+")
                        }
                    }
                ) {
                    Icon(LiteverIcons.Rounded.Notifications, contentDescription = null)
                }
            }
        }
    }
}
