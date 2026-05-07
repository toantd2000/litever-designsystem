package vn.io.litever.designsystem.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

class LiteverColors(
    primary: Color,
    onPrimary: Color,
    primaryContainer: Color,
    onPrimaryContainer: Color,
    inversePrimary: Color,
    secondary: Color,
    onSecondary: Color,
    secondaryContainer: Color,
    onSecondaryContainer: Color,
    tertiary: Color,
    onTertiary: Color,
    tertiaryContainer: Color,
    onTertiaryContainer: Color,
    background: Color,
    onBackground: Color,
    surface: Color,
    onSurface: Color,
    surfaceVariant: Color,
    onSurfaceVariant: Color,
    surfaceTint: Color,
    inverseSurface: Color,
    inverseOnSurface: Color,
    error: Color,
    onError: Color,
    errorContainer: Color,
    onErrorContainer: Color,
    outline: Color,
    outlineVariant: Color,
    scrim: Color,
    surfaceBright: Color,
    surfaceDim: Color,
    surfaceContainerLowest: Color,
    surfaceContainerLow: Color,
    surfaceContainer: Color,
    surfaceContainerHigh: Color,
    surfaceContainerHighest: Color,
    isLight: Boolean
) {
    var primary by mutableStateOf(primary)
        private set
    var onPrimary by mutableStateOf(onPrimary)
        private set
    var primaryContainer by mutableStateOf(primaryContainer)
        private set
    var onPrimaryContainer by mutableStateOf(onPrimaryContainer)
        private set
    var inversePrimary by mutableStateOf(inversePrimary)
        private set
    var secondary by mutableStateOf(secondary)
        private set
    var onSecondary by mutableStateOf(onSecondary)
        private set
    var secondaryContainer by mutableStateOf(secondaryContainer)
        private set
    var onSecondaryContainer by mutableStateOf(onSecondaryContainer)
        private set
    var tertiary by mutableStateOf(tertiary)
        private set
    var onTertiary by mutableStateOf(onTertiary)
        private set
    var tertiaryContainer by mutableStateOf(tertiaryContainer)
        private set
    var onTertiaryContainer by mutableStateOf(onTertiaryContainer)
        private set
    var background by mutableStateOf(background)
        private set
    var onBackground by mutableStateOf(onBackground)
        private set
    var surface by mutableStateOf(surface)
        private set
    var onSurface by mutableStateOf(onSurface)
        private set
    var surfaceVariant by mutableStateOf(surfaceVariant)
        private set
    var onSurfaceVariant by mutableStateOf(onSurfaceVariant)
        private set
    var surfaceTint by mutableStateOf(surfaceTint)
        private set
    var inverseSurface by mutableStateOf(inverseSurface)
        private set
    var inverseOnSurface by mutableStateOf(inverseOnSurface)
        private set
    var error by mutableStateOf(error)
        private set
    var onError by mutableStateOf(onError)
        private set
    var errorContainer by mutableStateOf(errorContainer)
        private set
    var onErrorContainer by mutableStateOf(onErrorContainer)
        private set
    var outline by mutableStateOf(outline)
        private set
    var outlineVariant by mutableStateOf(outlineVariant)
        private set
    var scrim by mutableStateOf(scrim)
        private set
    var surfaceBright by mutableStateOf(surfaceBright)
        private set
    var surfaceDim by mutableStateOf(surfaceDim)
        private set
    var surfaceContainerLowest by mutableStateOf(surfaceContainerLowest)
        private set
    var surfaceContainerLow by mutableStateOf(surfaceContainerLow)
        private set
    var surfaceContainer by mutableStateOf(surfaceContainer)
        private set
    var surfaceContainerHigh by mutableStateOf(surfaceContainerHigh)
        private set
    var surfaceContainerHighest by mutableStateOf(surfaceContainerHighest)
        private set
    var isLight by mutableStateOf(isLight)
        private set

    fun updateColorsFrom(other: LiteverColors) {
        primary = other.primary
        onPrimary = other.onPrimary
        primaryContainer = other.primaryContainer
        onPrimaryContainer = other.onPrimaryContainer
        inversePrimary = other.inversePrimary
        secondary = other.secondary
        onSecondary = other.onSecondary
        secondaryContainer = other.secondaryContainer
        onSecondaryContainer = other.onSecondaryContainer
        tertiary = other.tertiary
        onTertiary = other.onTertiary
        tertiaryContainer = other.tertiaryContainer
        onTertiaryContainer = other.onTertiaryContainer
        background = other.background
        onBackground = other.onBackground
        surface = other.surface
        onSurface = other.onSurface
        surfaceVariant = other.surfaceVariant
        onSurfaceVariant = other.onSurfaceVariant
        surfaceTint = other.surfaceTint
        inverseSurface = other.inverseSurface
        inverseOnSurface = other.inverseOnSurface
        error = other.error
        onError = other.onError
        errorContainer = other.errorContainer
        onErrorContainer = other.onErrorContainer
        outline = other.outline
        outlineVariant = other.outlineVariant
        scrim = other.scrim
        surfaceBright = other.surfaceBright
        surfaceDim = other.surfaceDim
        surfaceContainerLowest = other.surfaceContainerLowest
        surfaceContainerLow = other.surfaceContainerLow
        surfaceContainer = other.surfaceContainer
        surfaceContainerHigh = other.surfaceContainerHigh
        surfaceContainerHighest = other.surfaceContainerHighest
        isLight = other.isLight
    }

    fun copy(): LiteverColors = LiteverColors(
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
        surfaceContainerHighest = surfaceContainerHighest,
        isLight = isLight
    )
}

// Default Light Palette (Blue, Cyan, Gray, Slate)
val liteverLightColors = LiteverColors(
    primary = TailwindColors.Blue.c600,
    onPrimary = TailwindColors.White,
    primaryContainer = TailwindColors.Blue.c100,
    onPrimaryContainer = TailwindColors.Blue.c900,
    inversePrimary = TailwindColors.Blue.c400,

    secondary = TailwindColors.Cyan.c600,
    onSecondary = TailwindColors.White,
    secondaryContainer = TailwindColors.Cyan.c100,
    onSecondaryContainer = TailwindColors.Cyan.c900,

    tertiary = TailwindColors.Gray.c500,
    onTertiary = TailwindColors.White,
    tertiaryContainer = TailwindColors.Gray.c100,
    onTertiaryContainer = TailwindColors.Gray.c900,

    background = TailwindColors.Slate.c50,
    onBackground = TailwindColors.Slate.c900,
    surface = TailwindColors.Slate.c50,
    onSurface = TailwindColors.Slate.c900,
    surfaceVariant = TailwindColors.Slate.c200,
    onSurfaceVariant = TailwindColors.Slate.c700,
    surfaceTint = TailwindColors.Blue.c600,
    inverseSurface = TailwindColors.Slate.c800,
    inverseOnSurface = TailwindColors.Slate.c50,

    error = TailwindColors.Red.c600,
    onError = TailwindColors.White,
    errorContainer = TailwindColors.Red.c100,
    onErrorContainer = TailwindColors.Red.c900,

    outline = TailwindColors.Slate.c400,
    outlineVariant = TailwindColors.Slate.c300,
    scrim = TailwindColors.Black,

    surfaceBright = TailwindColors.Slate.c50,
    surfaceDim = TailwindColors.Slate.c200,
    surfaceContainerLowest = TailwindColors.White,
    surfaceContainerLow = TailwindColors.Slate.c50,
    surfaceContainer = TailwindColors.Slate.c100,
    surfaceContainerHigh = TailwindColors.Slate.c200,
    surfaceContainerHighest = TailwindColors.Slate.c300,
    isLight = true
)

// Default Dark Palette (Blue, Cyan, Gray, Slate)
val liteverDarkColors = LiteverColors(
    primary = TailwindColors.Blue.c400,
    onPrimary = TailwindColors.Blue.c900,
    primaryContainer = TailwindColors.Blue.c800,
    onPrimaryContainer = TailwindColors.Blue.c100,
    inversePrimary = TailwindColors.Blue.c600,

    secondary = TailwindColors.Cyan.c400,
    onSecondary = TailwindColors.Cyan.c900,
    secondaryContainer = TailwindColors.Cyan.c800,
    onSecondaryContainer = TailwindColors.Cyan.c100,

    tertiary = TailwindColors.Gray.c400,
    onTertiary = TailwindColors.Gray.c900,
    tertiaryContainer = TailwindColors.Gray.c800,
    onTertiaryContainer = TailwindColors.Gray.c100,

    background = TailwindColors.Slate.c900,
    onBackground = TailwindColors.Slate.c50,
    surface = TailwindColors.Slate.c900,
    onSurface = TailwindColors.Slate.c50,
    surfaceVariant = TailwindColors.Slate.c700,
    onSurfaceVariant = TailwindColors.Slate.c300,
    surfaceTint = TailwindColors.Blue.c400,
    inverseSurface = TailwindColors.Slate.c200,
    inverseOnSurface = TailwindColors.Slate.c900,

    error = TailwindColors.Red.c400,
    onError = TailwindColors.Red.c900,
    errorContainer = TailwindColors.Red.c800,
    onErrorContainer = TailwindColors.Red.c100,

    outline = TailwindColors.Slate.c500,
    outlineVariant = TailwindColors.Slate.c600,
    scrim = TailwindColors.Black,

    surfaceBright = TailwindColors.Slate.c800,
    surfaceDim = TailwindColors.Slate.c900,
    surfaceContainerLowest = TailwindColors.Black,
    surfaceContainerLow = TailwindColors.Slate.c900,
    surfaceContainer = TailwindColors.Slate.c800,
    surfaceContainerHigh = TailwindColors.Slate.c700,
    surfaceContainerHighest = TailwindColors.Slate.c600,
    isLight = false
)

val LocalLiteverColors = staticCompositionLocalOf<LiteverColors> {
    error("No LiteverColors provided")
}

// Brand Colors
val brandLite = TailwindColors.Gray.c500
val brandVer = TailwindColors.Blue.c600