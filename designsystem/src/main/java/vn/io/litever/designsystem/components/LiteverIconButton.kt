package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverIcons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.automirrored.rounded.*
import vn.io.litever.designsystem.theme.LiteverTheme

import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.remember

@Composable
fun LiteverIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = IconButtonDefaults.iconButtonColors(
        contentColor = LiteverTheme.colors.onSurfaceVariant
    ),
    shape: Shape = LiteverTheme.shapes.medium,
    content: @Composable () -> Unit
) {
    Surface(
        onClick = onClick,
        modifier = modifier.size(40.dp),
        enabled = enabled,
        shape = shape,
        color = colors.containerColor,
        contentColor = colors.contentColor
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = androidx.compose.ui.Alignment.Center
        ) {
            content()
        }
    }
}

@Composable
fun LiteverFilledIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = IconButtonDefaults.filledIconButtonColors(
        containerColor = LiteverTheme.colors.primary,
        contentColor = LiteverTheme.colors.onPrimary
    ),
    shape: Shape = LiteverTheme.shapes.medium,
    content: @Composable () -> Unit
) {
    FilledIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        shape = shape,
        content = content
    )
}

@Composable
fun LiteverFilledTonalIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = IconButtonDefaults.filledTonalIconButtonColors(
        containerColor = LiteverTheme.colors.secondaryContainer,
        contentColor = LiteverTheme.colors.onSecondaryContainer
    ),
    shape: Shape = LiteverTheme.shapes.medium,
    content: @Composable () -> Unit
) {
    FilledTonalIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        shape = shape,
        content = content
    )
}

@Composable
fun LiteverOutlinedIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = IconButtonDefaults.outlinedIconButtonColors(
        contentColor = LiteverTheme.colors.onSurfaceVariant
    ),
    shape: Shape = LiteverTheme.shapes.medium,
    content: @Composable () -> Unit
) {
    OutlinedIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        shape = shape,
        content = content
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverIconButtonPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(modifier = Modifier.padding(16.dp)) {
            Column {
                Row {
                    LiteverIconButton(onClick = {}) {
                        Icon(LiteverIcons.Rounded.Home, contentDescription = null)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    LiteverFilledIconButton(onClick = {}) {
                        Icon(LiteverIcons.Rounded.Add, contentDescription = null)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    LiteverFilledTonalIconButton(onClick = {}) {
                        Icon(LiteverIcons.Rounded.Settings, contentDescription = null)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    LiteverOutlinedIconButton(onClick = {}) {
                        Icon(LiteverIcons.Rounded.Person, contentDescription = null)
                    }
                }
            }
        }
    }
}
