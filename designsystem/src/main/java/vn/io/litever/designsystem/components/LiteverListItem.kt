package vn.io.litever.designsystem.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemColors
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * A generic list item component to replace Material 3's ListItem.
 * Wraps Material 3 ListItem with the app's design tokens.
 */
@Composable
fun LiteverListItem(
    headlineContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    overlineContent: @Composable (() -> Unit)? = null,
    supportingContent: @Composable (() -> Unit)? = null,
    leadingContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (() -> Unit)? = null,
    colors: ListItemColors = ListItemDefaults.colors(containerColor = Color.Transparent),
    onClick: (() -> Unit)? = null
) {
    ListItem(
        headlineContent = headlineContent,
        overlineContent = overlineContent,
        supportingContent = supportingContent,
        leadingContent = leadingContent,
        trailingContent = trailingContent,
        colors = colors,
        modifier = modifier.then(
            if (onClick != null) Modifier.clickable(onClick = onClick) else Modifier
        )
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverListItemPreview() {
    LiteverTheme(darkTheme = false) {
        Surface {
            Column {
                LiteverListItem(
                    headlineContent = { Text("Headline") },
                    supportingContent = { Text("Supporting text") },
                    leadingContent = { Icon(Icons.Default.Star, contentDescription = null) },
                    trailingContent = { Icon(Icons.Default.ChevronRight, contentDescription = null) }
                )
                LiteverListItem(
                    headlineContent = { Text("Clickable Item") },
                    onClick = {}
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "Dark Mode")
@Composable
fun LiteverListItemDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface {
            Column {
                LiteverListItem(
                    headlineContent = { Text("Headline") },
                    supportingContent = { Text("Supporting text") },
                    leadingContent = { Icon(Icons.Default.Star, contentDescription = null) },
                    trailingContent = { Icon(Icons.Default.ChevronRight, contentDescription = null) }
                )
                LiteverListItem(
                    headlineContent = { Text("Clickable Item") },
                    onClick = {}
                )
            }
        }
    }
}
