package vn.io.litever.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
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
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = IconButtonDefaults.iconButtonColors(),
    interactionSource: MutableInteractionSource? = null,
    shape: Shape = LiteverTheme.shapes.medium,
    content: @Composable () -> Unit,
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        interactionSource = interactionSource,
        shape = shape,
        content = content
    )
}

@JvmOverloads
@Composable
fun LiteverFilledIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = LiteverTheme.shapes.medium,
    colors: IconButtonColors = IconButtonDefaults.filledIconButtonColors(),
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit,
) {
    FilledIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        interactionSource = interactionSource,
        content = content,
    )
}

@Composable
fun LiteverFilledTonalIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = LiteverTheme.shapes.medium,
    colors: IconButtonColors = IconButtonDefaults.filledTonalIconButtonColors(),
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit,
) {
    FilledTonalIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        interactionSource = interactionSource,
        content = content
    )
}

@Composable
fun LiteverOutlinedIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = LiteverTheme.shapes.medium,
    colors: IconButtonColors = IconButtonDefaults.outlinedIconButtonColors(),
    border: BorderStroke? = IconButtonDefaults.outlinedIconButtonBorder(enabled),
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit,
) {
    OutlinedIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        border = border,
        interactionSource = interactionSource,
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
