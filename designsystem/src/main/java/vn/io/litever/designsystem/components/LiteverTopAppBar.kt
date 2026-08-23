package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import vn.io.litever.designsystem.R
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * Navigation icon types for [LiteverTopAppBar].
 */
enum class LiteverNavigationIconType {
    Back, Close, Menu
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    navigationIconType: LiteverNavigationIconType = LiteverNavigationIconType.Back,
    onNavigationClick: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    LiteverTopAppBar(
        title = { LiteverTopAppBarTitle(title, subtitle) },
        modifier = modifier,
        navigationIcon = {
            LiteverTopAppBarNavigationIcon(navigationIconType, onNavigationClick)
        },
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    TopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverCenterAlignedTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    navigationIconType: LiteverNavigationIconType = LiteverNavigationIconType.Back,
    onNavigationClick: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    LiteverCenterAlignedTopAppBar(
        title = { LiteverTopAppBarTitle(title, subtitle) },
        modifier = modifier,
        navigationIcon = {
            LiteverTopAppBarNavigationIcon(navigationIconType, onNavigationClick)
        },
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverCenterAlignedTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    CenterAlignedTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverMediumTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    navigationIconType: LiteverNavigationIconType = LiteverNavigationIconType.Back,
    onNavigationClick: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    LiteverMediumTopAppBar(
        title = { LiteverTopAppBarTitle(title, subtitle) },
        modifier = modifier,
        navigationIcon = {
            LiteverTopAppBarNavigationIcon(navigationIconType, onNavigationClick)
        },
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverMediumTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    MediumTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverLargeTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    navigationIconType: LiteverNavigationIconType = LiteverNavigationIconType.Back,
    onNavigationClick: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    LiteverLargeTopAppBar(
        title = { LiteverTopAppBarTitle(title, subtitle) },
        modifier = modifier,
        navigationIcon = {
            LiteverTopAppBarNavigationIcon(navigationIconType, onNavigationClick)
        },
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverLargeTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    LargeTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        windowInsets = windowInsets,
        colors = colors,
        scrollBehavior = scrollBehavior
    )
}

@Composable
private fun LiteverTopAppBarTitle(
    title: String,
    subtitle: String? = null
) {
    Column {
        Text(
            text = title,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        if (subtitle != null) {
            Text(
                text = subtitle,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
private fun LiteverTopAppBarNavigationIcon(
    type: LiteverNavigationIconType,
    onClick: (() -> Unit)?
) {
    if (onClick != null) {
        val icon: ImageVector
        val contentDescriptionRes: Int
        
        when (type) {
            LiteverNavigationIconType.Back -> {
                icon = Icons.AutoMirrored.Rounded.ArrowBack
                contentDescriptionRes = R.string.action_back
            }
            LiteverNavigationIconType.Close -> {
                icon = Icons.Rounded.Close
                contentDescriptionRes = R.string.action_close
            }
            LiteverNavigationIconType.Menu -> {
                icon = Icons.Rounded.Menu
                contentDescriptionRes = R.string.action_menu
            }
        }
        
        LiteverIconButton(onClick = onClick) {
            Icon(
                imageVector = icon,
                contentDescription = stringResource(contentDescriptionRes)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, name = "TopAppBar Variants")
@Composable
fun LiteverTopAppBarPreview() {
    LiteverTheme {
        Column {
            LiteverTopAppBar(
                title = "Small TopAppBar",
                subtitle = "With subtitle",
                onNavigationClick = {}
            )
            LiteverCenterAlignedTopAppBar(
                title = "Center Aligned",
                navigationIconType = LiteverNavigationIconType.Close,
                onNavigationClick = {},
                actions = {
                    LiteverIconButton(onClick = {}) {
                        Icon(Icons.Rounded.MoreVert, contentDescription = null)
                    }
                }
            )
            LiteverMediumTopAppBar(
                title = "Medium TopAppBar",
                onNavigationClick = {},
                navigationIconType = LiteverNavigationIconType.Menu
            )
            LiteverLargeTopAppBar(
                title = "Large TopAppBar",
                onNavigationClick = {}
            )
        }
    }
}
