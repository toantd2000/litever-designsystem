package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.R
import vn.io.litever.designsystem.theme.LiteverTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    onBackClick: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {}
) {
    LiteverTopAppBar(
        titleContent = {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge
            )
        },
        modifier = modifier,
        onBackClick = onBackClick,
        actions = actions
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteverTopAppBar(
    titleContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    onBackClick: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {}
) {
    TopAppBar(
        title = titleContent,
        navigationIcon = {
            if (onBackClick != null) {
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = stringResource(R.string.action_back)
                    )
                }
            }
        },
        actions = actions,
        modifier = modifier
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverTopAppBarPreview() {
    LiteverTheme(darkTheme = false) {
        Column {
            LiteverTopAppBar(
                title = "Page Title",
                onBackClick = {},
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Rounded.MoreVert, contentDescription = null)
                    }
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            LiteverTopAppBar(
                title = "No Back Button"
            )
        }
    }
}
