package vn.io.litever.sample.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.components.*
import vn.io.litever.designsystem.theme.LiteverIcons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.automirrored.rounded.*
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.utils.LocalAppStrings

@Composable
fun AuxiliaryScreen() {
    val strings = LocalAppStrings.current
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        // Chips Section
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Text(
                text = strings.chipsTitle,
                style = LiteverTheme.typography.titleLarge,
                color = LiteverTheme.colors.onBackground
            )
            
            var filterSelected by remember { mutableStateOf(false) }
            
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                LiteverAssistChip(
                    onClick = { },
                    label = { Text("Assist Action") },
                    leadingIcon = { Icon(LiteverIcons.Rounded.Star, contentDescription = null) }
                )
                
                LiteverFilterChip(
                    selected = filterSelected,
                    onClick = { filterSelected = !filterSelected },
                    label = { Text("Filter Item") }
                )
            }
        }
        
        // Badges Section
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Text(
                text = strings.badgesTitle,
                style = LiteverTheme.typography.titleLarge,
                color = LiteverTheme.colors.onBackground
            )
            
            Row(horizontalArrangement = Arrangement.spacedBy(32.dp)) {
                LiteverBadgedBox(
                    badge = { LiteverBadge() }
                ) {
                    Icon(LiteverIcons.Rounded.Email, contentDescription = null)
                }
                
                LiteverBadgedBox(
                    badge = {
                        LiteverBadge { Text("3") }
                    }
                ) {
                    Icon(LiteverIcons.Rounded.Notifications, contentDescription = null)
                }
                
                LiteverBadgedBox(
                    badge = {
                        LiteverBadge { Text("99+") }
                    }
                ) {
                    Icon(LiteverIcons.Rounded.Message, contentDescription = null)
                }
            }
        }
        
        // Dividers Section
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Text(
                text = strings.dividersTitle,
                style = LiteverTheme.typography.titleLarge,
                color = LiteverTheme.colors.onBackground
            )
            
            LiteverCard {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Item 1")
                    Spacer(modifier = Modifier.height(8.dp))
                    LiteverHorizontalDivider()
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Item 2")
                    Spacer(modifier = Modifier.height(8.dp))
                    LiteverHorizontalDivider()
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Item 3")
                }
            }
            
            LiteverCard {
                Row(
                    modifier = Modifier.padding(16.dp).height(50.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text("Left")
                    LiteverVerticalDivider()
                    Text("Right")
                }
            }
        }
    }
}
