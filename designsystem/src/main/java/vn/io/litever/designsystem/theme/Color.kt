package vn.io.litever.designsystem.theme

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

val primaryLightMediumContrast = Color(0xFF243367)
val onPrimaryLightMediumContrast = Color(0xFFFFFFFF)
val primaryContainerLightMediumContrast = Color(0xFF5C6AA2)
val onPrimaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val secondaryLightMediumContrast = Color(0xFF313548)
val onSecondaryLightMediumContrast = Color(0xFFFFFFFF)
val secondaryContainerLightMediumContrast = Color(0xFF686C81)
val onSecondaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val tertiaryLightMediumContrast = Color(0xFF492C45)
val onTertiaryLightMediumContrast = Color(0xFFFFFFFF)
val tertiaryContainerLightMediumContrast = Color(0xFF85627E)
val onTertiaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val errorLightMediumContrast = Color(0xFF740006)
val onErrorLightMediumContrast = Color(0xFFFFFFFF)
val errorContainerLightMediumContrast = Color(0xFFCF2C27)
val onErrorContainerLightMediumContrast = Color(0xFFFFFFFF)
val backgroundLightMediumContrast = Color(0xFFFAF8FF)
val onBackgroundLightMediumContrast = Color(0xFF1A1B21)
val surfaceLightMediumContrast = Color(0xFFFAF8FF)
val onSurfaceLightMediumContrast = Color(0xFF101116)
val surfaceVariantLightMediumContrast = Color(0xFFE2E1EC)
val onSurfaceVariantLightMediumContrast = Color(0xFF34363E)
val outlineLightMediumContrast = Color(0xFF51525B)
val outlineVariantLightMediumContrast = Color(0xFF6C6C76)
val scrimLightMediumContrast = Color(0xFF000000)
val inverseSurfaceLightMediumContrast = Color(0xFF2F3036)
val inverseOnSurfaceLightMediumContrast = Color(0xFFF1F0F7)
val inversePrimaryLightMediumContrast = Color(0xFFB7C4FF)
val surfaceDimLightMediumContrast = Color(0xFFC7C6CD)
val surfaceBrightLightMediumContrast = Color(0xFFFAF8FF)
val surfaceContainerLowestLightMediumContrast = Color(0xFFFFFFFF)
val surfaceContainerLowLightMediumContrast = Color(0xFFF4F2FA)
val surfaceContainerLightMediumContrast = Color(0xFFE9E7EF)
val surfaceContainerHighLightMediumContrast = Color(0xFFDDDCE3)
val surfaceContainerHighestLightMediumContrast = Color(0xFFD2D1D8)

val primaryLightHighContrast = Color(0xFF19285C)
val onPrimaryLightHighContrast = Color(0xFFFFFFFF)
val primaryContainerLightHighContrast = Color(0xFF38467B)
val onPrimaryContainerLightHighContrast = Color(0xFFFFFFFF)
val secondaryLightHighContrast = Color(0xFF272B3D)
val onSecondaryLightHighContrast = Color(0xFFFFFFFF)
val secondaryContainerLightHighContrast = Color(0xFF44485C)
val onSecondaryContainerLightHighContrast = Color(0xFFFFFFFF)
val tertiaryLightHighContrast = Color(0xFF3E223B)
val onTertiaryLightHighContrast = Color(0xFFFFFFFF)
val tertiaryContainerLightHighContrast = Color(0xFF5E3F59)
val onTertiaryContainerLightHighContrast = Color(0xFFFFFFFF)
val errorLightHighContrast = Color(0xFF600004)
val onErrorLightHighContrast = Color(0xFFFFFFFF)
val errorContainerLightHighContrast = Color(0xFF98000A)
val onErrorContainerLightHighContrast = Color(0xFFFFFFFF)
val backgroundLightHighContrast = Color(0xFFFAF8FF)
val onBackgroundLightHighContrast = Color(0xFF1A1B21)
val surfaceLightHighContrast = Color(0xFFFAF8FF)
val onSurfaceLightHighContrast = Color(0xFF000000)
val surfaceVariantLightHighContrast = Color(0xFFE2E1EC)
val onSurfaceVariantLightHighContrast = Color(0xFF000000)
val outlineLightHighContrast = Color(0xFF2A2C34)
val outlineVariantLightHighContrast = Color(0xFF484951)
val scrimLightHighContrast = Color(0xFF000000)
val inverseSurfaceLightHighContrast = Color(0xFF2F3036)
val inverseOnSurfaceLightHighContrast = Color(0xFFFFFFFF)
val inversePrimaryLightHighContrast = Color(0xFFB7C4FF)
val surfaceDimLightHighContrast = Color(0xFFB9B8BF)
val surfaceBrightLightHighContrast = Color(0xFFFAF8FF)
val surfaceContainerLowestLightHighContrast = Color(0xFFFFFFFF)
val surfaceContainerLowLightHighContrast = Color(0xFFF1F0F7)
val surfaceContainerLightHighContrast = Color(0xFFE3E1E9)
val surfaceContainerHighLightHighContrast = Color(0xFFD5D3DB)
val surfaceContainerHighestLightHighContrast = Color(0xFFC7C6CD)

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

val primaryDarkMediumContrast = Color(0xFFD4DBFF)
val onPrimaryDarkMediumContrast = Color(0xFF112155)
val primaryContainerDarkMediumContrast = Color(0xFF808EC8)
val onPrimaryContainerDarkMediumContrast = Color(0xFF000000)
val secondaryDarkMediumContrast = Color(0xFFD8DBF3)
val onSecondaryDarkMediumContrast = Color(0xFF212536)
val secondaryContainerDarkMediumContrast = Color(0xFF8C90A6)
val onSecondaryContainerDarkMediumContrast = Color(0xFF000000)
val tertiaryDarkMediumContrast = Color(0xFFFAD0F0)
val onTertiaryDarkMediumContrast = Color(0xFF371C34)
val tertiaryContainerDarkMediumContrast = Color(0xFFAB85A3)
val onTertiaryContainerDarkMediumContrast = Color(0xFF000000)
val errorDarkMediumContrast = Color(0xFFFFD2CC)
val onErrorDarkMediumContrast = Color(0xFF540003)
val errorContainerDarkMediumContrast = Color(0xFFFF5449)
val onErrorContainerDarkMediumContrast = Color(0xFF000000)
val backgroundDarkMediumContrast = Color(0xFF121318)
val onBackgroundDarkMediumContrast = Color(0xFFE3E1E9)
val surfaceDarkMediumContrast = Color(0xFF121318)
val onSurfaceDarkMediumContrast = Color(0xFFFFFFFF)
val surfaceVariantDarkMediumContrast = Color(0xFF45464F)
val onSurfaceVariantDarkMediumContrast = Color(0xFFDCDBE6)
val outlineDarkMediumContrast = Color(0xFFB1B1BB)
val outlineVariantDarkMediumContrast = Color(0xFF8F8F99)
val scrimDarkMediumContrast = Color(0xFF000000)
val inverseSurfaceDarkMediumContrast = Color(0xFFE3E1E9)
val inverseOnSurfaceDarkMediumContrast = Color(0xFF292A2F)
val inversePrimaryDarkMediumContrast = Color(0xFF37457A)
val surfaceDimDarkMediumContrast = Color(0xFF121318)
val surfaceBrightDarkMediumContrast = Color(0xFF44444A)
val surfaceContainerLowestDarkMediumContrast = Color(0xFF06070C)
val surfaceContainerLowDarkMediumContrast = Color(0xFF1C1D23)
val surfaceContainerDarkMediumContrast = Color(0xFF27272D)
val surfaceContainerHighDarkMediumContrast = Color(0xFF323238)
val surfaceContainerHighestDarkMediumContrast = Color(0xFF3D3D43)

val primaryDarkHighContrast = Color(0xFFEEEFFF)
val onPrimaryDarkHighContrast = Color(0xFF000000)
val primaryContainerDarkHighContrast = Color(0xFFB2C0FD)
val onPrimaryContainerDarkHighContrast = Color(0xFF00072B)
val secondaryDarkHighContrast = Color(0xFFEEEFFF)
val onSecondaryDarkHighContrast = Color(0xFF000000)
val secondaryContainerDarkHighContrast = Color(0xFFBEC1D9)
val onSecondaryContainerDarkHighContrast = Color(0xFF060A1B)
val tertiaryDarkHighContrast = Color(0xFFFFEAF7)
val onTertiaryDarkHighContrast = Color(0xFF000000)
val tertiaryContainerDarkHighContrast = Color(0xFFDFB6D6)
val onTertiaryContainerDarkHighContrast = Color(0xFF190318)
val errorDarkHighContrast = Color(0xFFFFECE9)
val onErrorDarkHighContrast = Color(0xFF000000)
val errorContainerDarkHighContrast = Color(0xFFFFAEA4)
val onErrorContainerDarkHighContrast = Color(0xFF220001)
val backgroundDarkHighContrast = Color(0xFF121318)
val onBackgroundDarkHighContrast = Color(0xFFE3E1E9)
val surfaceDarkHighContrast = Color(0xFF121318)
val onSurfaceDarkHighContrast = Color(0xFFFFFFFF)
val surfaceVariantDarkHighContrast = Color(0xFF45464F)
val onSurfaceVariantDarkHighContrast = Color(0xFFFFFFFF)
val outlineDarkHighContrast = Color(0xFFF0EFFA)
val outlineVariantDarkHighContrast = Color(0xFFC2C2CC)
val scrimDarkHighContrast = Color(0xFF000000)
val inverseSurfaceDarkHighContrast = Color(0xFFE3E1E9)
val inverseOnSurfaceDarkHighContrast = Color(0xFF000000)
val inversePrimaryDarkHighContrast = Color(0xFF37457A)
val surfaceDimDarkHighContrast = Color(0xFF121318)
val surfaceBrightDarkHighContrast = Color(0xFF4F5056)
val surfaceContainerLowestDarkHighContrast = Color(0xFF000000)
val surfaceContainerLowDarkHighContrast = Color(0xFF1E1F25)
val surfaceContainerDarkHighContrast = Color(0xFF2F3036)
val surfaceContainerHighDarkHighContrast = Color(0xFF3A3B41)
val surfaceContainerHighestDarkHighContrast = Color(0xFF46464C)

// ==========================================
// SUCCESS & WARNING COLORS
// ==========================================
val successLight = Color(0xFF4E6629)
val onSuccessLight = Color(0xFFFFFFFF)
val successContainerLight = Color(0xFFCFEDA1)
val onSuccessContainerLight = Color(0xFF374D14)
val warningLight = Color(0xFF8A5022)
val onWarningLight = Color(0xFFFFFFFF)
val warningContainerLight = Color(0xFFFFDCC5)
val onWarningContainerLight = Color(0xFF6D390B)

val successLightMediumContrast = Color(0xFF273C03)
val onSuccessLightMediumContrast = Color(0xFFFFFFFF)
val successContainerLightMediumContrast = Color(0xFF5C7537)
val onSuccessContainerLightMediumContrast = Color(0xFFFFFFFF)
val warningLightMediumContrast = Color(0xFF582A00)
val onWarningLightMediumContrast = Color(0xFFFFFFFF)
val warningContainerLightMediumContrast = Color(0xFF9B5E2F)
val onWarningContainerLightMediumContrast = Color(0xFFFFFFFF)

val successLightHighContrast = Color(0xFF1E3200)
val onSuccessLightHighContrast = Color(0xFFFFFFFF)
val successContainerLightHighContrast = Color(0xFF395016)
val onSuccessContainerLightHighContrast = Color(0xFFFFFFFF)
val warningLightHighContrast = Color(0xFF492100)
val onWarningLightHighContrast = Color(0xFFFFFFFF)
val warningContainerLightHighContrast = Color(0xFF703B0E)
val onWarningContainerLightHighContrast = Color(0xFFFFFFFF)

val successDark = Color(0xFFB4D088)
val onSuccessDark = Color(0xFF213600)
val successContainerDark = Color(0xFF374D14)
val onSuccessContainerDark = Color(0xFFCFEDA1)
val warningDark = Color(0xFFFFB783)
val onWarningDark = Color(0xFF4F2500)
val warningContainerDark = Color(0xFF6D390B)
val onWarningContainerDark = Color(0xFFFFDCC5)

val successDarkMediumContrast = Color(0xFFC9E69C)
val onSuccessDarkMediumContrast = Color(0xFF192A00)
val successContainerDarkMediumContrast = Color(0xFF7F9957)
val onSuccessContainerDarkMediumContrast = Color(0xFF000000)
val warningDarkMediumContrast = Color(0xFFFFD4B8)
val onWarningDarkMediumContrast = Color(0xFF3F1C00)
val warningContainerDarkMediumContrast = Color(0xFFC5814E)
val onWarningContainerDarkMediumContrast = Color(0xFF000000)

val successDarkHighContrast = Color(0xFFDDFAAE)
val onSuccessDarkHighContrast = Color(0xFF000000)
val successContainerDarkHighContrast = Color(0xFFB0CC84)
val onSuccessContainerDarkHighContrast = Color(0xFF060E00)
val warningDarkHighContrast = Color(0xFFFFECE2)
val onWarningDarkHighContrast = Color(0xFF000000)
val warningContainerDarkHighContrast = Color(0xFFFEB27A)
val onWarningContainerDarkHighContrast = Color(0xFF180700)

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

    val brandLite: Color
        get() = if (isLight) Color(0xFF000000) else Color(0xFFFFFFFF)

    val brandVer: Color
        get() = if (isLight) Color(0xFF1C1C1E) else Color(0xFFE5E5EA)
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

// Default Litever Color Instances
val liteverLightColors = createLiteverColors(
    primaryLight, onPrimaryLight, primaryContainerLight, onPrimaryContainerLight,
    secondaryLight, onSecondaryLight, secondaryContainerLight, onSecondaryContainerLight,
    tertiaryLight, onTertiaryLight, tertiaryContainerLight, onTertiaryContainerLight,
    errorLight, onErrorLight, errorContainerLight, onErrorContainerLight,
    backgroundLight, onBackgroundLight, surfaceLight, onSurfaceLight,
    surfaceVariantLight, onSurfaceVariantLight, outlineLight, outlineVariantLight,
    scrimLight, inverseSurfaceLight, inverseOnSurfaceLight, inversePrimaryLight,
    surfaceDimLight, surfaceBrightLight, surfaceContainerLowestLight,
    surfaceContainerLowLight, surfaceContainerLight, surfaceContainerHighLight,
    surfaceContainerHighestLight,
    warningLight, onWarningLight, warningContainerLight, onWarningContainerLight,
    successLight, onSuccessLight, successContainerLight, onSuccessContainerLight,
    isLight = true
)

val liteverLightMediumContrastColors = createLiteverColors(
    primaryLightMediumContrast, onPrimaryLightMediumContrast, primaryContainerLightMediumContrast, onPrimaryContainerLightMediumContrast,
    secondaryLightMediumContrast, onSecondaryLightMediumContrast, secondaryContainerLightMediumContrast, onSecondaryContainerLightMediumContrast,
    tertiaryLightMediumContrast, onTertiaryLightMediumContrast, tertiaryContainerLightMediumContrast, onTertiaryContainerLightMediumContrast,
    errorLightMediumContrast, onErrorLightMediumContrast, errorContainerLightMediumContrast, onErrorContainerLightMediumContrast,
    backgroundLightMediumContrast, onBackgroundLightMediumContrast, surfaceLightMediumContrast, onSurfaceLightMediumContrast,
    surfaceVariantLightMediumContrast, onSurfaceVariantLightMediumContrast, outlineLightMediumContrast, outlineVariantLightMediumContrast,
    scrimLightMediumContrast, inverseSurfaceLightMediumContrast, inverseOnSurfaceLightMediumContrast, inversePrimaryLightMediumContrast,
    surfaceDimLightMediumContrast, surfaceBrightLightMediumContrast, surfaceContainerLowestLightMediumContrast,
    surfaceContainerLowLightMediumContrast, surfaceContainerLightMediumContrast, surfaceContainerHighLightMediumContrast,
    surfaceContainerHighestLightMediumContrast,
    warningLightMediumContrast, onWarningLightMediumContrast, warningContainerLightMediumContrast, onWarningContainerLightMediumContrast,
    successLightMediumContrast, onSuccessLightMediumContrast, successContainerLightMediumContrast, onSuccessContainerLightMediumContrast,
    isLight = true
)

val liteverLightHighContrastColors = createLiteverColors(
    primaryLightHighContrast, onPrimaryLightHighContrast, primaryContainerLightHighContrast, onPrimaryContainerLightHighContrast,
    secondaryLightHighContrast, onSecondaryLightHighContrast, secondaryContainerLightHighContrast, onSecondaryContainerLightHighContrast,
    tertiaryLightHighContrast, onTertiaryLightHighContrast, tertiaryContainerLightHighContrast, onTertiaryContainerLightHighContrast,
    errorLightHighContrast, onErrorLightHighContrast, errorContainerLightHighContrast, onErrorContainerLightHighContrast,
    backgroundLightHighContrast, onBackgroundLightHighContrast, surfaceLightHighContrast, onSurfaceLightHighContrast,
    surfaceVariantLightHighContrast, onSurfaceVariantLightHighContrast, outlineLightHighContrast, outlineVariantLightHighContrast,
    scrimLightHighContrast, inverseSurfaceLightHighContrast, inverseOnSurfaceLightHighContrast, inversePrimaryLightHighContrast,
    surfaceDimLightHighContrast, surfaceBrightLightHighContrast, surfaceContainerLowestLightHighContrast,
    surfaceContainerLowLightHighContrast, surfaceContainerLightHighContrast, surfaceContainerHighLightHighContrast,
    surfaceContainerHighestLightHighContrast,
    warningLightHighContrast, onWarningLightHighContrast, warningContainerLightHighContrast, onWarningContainerLightHighContrast,
    successLightHighContrast, onSuccessLightHighContrast, successContainerLightHighContrast, onSuccessContainerLightHighContrast,
    isLight = true
)

val liteverDarkColors = createLiteverColors(
    primaryDark, onPrimaryDark, primaryContainerDark, onPrimaryContainerDark,
    secondaryDark, onSecondaryDark, secondaryContainerDark, onSecondaryContainerDark,
    tertiaryDark, onTertiaryDark, tertiaryContainerDark, onTertiaryContainerDark,
    errorDark, onErrorDark, errorContainerDark, onErrorContainerDark,
    backgroundDark, onBackgroundDark, surfaceDark, onSurfaceDark,
    surfaceVariantDark, onSurfaceVariantDark, outlineDark, outlineVariantDark,
    scrimDark, inverseSurfaceDark, inverseOnSurfaceDark, inversePrimaryDark,
    surfaceDimDark, surfaceBrightDark, surfaceContainerLowestDark,
    surfaceContainerLowDark, surfaceContainerDark, surfaceContainerHighDark,
    surfaceContainerHighestDark,
    warningDark, onWarningDark, warningContainerDark, onWarningContainerDark,
    successDark, onSuccessDark, successContainerDark, onSuccessContainerDark,
    isLight = false
)

val liteverDarkMediumContrastColors = createLiteverColors(
    primaryDarkMediumContrast, onPrimaryDarkMediumContrast, primaryContainerDarkMediumContrast, onPrimaryContainerDarkMediumContrast,
    secondaryDarkMediumContrast, onSecondaryDarkMediumContrast, secondaryContainerDarkMediumContrast, onSecondaryContainerDarkMediumContrast,
    tertiaryDarkMediumContrast, onTertiaryDarkMediumContrast, tertiaryContainerDarkMediumContrast, onTertiaryContainerDarkMediumContrast,
    errorDarkMediumContrast, onErrorDarkMediumContrast, errorContainerDarkMediumContrast, onErrorContainerDarkMediumContrast,
    backgroundDarkMediumContrast, onBackgroundDarkMediumContrast, surfaceDarkMediumContrast, onSurfaceDarkMediumContrast,
    surfaceVariantDarkMediumContrast, onSurfaceVariantDarkMediumContrast, outlineDarkMediumContrast, outlineVariantDarkMediumContrast,
    scrimDarkMediumContrast, inverseSurfaceDarkMediumContrast, inverseOnSurfaceDarkMediumContrast, inversePrimaryDarkMediumContrast,
    surfaceDimDarkMediumContrast, surfaceBrightDarkMediumContrast, surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLowDarkMediumContrast, surfaceContainerDarkMediumContrast, surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighestDarkMediumContrast,
    warningDarkMediumContrast, onWarningDarkMediumContrast, warningContainerDarkMediumContrast, onWarningContainerDarkMediumContrast,
    successDarkMediumContrast, onSuccessDarkMediumContrast, successContainerDarkMediumContrast, onSuccessContainerDarkMediumContrast,
    isLight = false
)

val liteverDarkHighContrastColors = createLiteverColors(
    primaryDarkHighContrast, onPrimaryDarkHighContrast, primaryContainerDarkHighContrast, onPrimaryContainerDarkHighContrast,
    secondaryDarkHighContrast, onSecondaryDarkHighContrast, secondaryContainerDarkHighContrast, onSecondaryContainerDarkHighContrast,
    tertiaryDarkHighContrast, onTertiaryDarkHighContrast, tertiaryContainerDarkHighContrast, onTertiaryContainerDarkHighContrast,
    errorDarkHighContrast, onErrorDarkHighContrast, errorContainerDarkHighContrast, onErrorContainerDarkHighContrast,
    backgroundDarkHighContrast, onBackgroundDarkHighContrast, surfaceDarkHighContrast, onSurfaceDarkHighContrast,
    surfaceVariantDarkHighContrast, onSurfaceVariantDarkHighContrast, outlineDarkHighContrast, outlineVariantDarkHighContrast,
    scrimDarkHighContrast, inverseSurfaceDarkHighContrast, inverseOnSurfaceDarkHighContrast, inversePrimaryDarkHighContrast,
    surfaceDimDarkHighContrast, surfaceBrightDarkHighContrast, surfaceContainerLowestDarkHighContrast,
    surfaceContainerLowDarkHighContrast, surfaceContainerDarkHighContrast, surfaceContainerHighDarkHighContrast,
    surfaceContainerHighestDarkHighContrast,
    warningDarkHighContrast, onWarningDarkHighContrast, warningContainerDarkHighContrast, onWarningContainerDarkHighContrast,
    successDarkHighContrast, onSuccessDarkHighContrast, successContainerDarkHighContrast, onSuccessContainerDarkHighContrast,
    isLight = false
)

val LocalLiteverColors = staticCompositionLocalOf<LiteverColors> {
    error("No LiteverColors provided")
}

/**
 * Creates a complete [LiteverColors] instance for the Light theme.
 * Allows overriding key colors while defaulting the rest to standard system tokens.
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
    primary = primary,
    onPrimary = onPrimary,
    primaryContainer = primaryContainer,
    onPrimaryContainer = onPrimaryContainer,
    secondary = secondary,
    onSecondary = onSecondary,
    secondaryContainer = secondaryContainer,
    onSecondaryContainer = onSecondaryContainer,
    tertiary = tertiary,
    onTertiary = onTertiary,
    tertiaryContainer = tertiaryContainer,
    onTertiaryContainer = onTertiaryContainer,
    error = error,
    onError = onError,
    errorContainer = errorContainer,
    onErrorContainer = onErrorContainer,
    background = background,
    onBackground = onBackground,
    surface = surface,
    onSurface = onSurface,
    surfaceVariant = surfaceVariant,
    onSurfaceVariant = onSurfaceVariant,
    outline = outline,
    outlineVariant = outlineVariant,
    scrim = scrim,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    inversePrimary = inversePrimary,
    surfaceDim = surfaceDim,
    surfaceBright = surfaceBright,
    surfaceContainerLowest = surfaceContainerLowest,
    surfaceContainerLow = surfaceContainerLow,
    surfaceContainer = surfaceContainer,
    surfaceContainerHigh = surfaceContainerHigh,
    surfaceContainerHighest = surfaceContainerHighest,
    warning = warning,
    onWarning = onWarning,
    warningContainer = warningContainer,
    onWarningContainer = onWarningContainer,
    success = success,
    onSuccess = onSuccess,
    successContainer = successContainer,
    onSuccessContainer = onSuccessContainer,
    isLight = true
)

/**
 * Creates a complete [LiteverColors] instance for the Dark theme.
 * Allows overriding key colors while defaulting the rest to standard system tokens.
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
    primary = primary,
    onPrimary = onPrimary,
    primaryContainer = primaryContainer,
    onPrimaryContainer = onPrimaryContainer,
    secondary = secondary,
    onSecondary = onSecondary,
    secondaryContainer = secondaryContainer,
    onSecondaryContainer = onSecondaryContainer,
    tertiary = tertiary,
    onTertiary = onTertiary,
    tertiaryContainer = tertiaryContainer,
    onTertiaryContainer = onTertiaryContainer,
    error = error,
    onError = onError,
    errorContainer = errorContainer,
    onErrorContainer = onErrorContainer,
    background = background,
    onBackground = onBackground,
    surface = surface,
    onSurface = onSurface,
    surfaceVariant = surfaceVariant,
    onSurfaceVariant = onSurfaceVariant,
    outline = outline,
    outlineVariant = outlineVariant,
    scrim = scrim,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    inversePrimary = inversePrimary,
    surfaceDim = surfaceDim,
    surfaceBright = surfaceBright,
    surfaceContainerLowest = surfaceContainerLowest,
    surfaceContainerLow = surfaceContainerLow,
    surfaceContainer = surfaceContainer,
    surfaceContainerHigh = surfaceContainerHigh,
    surfaceContainerHighest = surfaceContainerHighest,
    warning = warning,
    onWarning = onWarning,
    warningContainer = warningContainer,
    onWarningContainer = onWarningContainer,
    success = success,
    onSuccess = onSuccess,
    successContainer = successContainer,
    onSuccessContainer = onSuccessContainer,
    isLight = false
)

/**
 * Creates a complete [LiteverColors] instance for the Light Medium Contrast theme.
 */
fun lightMediumContrastLiteverColors(
    primary: Color = primaryLightMediumContrast,
    onPrimary: Color = onPrimaryLightMediumContrast,
    primaryContainer: Color = primaryContainerLightMediumContrast,
    onPrimaryContainer: Color = onPrimaryContainerLightMediumContrast,
    secondary: Color = secondaryLightMediumContrast,
    onSecondary: Color = onSecondaryLightMediumContrast,
    secondaryContainer: Color = secondaryContainerLightMediumContrast,
    onSecondaryContainer: Color = onSecondaryContainerLightMediumContrast,
    tertiary: Color = tertiaryLightMediumContrast,
    onTertiary: Color = onTertiaryLightMediumContrast,
    tertiaryContainer: Color = tertiaryContainerLightMediumContrast,
    onTertiaryContainer: Color = onTertiaryContainerLightMediumContrast,
    error: Color = errorLightMediumContrast,
    onError: Color = onErrorLightMediumContrast,
    errorContainer: Color = errorContainerLightMediumContrast,
    onErrorContainer: Color = onErrorContainerLightMediumContrast,
    background: Color = backgroundLightMediumContrast,
    onBackground: Color = onBackgroundLightMediumContrast,
    surface: Color = surfaceLightMediumContrast,
    onSurface: Color = onSurfaceLightMediumContrast,
    surfaceVariant: Color = surfaceVariantLightMediumContrast,
    onSurfaceVariant: Color = onSurfaceVariantLightMediumContrast,
    outline: Color = outlineLightMediumContrast,
    outlineVariant: Color = outlineVariantLightMediumContrast,
    scrim: Color = scrimLightMediumContrast,
    inverseSurface: Color = inverseSurfaceLightMediumContrast,
    inverseOnSurface: Color = inverseOnSurfaceLightMediumContrast,
    inversePrimary: Color = inversePrimaryLightMediumContrast,
    surfaceDim: Color = surfaceDimLightMediumContrast,
    surfaceBright: Color = surfaceBrightLightMediumContrast,
    surfaceContainerLowest: Color = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow: Color = surfaceContainerLowLightMediumContrast,
    surfaceContainer: Color = surfaceContainerLightMediumContrast,
    surfaceContainerHigh: Color = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest: Color = surfaceContainerHighestLightMediumContrast,
    warning: Color = warningLightMediumContrast,
    onWarning: Color = onWarningLightMediumContrast,
    warningContainer: Color = warningContainerLightMediumContrast,
    onWarningContainer: Color = onWarningContainerLightMediumContrast,
    success: Color = successLightMediumContrast,
    onSuccess: Color = onSuccessLightMediumContrast,
    successContainer: Color = successContainerLightMediumContrast,
    onSuccessContainer: Color = onSuccessContainerLightMediumContrast,
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
 * Creates a complete [LiteverColors] instance for the Light High Contrast theme.
 */
fun lightHighContrastLiteverColors(
    primary: Color = primaryLightHighContrast,
    onPrimary: Color = onPrimaryLightHighContrast,
    primaryContainer: Color = primaryContainerLightHighContrast,
    onPrimaryContainer: Color = onPrimaryContainerLightHighContrast,
    secondary: Color = secondaryLightHighContrast,
    onSecondary: Color = onSecondaryLightHighContrast,
    secondaryContainer: Color = secondaryContainerLightHighContrast,
    onSecondaryContainer: Color = onSecondaryContainerLightHighContrast,
    tertiary: Color = tertiaryLightHighContrast,
    onTertiary: Color = onTertiaryLightHighContrast,
    tertiaryContainer: Color = tertiaryContainerLightHighContrast,
    onTertiaryContainer: Color = onTertiaryContainerLightHighContrast,
    error: Color = errorLightHighContrast,
    onError: Color = onErrorLightHighContrast,
    errorContainer: Color = errorContainerLightHighContrast,
    onErrorContainer: Color = onErrorContainerLightHighContrast,
    background: Color = backgroundLightHighContrast,
    onBackground: Color = onBackgroundLightHighContrast,
    surface: Color = surfaceLightHighContrast,
    onSurface: Color = onSurfaceLightHighContrast,
    surfaceVariant: Color = surfaceVariantLightHighContrast,
    onSurfaceVariant: Color = onSurfaceVariantLightHighContrast,
    outline: Color = outlineLightHighContrast,
    outlineVariant: Color = outlineVariantLightHighContrast,
    scrim: Color = scrimLightHighContrast,
    inverseSurface: Color = inverseSurfaceLightHighContrast,
    inverseOnSurface: Color = inverseOnSurfaceLightHighContrast,
    inversePrimary: Color = inversePrimaryLightHighContrast,
    surfaceDim: Color = surfaceDimLightHighContrast,
    surfaceBright: Color = surfaceBrightLightHighContrast,
    surfaceContainerLowest: Color = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow: Color = surfaceContainerLowLightHighContrast,
    surfaceContainer: Color = surfaceContainerLightHighContrast,
    surfaceContainerHigh: Color = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest: Color = surfaceContainerHighestLightHighContrast,
    warning: Color = warningLightHighContrast,
    onWarning: Color = onWarningLightHighContrast,
    warningContainer: Color = warningContainerLightHighContrast,
    onWarningContainer: Color = onWarningContainerLightHighContrast,
    success: Color = successLightHighContrast,
    onSuccess: Color = onSuccessLightHighContrast,
    successContainer: Color = successContainerLightHighContrast,
    onSuccessContainer: Color = onSuccessContainerLightHighContrast,
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
 * Creates a complete [LiteverColors] instance for the Dark Medium Contrast theme.
 */
fun darkMediumContrastLiteverColors(
    primary: Color = primaryDarkMediumContrast,
    onPrimary: Color = onPrimaryDarkMediumContrast,
    primaryContainer: Color = primaryContainerDarkMediumContrast,
    onPrimaryContainer: Color = onPrimaryContainerDarkMediumContrast,
    secondary: Color = secondaryDarkMediumContrast,
    onSecondary: Color = onSecondaryDarkMediumContrast,
    secondaryContainer: Color = secondaryContainerDarkMediumContrast,
    onSecondaryContainer: Color = onSecondaryContainerDarkMediumContrast,
    tertiary: Color = tertiaryDarkMediumContrast,
    onTertiary: Color = onTertiaryDarkMediumContrast,
    tertiaryContainer: Color = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer: Color = onTertiaryContainerDarkMediumContrast,
    error: Color = errorDarkMediumContrast,
    onError: Color = onErrorDarkMediumContrast,
    errorContainer: Color = errorContainerDarkMediumContrast,
    onErrorContainer: Color = onErrorContainerDarkMediumContrast,
    background: Color = backgroundDarkMediumContrast,
    onBackground: Color = onBackgroundDarkMediumContrast,
    surface: Color = surfaceDarkMediumContrast,
    onSurface: Color = onSurfaceDarkMediumContrast,
    surfaceVariant: Color = surfaceVariantDarkMediumContrast,
    onSurfaceVariant: Color = onSurfaceVariantDarkMediumContrast,
    outline: Color = outlineDarkMediumContrast,
    outlineVariant: Color = outlineVariantDarkMediumContrast,
    scrim: Color = scrimDarkMediumContrast,
    inverseSurface: Color = inverseSurfaceDarkMediumContrast,
    inverseOnSurface: Color = inverseOnSurfaceDarkMediumContrast,
    inversePrimary: Color = inversePrimaryDarkMediumContrast,
    surfaceDim: Color = surfaceDimDarkMediumContrast,
    surfaceBright: Color = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest: Color = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow: Color = surfaceContainerLowDarkMediumContrast,
    surfaceContainer: Color = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh: Color = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest: Color = surfaceContainerHighestDarkMediumContrast,
    warning: Color = warningDarkMediumContrast,
    onWarning: Color = onWarningDarkMediumContrast,
    warningContainer: Color = warningContainerDarkMediumContrast,
    onWarningContainer: Color = onWarningContainerDarkMediumContrast,
    success: Color = successDarkMediumContrast,
    onSuccess: Color = onSuccessDarkMediumContrast,
    successContainer: Color = successContainerDarkMediumContrast,
    onSuccessContainer: Color = onSuccessContainerDarkMediumContrast,
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

/**
 * Creates a complete [LiteverColors] instance for the Dark High Contrast theme.
 */
fun darkHighContrastLiteverColors(
    primary: Color = primaryDarkHighContrast,
    onPrimary: Color = onPrimaryDarkHighContrast,
    primaryContainer: Color = primaryContainerDarkHighContrast,
    onPrimaryContainer: Color = onPrimaryContainerDarkHighContrast,
    secondary: Color = secondaryDarkHighContrast,
    onSecondary: Color = onSecondaryDarkHighContrast,
    secondaryContainer: Color = secondaryContainerDarkHighContrast,
    onSecondaryContainer: Color = onSecondaryContainerDarkHighContrast,
    tertiary: Color = tertiaryDarkHighContrast,
    onTertiary: Color = onTertiaryDarkHighContrast,
    tertiaryContainer: Color = tertiaryContainerDarkHighContrast,
    onTertiaryContainer: Color = onTertiaryContainerDarkHighContrast,
    error: Color = errorDarkHighContrast,
    onError: Color = onErrorDarkHighContrast,
    errorContainer: Color = errorContainerDarkHighContrast,
    onErrorContainer: Color = onErrorContainerDarkHighContrast,
    background: Color = backgroundDarkHighContrast,
    onBackground: Color = onBackgroundDarkHighContrast,
    surface: Color = surfaceDarkHighContrast,
    onSurface: Color = onSurfaceDarkHighContrast,
    surfaceVariant: Color = surfaceVariantDarkHighContrast,
    onSurfaceVariant: Color = onSurfaceVariantDarkHighContrast,
    outline: Color = outlineDarkHighContrast,
    outlineVariant: Color = outlineVariantDarkHighContrast,
    scrim: Color = scrimDarkHighContrast,
    inverseSurface: Color = inverseSurfaceDarkHighContrast,
    inverseOnSurface: Color = inverseOnSurfaceDarkHighContrast,
    inversePrimary: Color = inversePrimaryDarkHighContrast,
    surfaceDim: Color = surfaceDimDarkHighContrast,
    surfaceBright: Color = surfaceBrightDarkHighContrast,
    surfaceContainerLowest: Color = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow: Color = surfaceContainerLowDarkHighContrast,
    surfaceContainer: Color = surfaceContainerDarkHighContrast,
    surfaceContainerHigh: Color = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest: Color = surfaceContainerHighestDarkHighContrast,
    warning: Color = warningDarkHighContrast,
    onWarning: Color = onWarningDarkHighContrast,
    warningContainer: Color = warningContainerDarkHighContrast,
    onWarningContainer: Color = onWarningContainerDarkHighContrast,
    success: Color = successDarkHighContrast,
    onSuccess: Color = onSuccessDarkHighContrast,
    successContainer: Color = successContainerDarkHighContrast,
    onSuccessContainer: Color = onSuccessContainerDarkHighContrast,
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
