package vn.io.litever.designsystem.theme

import android.app.Activity
import android.app.UiModeManager
import android.content.Context
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
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

    val shapes: androidx.compose.material3.Shapes
        @Composable
        @ReadOnlyComposable
        get() = LiteverShapes
}

@Composable
fun LiteverTheme(
    colors: LiteverColors? = null,
    typography: LiteverTypography = defaultLiteverTypography,
    spacing: LiteverSpacing = LiteverSpacing(),
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val uiModeManager = context.getSystemService(Context.UI_MODE_SERVICE) as UiModeManager

    // Detect contrast level
    val contrast = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
        uiModeManager.contrast
    } else {
        0f
    }

    // Choose which color system to use
    val targetColors = when {
        colors != null -> colors
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val dynamicColorScheme = if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
            dynamicColorScheme.asLiteverColors(darkTheme)
        }
        else -> {
            if (darkTheme) {
                when {
                    contrast >= 1.0f -> liteverDarkHighContrastColors
                    contrast >= 0.5f -> liteverDarkMediumContrastColors
                    else -> liteverDarkColors
                }
            } else {
                when {
                    contrast >= 1.0f -> liteverLightHighContrastColors
                    contrast >= 0.5f -> liteverLightMediumContrastColors
                    else -> liteverLightColors
                }
            }
        }
    }

    // Also update MaterialTheme so standard M3 components look right
    val materialColorScheme = targetColors.asMaterial3()

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
            WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars = !darkTheme
        }
    }

    CompositionLocalProvider(
        LocalLiteverColors provides targetColors,
        LocalLiteverTypography provides typography,
        LocalLiteverSpacing provides spacing
    ) {
        MaterialTheme(
            colorScheme = materialColorScheme,
            typography = typography.asMaterial3(),
            shapes = LiteverShapes,
            content = content
        )
    }
}

// Helpers to convert between systems
private fun LiteverColors.asMaterial3(): ColorScheme = if (isLight) {
    lightColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        inversePrimary = inversePrimary,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        background = background,
        onBackground = onBackground,
        surface = surface,
        onSurface = onSurface,
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        surfaceTint = surfaceTint,
        inverseSurface = inverseSurface,
        inverseOnSurface = inverseOnSurface,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        outline = outline,
        outlineVariant = outlineVariant,
        scrim = scrim,
        surfaceBright = surfaceBright,
        surfaceDim = surfaceDim,
        surfaceContainerLowest = surfaceContainerLowest,
        surfaceContainerLow = surfaceContainerLow,
        surfaceContainer = surfaceContainer,
        surfaceContainerHigh = surfaceContainerHigh,
        surfaceContainerHighest = surfaceContainerHighest
    )
} else {
    darkColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        inversePrimary = inversePrimary,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        background = background,
        onBackground = onBackground,
        surface = surface,
        onSurface = onSurface,
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        surfaceTint = surfaceTint,
        inverseSurface = inverseSurface,
        inverseOnSurface = inverseOnSurface,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        outline = outline,
        outlineVariant = outlineVariant,
        scrim = scrim,
        surfaceBright = surfaceBright,
        surfaceDim = surfaceDim,
        surfaceContainerLowest = surfaceContainerLowest,
        surfaceContainerLow = surfaceContainerLow,
        surfaceContainer = surfaceContainer,
        surfaceContainerHigh = surfaceContainerHigh,
        surfaceContainerHighest = surfaceContainerHighest
    )
}

private fun ColorScheme.asLiteverColors(isLight: Boolean): LiteverColors = LiteverColors(
    primary = primary,
    onPrimary = onPrimary,
    primaryContainer = primaryContainer,
    onPrimaryContainer = onPrimaryContainer,
    inversePrimary = inversePrimary,
    secondary = secondary,
    onSecondary = onSecondary,
    secondaryContainer = secondaryContainer,
    onSecondaryContainer = onSecondaryContainer,
    tertiary = tertiary,
    onTertiary = onTertiary,
    tertiaryContainer = tertiaryContainer,
    onTertiaryContainer = onTertiaryContainer,
    background = background,
    onBackground = onBackground,
    surface = surface,
    onSurface = onSurface,
    surfaceVariant = surfaceVariant,
    onSurfaceVariant = onSurfaceVariant,
    surfaceTint = surfaceTint,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    error = error,
    onError = onError,
    errorContainer = errorContainer,
    onErrorContainer = onErrorContainer,
    warning = if (isLight) warningLight else warningDark,
    onWarning = if (isLight) onWarningLight else onWarningDark,
    warningContainer = if (isLight) warningContainerLight else warningContainerDark,
    onWarningContainer = if (isLight) onWarningContainerLight else onWarningContainerDark,
    success = if (isLight) successLight else successDark,
    onSuccess = if (isLight) onSuccessLight else onSuccessDark,
    successContainer = if (isLight) successContainerLight else successContainerDark,
    onSuccessContainer = if (isLight) onSuccessContainerLight else onSuccessContainerDark,
    outline = outline,
    outlineVariant = outlineVariant,
    scrim = scrim,
    surfaceBright = surfaceBright,
    surfaceDim = surfaceDim,
    surfaceContainerLowest = surfaceContainerLowest,
    surfaceContainerLow = surfaceContainerLow,
    surfaceContainer = surfaceContainer,
    surfaceContainerHigh = surfaceContainerHigh,
    surfaceContainerHighest = surfaceContainerHighest,
    isLight = isLight
)

@Composable
fun ColorItem(name: String, color: Color, onColor: Color) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        color = color,
        contentColor = onColor
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
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
