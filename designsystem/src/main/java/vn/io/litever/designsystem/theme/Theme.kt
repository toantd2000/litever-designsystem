package vn.io.litever.designsystem.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat

/**
 * Accessor object for Litever design tokens within composition.
 */
object LiteverTheme {
    val colors: LiteverColors
        @Composable
        @ReadOnlyComposable
        get() = LocalLiteverColors.current

    val typography: LiteverTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalLiteverTypography.current

    val spacing: LiteverSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalLiteverSpacing.current

    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.shapes
}

/**
 * Main theme composable for Litever applications.
 *
 * Supports dynamic [ColorScheme] injection from consumer applications (e.g., FinLog, ReMind),
 * falling back to default Litever color schemes when none is provided.
 *
 * Synchronizes Material 3 [MaterialTheme] and [LocalLiteverColors] composition locals.
 *
 * @param colorScheme Optional Material 3 [ColorScheme] provided by consumer apps.
 * @param colors Optional custom [LiteverColors] container.
 * @param typography Typography specifications, defaulting to [defaultLiteverTypography].
 * @param spacing Spacing scale tokens, defaulting to [LiteverSpacing].
 * @param shapes Corner shape definitions, defaulting to [LiteverShapes].
 * @param darkTheme Whether dark theme should be applied.
 * @param dynamicColor Whether dynamic system coloring (Android 12+) should be used when available.
 * @param content Composable child hierarchy.
 */
@Composable
fun LiteverTheme(
    themeColor: LiteverThemeColor = LiteverThemeColor.DEFAULT,
    colorScheme: ColorScheme? = null,
    colors: LiteverColors? = null,
    typography: LiteverTypography = defaultLiteverTypography,
    spacing: LiteverSpacing = LiteverSpacing(),
    shapes: Shapes = LiteverShapes,
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current

    // 1. Determine predefined ColorScheme based on selected themeColor
    val predefinedColorScheme = when (themeColor) {
        LiteverThemeColor.RED -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.redDarkColorScheme else vn.io.litever.designsystem.theme.palettes.redLightColorScheme
        LiteverThemeColor.ORANGE -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.orangeDarkColorScheme else vn.io.litever.designsystem.theme.palettes.orangeLightColorScheme
        LiteverThemeColor.YELLOW -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.yellowDarkColorScheme else vn.io.litever.designsystem.theme.palettes.yellowLightColorScheme
        LiteverThemeColor.GREEN -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.greenDarkColorScheme else vn.io.litever.designsystem.theme.palettes.greenLightColorScheme
        LiteverThemeColor.BLUE -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.blueDarkColorScheme else vn.io.litever.designsystem.theme.palettes.blueLightColorScheme
        LiteverThemeColor.INDIGO -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.indigoDarkColorScheme else vn.io.litever.designsystem.theme.palettes.indigoLightColorScheme
        LiteverThemeColor.VIOLET -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.violetDarkColorScheme else vn.io.litever.designsystem.theme.palettes.violetLightColorScheme
        LiteverThemeColor.BLACK -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.blackDarkColorScheme else vn.io.litever.designsystem.theme.palettes.blackLightColorScheme
        else -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.redDarkColorScheme else vn.io.litever.designsystem.theme.palettes.redLightColorScheme
    }

    // 2. Determine effective ColorScheme
    val effectiveColorScheme: ColorScheme = when {
        colorScheme != null -> colorScheme
        colors != null -> colors.asMaterial3()
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        else -> predefinedColorScheme
    }

    // 2. Determine effective LiteverColors
    val effectiveLiteverColors: LiteverColors = when {
        colors != null -> colors
        else -> effectiveColorScheme.asLiteverColors(isLight = !darkTheme)
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as? Activity)?.window
            if (window != null) {
                window.navigationBarColor = android.graphics.Color.TRANSPARENT
                window.statusBarColor = android.graphics.Color.TRANSPARENT

                val insetsController = WindowCompat.getInsetsController(window, view)
                insetsController.isAppearanceLightStatusBars = !darkTheme
                insetsController.isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }

    CompositionLocalProvider(
        LocalLiteverColors provides effectiveLiteverColors,
        LocalLiteverTypography provides typography,
        LocalLiteverSpacing provides spacing
    ) {
        MaterialTheme(
            colorScheme = effectiveColorScheme,
            typography = typography.asMaterial3(),
            shapes = shapes,
            content = content
        )
    }
}

@Composable
fun ColorItem(name: String, color: Color, onColor: Color) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(LiteverTheme.spacing.doubleLarge),
        color = color,
        contentColor = onColor
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = LiteverTheme.spacing.medium),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(text = name, style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Preview(showBackground = true, name = "Light Theme Palette")
@Composable
fun LightColorPalettePreview() {
    LiteverTheme(darkTheme = false) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            ColorItem("Primary", LiteverTheme.colors.primary, LiteverTheme.colors.onPrimary)
            ColorItem("Primary Container", LiteverTheme.colors.primaryContainer, LiteverTheme.colors.onPrimaryContainer)
            ColorItem("Secondary", LiteverTheme.colors.secondary, LiteverTheme.colors.onSecondary)
            ColorItem("Secondary Container", LiteverTheme.colors.secondaryContainer, LiteverTheme.colors.onSecondaryContainer)
            ColorItem("Tertiary", LiteverTheme.colors.tertiary, LiteverTheme.colors.onTertiary)
            ColorItem("Tertiary Container", LiteverTheme.colors.tertiaryContainer, LiteverTheme.colors.onTertiaryContainer)
            ColorItem("Background", LiteverTheme.colors.background, LiteverTheme.colors.onBackground)
            ColorItem("Surface", LiteverTheme.colors.surface, LiteverTheme.colors.onSurface)
            ColorItem("Surface Variant", LiteverTheme.colors.surfaceVariant, LiteverTheme.colors.onSurfaceVariant)
            ColorItem("Error", LiteverTheme.colors.error, LiteverTheme.colors.onError)
            ColorItem("Error Container", LiteverTheme.colors.errorContainer, LiteverTheme.colors.onErrorContainer)
            ColorItem("Warning", LiteverTheme.colors.warning, LiteverTheme.colors.onWarning)
            ColorItem("Warning Container", LiteverTheme.colors.warningContainer, LiteverTheme.colors.onWarningContainer)
            ColorItem("Success", LiteverTheme.colors.success, LiteverTheme.colors.onSuccess)
            ColorItem("Success Container", LiteverTheme.colors.successContainer, LiteverTheme.colors.onSuccessContainer)
        }
    }
}

@Preview(showBackground = true, name = "Dark Theme Palette")
@Composable
fun DarkColorPalettePreview() {
    LiteverTheme(darkTheme = true) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            ColorItem("Primary", LiteverTheme.colors.primary, LiteverTheme.colors.onPrimary)
            ColorItem("Primary Container", LiteverTheme.colors.primaryContainer, LiteverTheme.colors.onPrimaryContainer)
            ColorItem("Secondary", LiteverTheme.colors.secondary, LiteverTheme.colors.onSecondary)
            ColorItem("Secondary Container", LiteverTheme.colors.secondaryContainer, LiteverTheme.colors.onSecondaryContainer)
            ColorItem("Tertiary", LiteverTheme.colors.tertiary, LiteverTheme.colors.onTertiary)
            ColorItem("Tertiary Container", LiteverTheme.colors.tertiaryContainer, LiteverTheme.colors.onTertiaryContainer)
            ColorItem("Background", LiteverTheme.colors.background, LiteverTheme.colors.onBackground)
            ColorItem("Surface", LiteverTheme.colors.surface, LiteverTheme.colors.onSurface)
            ColorItem("Surface Variant", LiteverTheme.colors.surfaceVariant, LiteverTheme.colors.onSurfaceVariant)
            ColorItem("Error", LiteverTheme.colors.error, LiteverTheme.colors.onError)
            ColorItem("Error Container", LiteverTheme.colors.errorContainer, LiteverTheme.colors.onErrorContainer)
            ColorItem("Warning", LiteverTheme.colors.warning, LiteverTheme.colors.onWarning)
            ColorItem("Warning Container", LiteverTheme.colors.warningContainer, LiteverTheme.colors.onWarningContainer)
            ColorItem("Success", LiteverTheme.colors.success, LiteverTheme.colors.onSuccess)
            ColorItem("Success Container", LiteverTheme.colors.successContainer, LiteverTheme.colors.onSuccessContainer)
        }
    }
}
