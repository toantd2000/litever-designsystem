package vn.io.litever.sample.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.components.LiteverCard
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.utils.LocalAppStrings

@Composable
fun TokensScreen(modifier: Modifier = Modifier) {
    val strings = LocalAppStrings.current
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Section: M3 Theme Colors
        Text(
            text = strings.m3ColorsHeader,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(8.dp)) {
                DemoColorSwatch("Primary", LiteverTheme.colors.primary, LiteverTheme.colors.onPrimary)
                DemoColorSwatch("Primary Container", LiteverTheme.colors.primaryContainer, LiteverTheme.colors.onPrimaryContainer)
                DemoColorSwatch("Secondary", LiteverTheme.colors.secondary, LiteverTheme.colors.onSecondary)
                DemoColorSwatch("Secondary Container", LiteverTheme.colors.secondaryContainer, LiteverTheme.colors.onSecondaryContainer)
                DemoColorSwatch("Tertiary", LiteverTheme.colors.tertiary, LiteverTheme.colors.onTertiary)
                DemoColorSwatch("Tertiary Container", LiteverTheme.colors.tertiaryContainer, LiteverTheme.colors.onTertiaryContainer)
                DemoColorSwatch("Background", LiteverTheme.colors.background, LiteverTheme.colors.onBackground)
                DemoColorSwatch("Surface", LiteverTheme.colors.surface, LiteverTheme.colors.onSurface)
                DemoColorSwatch("Surface Variant", LiteverTheme.colors.surfaceVariant, LiteverTheme.colors.onSurfaceVariant)
                DemoColorSwatch("Error", LiteverTheme.colors.error, LiteverTheme.colors.onError)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Section: Custom Colors
        Text(
            text = strings.customColorsHeader,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(8.dp)) {
                DemoColorSwatch("Success", LiteverTheme.colors.success, LiteverTheme.colors.onSuccess)
                DemoColorSwatch("Success Container", LiteverTheme.colors.successContainer, LiteverTheme.colors.onSuccessContainer)
                DemoColorSwatch("Warning", LiteverTheme.colors.warning, LiteverTheme.colors.onWarning)
                DemoColorSwatch("Warning Container", LiteverTheme.colors.warningContainer, LiteverTheme.colors.onWarningContainer)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Section: Spacing, Shapes, Typography Info
        Text(
            text = strings.spacingHeader,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                SpacingItemRow("extraSmall", "${LiteverTheme.spacing.extraSmall}", LiteverTheme.spacing.extraSmall)
                SpacingItemRow("small", "${LiteverTheme.spacing.small}", LiteverTheme.spacing.small)
                SpacingItemRow("medium", "${LiteverTheme.spacing.medium} (${strings.defaultText})", LiteverTheme.spacing.medium)
                SpacingItemRow("large", "${LiteverTheme.spacing.large}", LiteverTheme.spacing.large)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = strings.shapesHeader,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                ShapeItemRow("small", "4.dp", LiteverTheme.shapes.small)
                ShapeItemRow("medium", "6.dp", LiteverTheme.shapes.medium)
                ShapeItemRow("large", "8.dp", LiteverTheme.shapes.large)
                ShapeItemRow("extraLarge", "10.dp", LiteverTheme.shapes.extraLarge)
            }
        }

        Spacer(modifier = Modifier.height(80.dp))
    }
}

@Composable
fun DemoColorSwatch(name: String, color: Color, onColor: Color) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(vertical = 2.dp)
            .clip(LiteverTheme.shapes.small),
        color = color,
        contentColor = onColor,
        border = BorderStroke(0.5.dp, LiteverTheme.colors.outlineVariant)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = name, style = LiteverTheme.typography.bodyLarge, fontWeight = FontWeight.Bold)
            Text(
                text = String.format("#%08X", color.toArgb()),
                style = LiteverTheme.typography.bodyMedium,
                color = onColor.copy(alpha = 0.8f)
            )
        }
    }
}

@Composable
fun SpacingItemRow(name: String, valueText: String, dpValue: androidx.compose.ui.unit.Dp) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.width(140.dp)) {
            Text(name, fontWeight = FontWeight.Bold, style = LiteverTheme.typography.bodyLarge)
            Text(valueText, style = LiteverTheme.typography.bodySmall, color = LiteverTheme.colors.onSurfaceVariant)
        }
        Box(
            modifier = Modifier
                .height(16.dp)
                .width(dpValue)
                .background(LiteverTheme.colors.primary)
        )
    }
}

@Composable
fun ShapeItemRow(name: String, valueText: String, shape: androidx.compose.ui.graphics.Shape) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.width(140.dp)) {
            Text(name, fontWeight = FontWeight.Bold, style = LiteverTheme.typography.bodyLarge)
            Text(valueText, style = LiteverTheme.typography.bodySmall, color = LiteverTheme.colors.onSurfaceVariant)
        }
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(shape)
                .background(LiteverTheme.colors.primaryContainer)
                .border(1.dp, LiteverTheme.colors.primary, shape)
        )
    }
}

@Preview(showBackground = true, name = "Tokens Light Mode")
@Composable
fun TokensScreenLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(color = LiteverTheme.colors.background) {
            TokensScreen()
        }
    }
}

@Preview(showBackground = true, name = "Tokens Dark Mode")
@Composable
fun TokensScreenDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(color = LiteverTheme.colors.background) {
            TokensScreen()
        }
    }
}
