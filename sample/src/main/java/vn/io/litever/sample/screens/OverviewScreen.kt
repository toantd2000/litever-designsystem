package vn.io.litever.sample.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vn.io.litever.designsystem.components.*
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.utils.LocalAppStrings

@Composable
fun OverviewScreen(modifier: Modifier = Modifier) {
    val strings = LocalAppStrings.current
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(LiteverTheme.spacing.medium)
    ) {
        // Hero Section
        LiteverCard(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Column(modifier = Modifier.padding(LiteverTheme.spacing.mediumLarge)) {
                LiteverLogo(fontSize = 40.sp)
                Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                Text(
                    text = strings.welcomeTitle,
                    style = LiteverTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(LiteverTheme.spacing.extraSmall))
                Text(
                    text = strings.welcomeDesc,
                    style = LiteverTheme.typography.bodyMedium,
                )
            }
        }

        Spacer(modifier = Modifier.height(LiteverTheme.spacing.medium))

        Text(
            text = strings.featuresTitle,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.onBackground,
            modifier = Modifier.padding(vertical = LiteverTheme.spacing.small)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(LiteverTheme.spacing.smallMedium)
        ) {
            LiteverElevatedCard(
                modifier = Modifier.weight(1f)
            ) {
                Column(modifier = Modifier.padding(LiteverTheme.spacing.smallMedium)) {
                    Icon(
                        Icons.Rounded.Palette,
                        contentDescription = null,
                        tint = LiteverTheme.colors.primary
                    )
                    Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                    Text(
                        strings.colorsTitle,
                        style = LiteverTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        strings.colorsDesc,
                        style = LiteverTheme.typography.bodySmall,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )
                }
            }

            LiteverOutlinedCard(
                modifier = Modifier.weight(1f)
            ) {
                Column(modifier = Modifier.padding(LiteverTheme.spacing.smallMedium)) {
                    Icon(
                        Icons.Rounded.TextFormat,
                        contentDescription = null,
                        tint = LiteverTheme.colors.primary
                    )
                    Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                    Text(
                        strings.typeTitle,
                        style = LiteverTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        strings.typeDesc,
                        style = LiteverTheme.typography.bodySmall,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(LiteverTheme.spacing.smallMedium))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(LiteverTheme.spacing.smallMedium)
        ) {
            LiteverCard(
                modifier = Modifier.weight(1f)
            ) {
                Column(modifier = Modifier.padding(LiteverTheme.spacing.smallMedium)) {
                    Icon(
                        Icons.Rounded.SpaceBar,
                        contentDescription = null,
                        tint = LiteverTheme.colors.primary
                    )
                    Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                    Text(
                        strings.spacingTitle,
                        style = LiteverTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        strings.spacingDesc,
                        style = LiteverTheme.typography.bodySmall,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )
                }
            }

            LiteverCard(
                modifier = Modifier.weight(1f),
                shape = LiteverTheme.shapes.extraLarge,
                colors = CardDefaults.cardColors(
                    containerColor = LiteverTheme.colors.secondaryContainer.copy(alpha = 0.4f)
                )
            ) {
                Column(modifier = Modifier.padding(LiteverTheme.spacing.smallMedium)) {
                    Icon(
                        Icons.Rounded.RoundedCorner,
                        contentDescription = null,
                        tint = LiteverTheme.colors.secondary
                    )
                    Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                    Text(
                        strings.shapesTitle,
                        style = LiteverTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        strings.shapesDesc,
                        style = LiteverTheme.typography.bodySmall,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(LiteverTheme.spacing.medium))

        // Quick Tip
        LiteverCard(
            modifier = Modifier.fillMaxWidth(),
            border = BorderStroke(1.dp, LiteverTheme.colors.outlineVariant)
        ) {
            Row(
                modifier = Modifier.padding(LiteverTheme.spacing.medium),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Rounded.Lightbulb,
                    contentDescription = null,
                    modifier = Modifier.size(LiteverTheme.spacing.extraLarge)
                )
                Spacer(modifier = Modifier.width(LiteverTheme.spacing.medium))
                Column {
                    Text(
                        strings.tipTitle,
                        style = LiteverTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = strings.tipDesc,
                        style = LiteverTheme.typography.bodyMedium,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(LiteverTheme.spacing.tripleLarge + LiteverTheme.spacing.medium))
    }
}

@Preview(showBackground = true, name = "Overview Light Mode")
@Composable
fun OverviewScreenLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(color = LiteverTheme.colors.background) {
            OverviewScreen()
        }
    }
}

@Preview(showBackground = true, name = "Overview Dark Mode")
@Composable
fun OverviewScreenDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(color = LiteverTheme.colors.background) {
            OverviewScreen()
        }
    }
}
