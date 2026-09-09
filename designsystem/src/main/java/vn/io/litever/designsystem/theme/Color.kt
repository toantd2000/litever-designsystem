package vn.io.litever.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// ==========================================
// LIGHT THEME COLORS
// ==========================================
val primaryLight = Color(0xFF4D5C92)
val onPrimaryLight = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFFDCE1FF)
val onPrimaryContainerLight = Color(0xFF354479)
val secondaryLight = Color(0xFF595D72)
val onSecondaryLight = Color(0xFFFFFFFF)
val secondaryContainerLight = Color(0xFFDEE1F9)
val onSecondaryContainerLight = Color(0xFF424659)
val tertiaryLight = Color(0xFF75546F)
val onTertiaryLight = Color(0xFFFFFFFF)
val tertiaryContainerLight = Color(0xFFFFD7F5)
val onTertiaryContainerLight = Color(0xFF5B3D57)
val errorLight = Color(0xFFBA1A1A)
val onErrorLight = Color(0xFFFFFFFF)
val errorContainerLight = Color(0xFFFFDAD6)
val onErrorContainerLight = Color(0xFF93000A)
val backgroundLight = Color(0xFFFAF8FF)
val onBackgroundLight = Color(0xFF1A1B21)
val surfaceLight = Color(0xFFFAF8FF)
val onSurfaceLight = Color(0xFF1A1B21)
val surfaceVariantLight = Color(0xFFE2E1EC)
val onSurfaceVariantLight = Color(0xFF45464F)
val outlineLight = Color(0xFF767680)
val outlineVariantLight = Color(0xFFC6C5D0)
val scrimLight = Color(0xFF000000)
val inverseSurfaceLight = Color(0xFF2F3036)
val inverseOnSurfaceLight = Color(0xFFF1F0F7)
val inversePrimaryLight = Color(0xFFB7C4FF)
val surfaceDimLight = Color(0xFFDAD9E0)
val surfaceBrightLight = Color(0xFFFAF8FF)
val surfaceContainerLowestLight = Color(0xFFFFFFFF)
val surfaceContainerLowLight = Color(0xFFF4F2FA)
val surfaceContainerLight = Color(0xFFEFEDF4)
val surfaceContainerHighLight = Color(0xFFE9E7EF)
val surfaceContainerHighestLight = Color(0xFFE3E1E9)

// ==========================================
// DARK THEME COLORS
// ==========================================
val primaryDark = Color(0xFFB7C4FF)
val onPrimaryDark = Color(0xFF1E2D61)
val primaryContainerDark = Color(0xFF354479)
val onPrimaryContainerDark = Color(0xFFDCE1FF)
val secondaryDark = Color(0xFFC2C5DD)
val onSecondaryDark = Color(0xFF2B3042)
val secondaryContainerDark = Color(0xFF424659)
val onSecondaryContainerDark = Color(0xFFDEE1F9)
val tertiaryDark = Color(0xFFE3BADA)
val onTertiaryDark = Color(0xFF43273F)
val tertiaryContainerDark = Color(0xFF5B3D57)
val onTertiaryContainerDark = Color(0xFFFFD7F5)
val errorDark = Color(0xFFFFB4AB)
val onErrorDark = Color(0xFF690005)
val errorContainerDark = Color(0xFF93000A)
val onErrorContainerDark = Color(0xFFFFDAD6)
val backgroundDark = Color(0xFF121318)
val onBackgroundDark = Color(0xFFE3E1E9)
val surfaceDark = Color(0xFF121318)
val onSurfaceDark = Color(0xFFE3E1E9)
val surfaceVariantDark = Color(0xFF45464F)
val onSurfaceVariantDark = Color(0xFFC6C5D0)
val outlineDark = Color(0xFF90909A)
val outlineVariantDark = Color(0xFF45464F)
val scrimDark = Color(0xFF000000)
val inverseSurfaceDark = Color(0xFFE3E1E9)
val inverseOnSurfaceDark = Color(0xFF2F3036)
val inversePrimaryDark = Color(0xFF4D5C92)
val surfaceDimDark = Color(0xFF121318)
val surfaceBrightDark = Color(0xFF38393F)
val surfaceContainerLowestDark = Color(0xFF0D0E13)
val surfaceContainerLowDark = Color(0xFF1A1B21)
val surfaceContainerDark = Color(0xFF1E1F25)
val surfaceContainerHighDark = Color(0xFF292A2F)
val surfaceContainerHighestDark = Color(0xFF34343A)

// ==========================================
// SUCCESS & WARNING SEMANTIC COLORS
// ==========================================
val successLight = Color(0xFF4E6629)
val onSuccessLight = Color(0xFFFFFFFF)
val successContainerLight = Color(0xFFCFEDA1)
val onSuccessContainerLight = Color(0xFF374D14)
val warningLight = Color(0xFF8A5022)
val onWarningLight = Color(0xFFFFFFFF)
val warningContainerLight = Color(0xFFFFDCC5)
val onWarningContainerLight = Color(0xFF6D390B)

val successDark = Color(0xFFB4D088)
val onSuccessDark = Color(0xFF213600)
val successContainerDark = Color(0xFF374D14)
val onSuccessContainerDark = Color(0xFFCFEDA1)
val warningDark = Color(0xFFFFB783)
val onWarningDark = Color(0xFF4F2500)
val warningContainerDark = Color(0xFF6D390B)
val onWarningContainerDark = Color(0xFFFFDCC5)

// ==========================================
// DEFAULT COLOR SCHEMES
// ==========================================
val defaultLiteverLightColorScheme: ColorScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    inversePrimary = inversePrimaryLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    surfaceTint = primaryLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    surfaceBright = surfaceBrightLight,
    surfaceDim = surfaceDimLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight
)

val defaultLiteverDarkColorScheme: ColorScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    inversePrimary = inversePrimaryDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    surfaceTint = primaryDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    surfaceBright = surfaceBrightDark,
    surfaceDim = surfaceDimDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark
)

// ==========================================
// LITEVER COLORS CONTAINER
// ==========================================
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
    warning: Color,
    onWarning: Color,
    warningContainer: Color,
    onWarningContainer: Color,
    success: Color,
    onSuccess: Color,
    successContainer: Color,
    onSuccessContainer: Color,
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
    var warning by mutableStateOf(warning)
        private set
    var onWarning by mutableStateOf(onWarning)
        private set
    var warningContainer by mutableStateOf(warningContainer)
        private set
    var onWarningContainer by mutableStateOf(onWarningContainer)
        private set
    var success by mutableStateOf(success)
        private set
    var onSuccess by mutableStateOf(onSuccess)
        private set
    var successContainer by mutableStateOf(successContainer)
        private set
    var onSuccessContainer by mutableStateOf(onSuccessContainer)
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

    val brandLite: Color
        get() = onSurfaceVariant

    val brandVer: Color
        get() = primary

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
        warning = other.warning
        onWarning = other.onWarning
        warningContainer = other.warningContainer
        onWarningContainer = other.onWarningContainer
        success = other.success
        onSuccess = other.onSuccess
        successContainer = other.successContainer
        onSuccessContainer = other.onSuccessContainer
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
        warning = warning,
        onWarning = onWarning,
        warningContainer = warningContainer,
        onWarningContainer = onWarningContainer,
        success = success,
        onSuccess = onSuccess,
        successContainer = successContainer,
        onSuccessContainer = onSuccessContainer,
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

// Helper to create LiteverColors from individual constants
fun createLiteverColors(
    primary: Color, onPrimary: Color, primaryContainer: Color, onPrimaryContainer: Color,
    secondary: Color, onSecondary: Color, secondaryContainer: Color, onSecondaryContainer: Color,
    tertiary: Color, onTertiary: Color, tertiaryContainer: Color, onTertiaryContainer: Color,
    error: Color, onError: Color, errorContainer: Color, onErrorContainer: Color,
    background: Color, onBackground: Color, surface: Color, onSurface: Color,
    surfaceVariant: Color, onSurfaceVariant: Color, outline: Color, outlineVariant: Color,
    scrim: Color, inverseSurface: Color, inverseOnSurface: Color, inversePrimary: Color,
    surfaceDim: Color, surfaceBright: Color, surfaceContainerLowest: Color,
    surfaceContainerLow: Color, surfaceContainer: Color, surfaceContainerHigh: Color,
    surfaceContainerHighest: Color,
    warning: Color, onWarning: Color, warningContainer: Color, onWarningContainer: Color,
    success: Color, onSuccess: Color, successContainer: Color, onSuccessContainer: Color,
    isLight: Boolean
) = LiteverColors(
    primary = primary, onPrimary = onPrimary, primaryContainer = primaryContainer, onPrimaryContainer = onPrimaryContainer,
    secondary = secondary, onSecondary = onSecondary, secondaryContainer = secondaryContainer, onSecondaryContainer = onSecondaryContainer,
    tertiary = tertiary, onTertiary = onTertiary, tertiaryContainer = tertiaryContainer, onTertiaryContainer = onTertiaryContainer,
    error = error, onError = onError, errorContainer = errorContainer, onErrorContainer = onErrorContainer,
    background = background, onBackground = onBackground, surface = surface, onSurface = onSurface,
    surfaceVariant = surfaceVariant, onSurfaceVariant = onSurfaceVariant, outline = outline, outlineVariant = outlineVariant,
    scrim = scrim, inverseSurface = inverseSurface, inverseOnSurface = inverseOnSurface, inversePrimary = inversePrimary,
    surfaceDim = surfaceDim, surfaceBright = surfaceBright, surfaceContainerLowest = surfaceContainerLowest,
    surfaceContainerLow = surfaceContainerLow, surfaceContainer = surfaceContainer, surfaceContainerHigh = surfaceContainerHigh,
    surfaceContainerHighest = surfaceContainerHighest,
    warning = warning, onWarning = onWarning, warningContainer = warningContainer, onWarningContainer = onWarningContainer,
    success = success, onSuccess = onSuccess, successContainer = successContainer, onSuccessContainer = onSuccessContainer,
    surfaceTint = primary,
    isLight = isLight
)

val LocalLiteverColors = staticCompositionLocalOf<LiteverColors> {
    error("No LiteverColors provided")
}

/**
 * Creates a complete [LiteverColors] instance for the Light theme.
 */
fun lightLiteverColors(
    primary: Color = primaryLight,
    onPrimary: Color = onPrimaryLight,
    primaryContainer: Color = primaryContainerLight,
    onPrimaryContainer: Color = onPrimaryContainerLight,
    secondary: Color = secondaryLight,
    onSecondary: Color = onSecondaryLight,
    secondaryContainer: Color = secondaryContainerLight,
    onSecondaryContainer: Color = onSecondaryContainerLight,
    tertiary: Color = tertiaryLight,
    onTertiary: Color = onTertiaryLight,
    tertiaryContainer: Color = tertiaryContainerLight,
    onTertiaryContainer: Color = onTertiaryContainerLight,
    error: Color = errorLight,
    onError: Color = onErrorLight,
    errorContainer: Color = errorContainerLight,
    onErrorContainer: Color = onErrorContainerLight,
    background: Color = backgroundLight,
    onBackground: Color = onBackgroundLight,
    surface: Color = surfaceLight,
    onSurface: Color = onSurfaceLight,
    surfaceVariant: Color = surfaceVariantLight,
    onSurfaceVariant: Color = onSurfaceVariantLight,
    outline: Color = outlineLight,
    outlineVariant: Color = outlineVariantLight,
    scrim: Color = scrimLight,
    inverseSurface: Color = inverseSurfaceLight,
    inverseOnSurface: Color = inverseOnSurfaceLight,
    inversePrimary: Color = inversePrimaryLight,
    surfaceDim: Color = surfaceDimLight,
    surfaceBright: Color = surfaceBrightLight,
    surfaceContainerLowest: Color = surfaceContainerLowestLight,
    surfaceContainerLow: Color = surfaceContainerLowLight,
    surfaceContainer: Color = surfaceContainerLight,
    surfaceContainerHigh: Color = surfaceContainerHighLight,
    surfaceContainerHighest: Color = surfaceContainerHighestLight,
    warning: Color = warningLight,
    onWarning: Color = onWarningLight,
    warningContainer: Color = warningContainerLight,
    onWarningContainer: Color = onWarningContainerLight,
    success: Color = successLight,
    onSuccess: Color = onSuccessLight,
    successContainer: Color = successContainerLight,
    onSuccessContainer: Color = onSuccessContainerLight,
): LiteverColors = createLiteverColors(
    primary = primary, onPrimary = onPrimary, primaryContainer = primaryContainer, onPrimaryContainer = onPrimaryContainer,
    secondary = secondary, onSecondary = onSecondary, secondaryContainer = secondaryContainer, onSecondaryContainer = onSecondaryContainer,
    tertiary = tertiary, onTertiary = onTertiary, tertiaryContainer = tertiaryContainer, onTertiaryContainer = onTertiaryContainer,
    error = error, onError = onError, errorContainer = errorContainer, onErrorContainer = onErrorContainer,
    background = background, onBackground = onBackground, surface = surface, onSurface = onSurface,
    surfaceVariant = surfaceVariant, onSurfaceVariant = onSurfaceVariant, outline = outline, outlineVariant = outlineVariant,
    scrim = scrim, inverseSurface = inverseSurface, inverseOnSurface = inverseOnSurface, inversePrimary = inversePrimary,
    surfaceDim = surfaceDim, surfaceBright = surfaceBright, surfaceContainerLowest = surfaceContainerLowest,
    surfaceContainerLow = surfaceContainerLow, surfaceContainer = surfaceContainer, surfaceContainerHigh = surfaceContainerHigh,
    surfaceContainerHighest = surfaceContainerHighest,
    warning = warning, onWarning = onWarning, warningContainer = warningContainer, onWarningContainer = onWarningContainer,
    success = success, onSuccess = onSuccess, successContainer = successContainer, onSuccessContainer = onSuccessContainer,
    isLight = true
)

/**
 * Creates a complete [LiteverColors] instance for the Dark theme.
 */
fun darkLiteverColors(
    primary: Color = primaryDark,
    onPrimary: Color = onPrimaryDark,
    primaryContainer: Color = primaryContainerDark,
    onPrimaryContainer: Color = onPrimaryContainerDark,
    secondary: Color = secondaryDark,
    onSecondary: Color = onSecondaryDark,
    secondaryContainer: Color = secondaryContainerDark,
    onSecondaryContainer: Color = onSecondaryContainerDark,
    tertiary: Color = tertiaryDark,
    onTertiary: Color = onTertiaryDark,
    tertiaryContainer: Color = tertiaryContainerDark,
    onTertiaryContainer: Color = onTertiaryContainerDark,
    error: Color = errorDark,
    onError: Color = onErrorDark,
    errorContainer: Color = errorContainerDark,
    onErrorContainer: Color = onErrorContainerDark,
    background: Color = backgroundDark,
    onBackground: Color = onBackgroundDark,
    surface: Color = surfaceDark,
    onSurface: Color = onSurfaceDark,
    surfaceVariant: Color = surfaceVariantDark,
    onSurfaceVariant: Color = onSurfaceVariantDark,
    outline: Color = outlineDark,
    outlineVariant: Color = outlineVariantDark,
    scrim: Color = scrimDark,
    inverseSurface: Color = inverseSurfaceDark,
    inverseOnSurface: Color = inverseOnSurfaceDark,
    inversePrimary: Color = inversePrimaryDark,
    surfaceDim: Color = surfaceDimDark,
    surfaceBright: Color = surfaceBrightDark,
    surfaceContainerLowest: Color = surfaceContainerLowestDark,
    surfaceContainerLow: Color = surfaceContainerLowDark,
    surfaceContainer: Color = surfaceContainerDark,
    surfaceContainerHigh: Color = surfaceContainerHighDark,
    surfaceContainerHighest: Color = surfaceContainerHighestDark,
    warning: Color = warningDark,
    onWarning: Color = onWarningDark,
    warningContainer: Color = warningContainerDark,
    onWarningContainer: Color = onWarningContainerDark,
    success: Color = successDark,
    onSuccess: Color = onSuccessDark,
    successContainer: Color = successContainerDark,
    onSuccessContainer: Color = onSuccessContainerDark,
): LiteverColors = createLiteverColors(
    primary = primary, onPrimary = onPrimary, primaryContainer = primaryContainer, onPrimaryContainer = onPrimaryContainer,
    secondary = secondary, onSecondary = onSecondary, secondaryContainer = secondaryContainer, onSecondaryContainer = onSecondaryContainer,
    tertiary = tertiary, onTertiary = onTertiary, tertiaryContainer = tertiaryContainer, onTertiaryContainer = onTertiaryContainer,
    error = error, onError = onError, errorContainer = errorContainer, onErrorContainer = onErrorContainer,
    background = background, onBackground = onBackground, surface = surface, onSurface = onSurface,
    surfaceVariant = surfaceVariant, onSurfaceVariant = onSurfaceVariant, outline = outline, outlineVariant = outlineVariant,
    scrim = scrim, inverseSurface = inverseSurface, inverseOnSurface = inverseOnSurface, inversePrimary = inversePrimary,
    surfaceDim = surfaceDim, surfaceBright = surfaceBright, surfaceContainerLowest = surfaceContainerLowest,
    surfaceContainerLow = surfaceContainerLow, surfaceContainer = surfaceContainer, surfaceContainerHigh = surfaceContainerHigh,
    surfaceContainerHighest = surfaceContainerHighest,
    warning = warning, onWarning = onWarning, warningContainer = warningContainer, onWarningContainer = onWarningContainer,
    success = success, onSuccess = onSuccess, successContainer = successContainer, onSuccessContainer = onSuccessContainer,
    isLight = false
)

val liteverLightColors: LiteverColors = lightLiteverColors()
val liteverDarkColors: LiteverColors = darkLiteverColors()

// ==========================================
// M3 COLOR SCHEME INTEROPERABILITY
// ==========================================
fun LiteverColors.asMaterial3(): ColorScheme = if (isLight) {
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

fun ColorScheme.asLiteverColors(
    isLight: Boolean = true,
    warning: Color = if (isLight) warningLight else warningDark,
    onWarning: Color = if (isLight) onWarningLight else onWarningDark,
    warningContainer: Color = if (isLight) warningContainerLight else warningContainerDark,
    onWarningContainer: Color = if (isLight) onWarningContainerLight else onWarningContainerDark,
    success: Color = if (isLight) successLight else successDark,
    onSuccess: Color = if (isLight) onSuccessLight else onSuccessDark,
    successContainer: Color = if (isLight) successContainerLight else successContainerDark,
    onSuccessContainer: Color = if (isLight) onSuccessContainerLight else onSuccessContainerDark,
): LiteverColors = LiteverColors(
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
    warning = warning,
    onWarning = onWarning,
    warningContainer = warningContainer,
    onWarningContainer = onWarningContainer,
    success = success,
    onSuccess = onSuccess,
    successContainer = successContainer,
    onSuccessContainer = onSuccessContainer,
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
