package vn.io.litever.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverSettingsCategory(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        style = LiteverTheme.typography.labelLarge,
        color = LiteverTheme.colors.primary,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = LiteverTheme.spacing.small)
    )
}

@Composable
fun LiteverSettingsItem(
    title: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    subtitle: String? = null,
    statusText: String? = null,
    statusColor: Color? = null,
    enabled: Boolean = true,
    alpha: Float = if (enabled) 1f else 0.38f,
    onClick: (() -> Unit)? = null,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    ListItem(
        headlineContent = {
            Column {
                Text(
                    text = title,
                    style = LiteverTheme.typography.bodyLarge,
                    color = LiteverTheme.colors.onSurface.copy(alpha = alpha)
                )
                if (statusText != null) {
                    Text(
                        text = statusText,
                        style = LiteverTheme.typography.labelMedium,
                        color = (statusColor ?: LiteverTheme.colors.primary).copy(alpha = alpha),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        },
        supportingContent = subtitle?.let {
            {
                Text(
                    text = it,
                    style = LiteverTheme.typography.bodyMedium,
                    color = LiteverTheme.colors.onSurfaceVariant.copy(alpha = alpha)
                )
            }
        },
        leadingContent = icon?.let {
            {
                Icon(
                    imageVector = it,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    tint = LiteverTheme.colors.onSurfaceVariant.copy(alpha = alpha)
                )
            }
        },
        trailingContent = {
            CompositionLocalProvider(LocalContentColor provides LocalContentColor.current.copy(alpha = alpha)) {
                trailingContent?.invoke()
            }
        },
        colors = ListItemDefaults.colors(
            containerColor = Color.Transparent
        ),
        modifier = modifier
            .fillMaxWidth()
            .then(if (onClick != null) Modifier.clickable(enabled = enabled, onClick = onClick) else Modifier)
    )
}

@Composable
fun LiteverSettingsSwitchItem(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: ImageVector? = null,
    subtitle: String? = null,
) {
    val itemAlpha = when {
        !enabled -> 0.5f
        !checked -> 0.75f
        else -> 1f
    }
    LiteverSettingsItem(
        title = title,
        icon = icon,
        subtitle = subtitle,
        enabled = enabled,
        alpha = itemAlpha,
        trailingContent = {
            LiteverSwitch(
                checked = checked,
                onCheckedChange = onCheckedChange,
                enabled = enabled
            )
        },
        onClick = { onCheckedChange(!checked) },
        modifier = modifier
    )
}

@Composable
fun LiteverSettingsCheckboxItem(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: ImageVector? = null,
    subtitle: String? = null,
) {
    val itemAlpha = when {
        !enabled -> 0.38f
        !checked -> 0.6f
        else -> 1f
    }
    LiteverSettingsItem(
        title = title,
        icon = icon,
        subtitle = subtitle,
        enabled = enabled,
        alpha = itemAlpha,
        trailingContent = {
            LiteverCheckbox(
                checked = checked,
                onCheckedChange = onCheckedChange,
                enabled = enabled
            )
        },
        onClick = { onCheckedChange(!checked) },
        modifier = modifier
    )
}

@Composable
fun LiteverSettingsRadioButtonItem(
    title: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: ImageVector? = null,
    subtitle: String? = null,
) {
    val itemAlpha = when {
        !enabled -> 0.38f
        !selected -> 0.6f
        else -> 1f
    }
    LiteverSettingsItem(
        title = title,
        icon = icon,
        subtitle = subtitle,
        enabled = enabled,
        alpha = itemAlpha,
        trailingContent = {
            LiteverRadioButton(
                selected = selected,
                onClick = onClick,
                enabled = enabled
            )
        },
        onClick = onClick,
        modifier = modifier
    )
}

@Composable
fun LiteverSettingsGroup(
    modifier: Modifier = Modifier,
    title: String? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    val spacing = LiteverTheme.spacing
    Column(modifier = modifier.padding(horizontal = spacing.medium, vertical = spacing.small)) {
        if (title != null) {
            LiteverSettingsCategory(
                title = title,
                modifier = Modifier.padding(horizontal = spacing.extraSmall)
            )
        }
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = LiteverTheme.shapes.medium,
            colors = CardDefaults.cardColors(
                containerColor = LiteverTheme.colors.surfaceVariant.copy(alpha = 0.3f)
            ),
            border = BorderStroke(1.dp, LiteverTheme.colors.outlineVariant.copy(alpha = 0.2f)),
            content = content
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LiteverSettingsPreview() {
    LiteverTheme {
        Surface {
            Column {
                LiteverSettingsGroup(title = "Account") {
                    LiteverSettingsItem(
                        title = "Profile",
                        subtitle = "Manage your profile information",
                        icon = Icons.Rounded.Person,
                        onClick = {}
                    )
                }
                LiteverSettingsGroup(title = "Status & Colors") {
                    LiteverSettingsItem(
                        title = "System Update",
                        subtitle = "A new version is available",
                        statusText = "Update available",
                        statusColor = LiteverTheme.colors.warning,
                        onClick = {}
                    )
                    LiteverSettingsItem(
                        title = "Security Scan",
                        subtitle = "Last scan: 5 minutes ago",
                        statusText = "No threats found",
                        statusColor = LiteverTheme.colors.success,
                        onClick = {}
                    )
                    LiteverSettingsItem(
                        title = "Storage Space",
                        subtitle = "95% of 128GB used",
                        statusText = "Storage almost full",
                        statusColor = LiteverTheme.colors.error,
                        onClick = {}
                    )
                }
                LiteverSettingsGroup(title = "Interactions (On/Off/Disabled)") {
                    LiteverSettingsItem(
                        title = "Language Selection",
                        subtitle = "Choose your preferred language",
                        statusText = "Tiếng Việt (Việt Nam) - Chính thức",
                        onClick = {}
                    )
                    LiteverSettingsSwitchItem(
                        title = "Notifications (On)",
                        subtitle = "This is ON and enabled",
                        icon = Icons.Rounded.Notifications,
                        checked = true,
                        onCheckedChange = {}
                    )
                    LiteverSettingsSwitchItem(
                        title = "Notifications (Off)",
                        subtitle = "This is OFF and enabled (muted look)",
                        icon = Icons.Rounded.Notifications,
                        checked = false,
                        onCheckedChange = {}
                    )
                    LiteverSettingsSwitchItem(
                        title = "Notifications (Disabled)",
                        subtitle = "This is DISABLED (not interactable)",
                        icon = Icons.Rounded.Notifications,
                        checked = true,
                        enabled = false,
                        onCheckedChange = {}
                    )
                    LiteverSettingsCheckboxItem(
                        title = "Experimental (Off)",
                        checked = false,
                        onCheckedChange = {}
                    )
                    LiteverSettingsRadioButtonItem(
                        title = "Option (Off)",
                        selected = false,
                        onClick = {}
                    )
                }
            }
        }
    }
}
