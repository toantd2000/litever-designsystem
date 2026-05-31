package vn.io.litever.sample.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vn.io.litever.designsystem.components.LiteverCard
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.designsystem.theme.TailwindColors
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

        // Section: Tailwind CSS v4 Colors
        Text(
            text = strings.tailwindColorsHeader,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = strings.tailwindColorsDesc,
            style = LiteverTheme.typography.bodySmall,
            color = LiteverTheme.colors.onSurfaceVariant,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(8.dp)) {
                TailwindColorRow("Teal", listOf(
                    TailwindColors.Teal.c50, TailwindColors.Teal.c100, TailwindColors.Teal.c200,
                    TailwindColors.Teal.c300, TailwindColors.Teal.c400, TailwindColors.Teal.c500,
                    TailwindColors.Teal.c600, TailwindColors.Teal.c700, TailwindColors.Teal.c800,
                    TailwindColors.Teal.c900, TailwindColors.Teal.c950
                ))
                TailwindColorRow("Blue", listOf(
                    TailwindColors.Blue.c50, TailwindColors.Blue.c100, TailwindColors.Blue.c200,
                    TailwindColors.Blue.c300, TailwindColors.Blue.c400, TailwindColors.Blue.c500,
                    TailwindColors.Blue.c600, TailwindColors.Blue.c700, TailwindColors.Blue.c800,
                    TailwindColors.Blue.c900, TailwindColors.Blue.c950
                ))
                TailwindColorRow("Amber", listOf(
                    TailwindColors.Amber.c50, TailwindColors.Amber.c100, TailwindColors.Amber.c200,
                    TailwindColors.Amber.c300, TailwindColors.Amber.c400, TailwindColors.Amber.c500,
                    TailwindColors.Amber.c600, TailwindColors.Amber.c700, TailwindColors.Amber.c800,
                    TailwindColors.Amber.c900, TailwindColors.Amber.c950
                ))
                TailwindColorRow("Red", listOf(
                    TailwindColors.Red.c50, TailwindColors.Red.c100, TailwindColors.Red.c200,
                    TailwindColors.Red.c300, TailwindColors.Red.c400, TailwindColors.Red.c500,
                    TailwindColors.Red.c600, TailwindColors.Red.c700, TailwindColors.Red.c800,
                    TailwindColors.Red.c900, TailwindColors.Red.c950
                ))
                TailwindColorRow("Gray", listOf(
                    TailwindColors.Gray.c50, TailwindColors.Gray.c100, TailwindColors.Gray.c200,
                    TailwindColors.Gray.c300, TailwindColors.Gray.c400, TailwindColors.Gray.c500,
                    TailwindColors.Gray.c600, TailwindColors.Gray.c700, TailwindColors.Gray.c800,
                    TailwindColors.Gray.c900, TailwindColors.Gray.c950
                ))
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
                SpacingItemRow("extraSmall", "4.dp", LiteverTheme.spacing.extraSmall)
                SpacingItemRow("small", "8.dp", LiteverTheme.spacing.small)
                SpacingItemRow("medium", "16.dp (${strings.defaultText})", LiteverTheme.spacing.medium)
                SpacingItemRow("large", "24.dp", LiteverTheme.spacing.large)
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
                ShapeItemRow("medium", "8.dp", LiteverTheme.shapes.medium)
                ShapeItemRow("large", "16.dp", LiteverTheme.shapes.large)
                ShapeItemRow("extraLarge", "28.dp", LiteverTheme.shapes.extraLarge)
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
fun TailwindColorRow(name: String, colors: List<Color>) {
    Column(modifier = Modifier.padding(vertical = 4.dp)) {
        Text(
            text = name,
            style = LiteverTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 4.dp, bottom = 4.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            colors.forEachIndexed { index, color ->
                val label = when (index) {
                    0 -> "50"
                    1 -> "100"
                    2 -> "200"
                    3 -> "300"
                    4 -> "400"
                    5 -> "500"
                    6 -> "600"
                    7 -> "700"
                    8 -> "800"
                    9 -> "900"
                    10 -> "950"
                    else -> ""
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(36.dp)
                        .background(color)
                        .clip(RoundedCornerShape(2.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    val textColor = if (color.luminance() > 0.5f) Color.Black else Color.White
                    Text(
                        text = label,
                        color = textColor,
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
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
