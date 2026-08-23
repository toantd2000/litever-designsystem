package vn.io.litever.sample.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vn.io.litever.designsystem.components.*
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.utils.LocalAppStrings

@Composable
fun ListsScreen(modifier: Modifier = Modifier) {
    val strings = LocalAppStrings.current
    var notificationsChecked by remember { mutableStateOf(true) }
    var locationChecked by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(LiteverTheme.spacing.medium)
    ) {
        // Section: LiteverListItem
        Text(
            text = strings.listHeader,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.secondary,
            modifier = Modifier.padding(bottom = LiteverTheme.spacing.small)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column {
                LiteverListItem(
                    headlineContent = { Text(strings.standardListItem, fontWeight = FontWeight.Bold) },
                    supportingContent = { Text(strings.standardListDesc) },
                    leadingContent = { Icon(Icons.Rounded.Star, contentDescription = null) },
                    trailingContent = { Icon(Icons.Rounded.ChevronRight, contentDescription = null) },
                    onClick = {
                        Toast.makeText(context, strings.standardListItem + "!", Toast.LENGTH_SHORT).show()
                    }
                )
                LiteverHorizontalDivider(color = LiteverTheme.colors.outlineVariant.copy(alpha = 0.5f), thickness = 0.5.dp)

                LiteverListItem(
                    headlineContent = { Text(strings.badgeListItem) },
                    supportingContent = { Text(strings.badgeListDesc) },
                    leadingContent = { Icon(Icons.Rounded.Notifications, contentDescription = null) },
                    trailingContent = {
                        Box(
                            modifier = Modifier
                                .clip(LiteverTheme.shapes.extraSmall)
                                .background(LiteverTheme.colors.error)
                                .padding(horizontal = 6.dp, vertical = LiteverTheme.spacing.tiny)
                        ) {
                            Text("NEW", color = LiteverTheme.colors.onError, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                    },
                    onClick = {}
                )
            }
        }

        Spacer(modifier = Modifier.height(LiteverTheme.spacing.mediumLarge))

        // Section: LiteverSettingsGroup
        Text(
            text = strings.settingsHeader,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.secondary,
            modifier = Modifier.padding(bottom = LiteverTheme.spacing.small)
        )

        LiteverSettingsGroup(title = strings.accountGroup) {
            LiteverSettingsItem(
                title = strings.profileTitle,
                subtitle = strings.profileDesc,
                icon = Icons.Rounded.Person,
                onClick = {
                    Toast.makeText(context, strings.profileTitle + "!", Toast.LENGTH_SHORT).show()
                }
            )
            LiteverSettingsItem(
                title = strings.passwordTitle,
                subtitle = strings.passwordDesc,
                icon = Icons.Rounded.Lock,
                statusText = strings.securityLevel,
                onClick = {}
            )
        }

        Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))

        LiteverSettingsGroup(title = strings.generalGroup) {
            LiteverSettingsSwitchItem(
                title = strings.notificationTitle,
                subtitle = strings.notificationDesc,
                icon = Icons.Rounded.NotificationsActive,
                checked = notificationsChecked,
                onCheckedChange = { notificationsChecked = it }
            )
            LiteverSettingsSwitchItem(
                title = strings.locationTitle,
                subtitle = strings.locationDesc,
                icon = Icons.Rounded.LocationOn,
                checked = locationChecked,
                onCheckedChange = { locationChecked = it }
            )
        }

        Spacer(modifier = Modifier.height(LiteverTheme.spacing.tripleLarge + LiteverTheme.spacing.medium))
    }
}

@Preview(showBackground = true, name = "Lists Light Mode")
@Composable
fun ListsScreenLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(color = LiteverTheme.colors.background) {
            ListsScreen()
        }
    }
}

@Preview(showBackground = true, name = "Lists Dark Mode")
@Composable
fun ListsScreenDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(color = LiteverTheme.colors.background) {
            ListsScreen()
        }
    }
}
