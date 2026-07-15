package vn.io.litever.designsystem.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// ==========================================
// LIGHT THEME COLORS
// ==========================================
val primaryLight = Color(0xFF000000)
val onPrimaryLight = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFF1D1B1A)
val onPrimaryContainerLight = Color(0xFF888381)
val secondaryLight = Color(0xFF855300)
val onSecondaryLight = Color(0xFFFFFFFF)
val secondaryContainerLight = Color(0xFFF59E0B)
val onSecondaryContainerLight = Color(0xFF613B00)
val tertiaryLight = Color(0xFF334331)
val onTertiaryLight = Color(0xFFFFFFFF)
val tertiaryContainerLight = Color(0xFF4A5A47)
val onTertiaryContainerLight = Color(0xFFBED0B8)
val errorLight = Color(0xFFB80035)
val onErrorLight = Color(0xFFFFFFFF)
val errorContainerLight = Color(0xFFE11D48)
val onErrorContainerLight = Color(0xFFFFFAF9)
val backgroundLight = Color(0xFFFDF8F7)
val onBackgroundLight = Color(0xFF1C1B1B)
val surfaceLight = Color(0xFFFDF8F7)
val onSurfaceLight = Color(0xFF1C1B1B)
val surfaceVariantLight = Color(0xFFEDE0DC)
val onSurfaceVariantLight = Color(0xFF4E4543)
val outlineLight = Color(0xFF7F7572)
val outlineVariantLight = Color(0xFFD1C4C1)
val scrimLight = Color(0xFF000000)
val inverseSurfaceLight = Color(0xFF313030)
val inverseOnSurfaceLight = Color(0xFFF4F0EF)
val inversePrimaryLight = Color(0xFFCBC5C3)
val surfaceDimLight = Color(0xFFDDD9D8)
val surfaceBrightLight = Color(0xFFFDF8F7)
val surfaceContainerLowestLight = Color(0xFFFFFFFF)
val surfaceContainerLowLight = Color(0xFFF7F3F1)
val surfaceContainerLight = Color(0xFFF1EDEC)
val surfaceContainerHighLight = Color(0xFFECE7E6)
val surfaceContainerHighestLight = Color(0xFFE6E1E0)

// Light Medium Contrast
val primaryLightMediumContrast = Color(0xFF000000)
val onPrimaryLightMediumContrast = Color(0xFFFFFFFF)
val primaryContainerLightMediumContrast = Color(0xFF1D1B1A)
val onPrimaryContainerLightMediumContrast = Color(0xFFABA6A3)
val secondaryLightMediumContrast = Color(0xFF4F2F00)
val onSecondaryLightMediumContrast = Color(0xFFFFFFFF)
val secondaryContainerLightMediumContrast = Color(0xFF996100)
val onSecondaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val tertiaryLightMediumContrast = Color(0xFF2B3A29)
val onTertiaryLightMediumContrast = Color(0xFFFFFFFF)
val tertiaryContainerLightMediumContrast = Color(0xFF4A5A47)
val onTertiaryContainerLightMediumContrast = Color(0xFFEEFFE7)
val errorLightMediumContrast = Color(0xFF72001D)
val onErrorLightMediumContrast = Color(0xFFFFFFFF)
val errorContainerLightMediumContrast = Color(0xFFD71142)
val onErrorContainerLightMediumContrast = Color(0xFFFFFFFF)
val backgroundLightMediumContrast = Color(0xFFFDF8F7)
val onBackgroundLightMediumContrast = Color(0xFF1C1B1B)
val surfaceLightMediumContrast = Color(0xFFFDF8F7)
val onSurfaceLightMediumContrast = Color(0xFF121111)
val surfaceVariantLightMediumContrast = Color(0xFFEDE0DC)
val onSurfaceVariantLightMediumContrast = Color(0xFF3C3432)
val outlineLightMediumContrast = Color(0xFF5A504E)
val outlineVariantLightMediumContrast = Color(0xFF756B68)
val scrimLightMediumContrast = Color(0xFF000000)
val inverseSurfaceLightMediumContrast = Color(0xFF313030)
val inverseOnSurfaceLightMediumContrast = Color(0xFFF4F0EF)
val inversePrimaryLightMediumContrast = Color(0xFFCBC5C3)
val surfaceDimLightMediumContrast = Color(0xFFC9C6C5)
val surfaceBrightLightMediumContrast = Color(0xFFFDF8F7)
val surfaceContainerLowestLightMediumContrast = Color(0xFFFFFFFF)
val surfaceContainerLowLightMediumContrast = Color(0xFFF7F3F1)
val surfaceContainerLightMediumContrast = Color(0xFFECE7E6)
val surfaceContainerHighLightMediumContrast = Color(0xFFE0DCDB)
val surfaceContainerHighestLightMediumContrast = Color(0xFFD5D1D0)

// Light High Contrast
val primaryLightHighContrast = Color(0xFF000000)
val onPrimaryLightHighContrast = Color(0xFFFFFFFF)
val primaryContainerLightHighContrast = Color(0xFF1D1B1A)
val onPrimaryContainerLightHighContrast = Color(0xFFD5CFCD)
val secondaryLightHighContrast = Color(0xFF412600)
val onSecondaryLightHighContrast = Color(0xFFFFFFFF)
val secondaryContainerLightHighContrast = Color(0xFF684000)
val onSecondaryContainerLightHighContrast = Color(0xFFFFFFFF)
val tertiaryLightHighContrast = Color(0xFF21301F)
val onTertiaryLightHighContrast = Color(0xFFFFFFFF)
val tertiaryContainerLightHighContrast = Color(0xFF3E4D3B)
val onTertiaryContainerLightHighContrast = Color(0xFFFFFFFF)
val errorLightHighContrast = Color(0xFF5F0017)
val onErrorLightHighContrast = Color(0xFFFFFFFF)
val errorContainerLightHighContrast = Color(0xFF960029)
val onErrorContainerLightHighContrast = Color(0xFFFFFFFF)
val backgroundLightHighContrast = Color(0xFFFDF8F7)
val onBackgroundLightHighContrast = Color(0xFF1C1B1B)
val surfaceLightHighContrast = Color(0xFFFDF8F7)
val onSurfaceLightHighContrast = Color(0xFF000000)
val surfaceVariantLightHighContrast = Color(0xFFEDE0DC)
val onSurfaceVariantLightHighContrast = Color(0xFF000000)
val outlineLightHighContrast = Color(0xFF322A28)
val outlineVariantLightHighContrast = Color(0xFF504745)
val scrimLightHighContrast = Color(0xFF000000)
val inverseSurfaceLightHighContrast = Color(0xFF313030)
val inverseOnSurfaceLightHighContrast = Color(0xFFFFFFFF)
val inversePrimaryLightHighContrast = Color(0xFFCBC5C3)
val surfaceDimLightHighContrast = Color(0xFFBBB8B7)
val surfaceBrightLightHighContrast = Color(0xFFFDF8F7)
val surfaceContainerLowestLightHighContrast = Color(0xFFFFFFFF)
val surfaceContainerLowLightHighContrast = Color(0xFFF4F0EF)
val surfaceContainerLightHighContrast = Color(0xFFE6E1E0)
val surfaceContainerHighLightHighContrast = Color(0xFFD8D3D2)
val surfaceContainerHighestLightHighContrast = Color(0xFFC9C6C5)

// ==========================================
// DARK THEME COLORS
// ==========================================
val primaryDark = Color(0xFFEBE5E3)
val onPrimaryDark = Color(0xFF1A1716)
val primaryContainerDark = Color(0xFF322E2D)
val onPrimaryContainerDark = Color(0xFFF59E0B)
val secondaryDark = Color(0xFFFFC174)
val onSecondaryDark = Color(0xFF472A00)
val secondaryContainerDark = Color(0xFF452B00)
val onSecondaryContainerDark = Color(0xFFFFDFA6)
val tertiaryDark = Color(0xFFBACCB4)
val onTertiaryDark = Color(0xFF253423)
val tertiaryContainerDark = Color(0xFF4A5A47)
val onTertiaryContainerDark = Color(0xFFBED0B8)
val errorDark = Color(0xFFFFB3B6)
val onErrorDark = Color(0xFF68001A)
val errorContainerDark = Color(0xFFE11D48)
val onErrorContainerDark = Color(0xFFFFFAF9)
val backgroundDark = Color(0xFF141313)
val onBackgroundDark = Color(0xFFE6E1E1)
val surfaceDark = Color(0xFF141313)
val onSurfaceDark = Color(0xFFE6E1E0)
val surfaceVariantDark = Color(0xFF4E4543)
val onSurfaceVariantDark = Color(0xFFD1C4C1)
val outlineDark = Color(0xFF9A8E8B)
val outlineVariantDark = Color(0xFF4E4543)
val scrimDark = Color(0xFF5A5858)
val inverseSurfaceDark = Color(0xFFE6E1E0)
val inverseOnSurfaceDark = Color(0xFF313030)
val inversePrimaryDark = Color(0xFF625D5C)
val surfaceDimDark = Color(0xFF141313)
val surfaceBrightDark = Color(0xFF3A3938)
val surfaceContainerLowestDark = Color(0xFF0F0E0E)
val surfaceContainerLowDark = Color(0xFF1C1B1B)
val surfaceContainerDark = Color(0xFF201F1F)
val surfaceContainerHighDark = Color(0xFF2B2A29)
val surfaceContainerHighestDark = Color(0xFF363434)

// Dark Medium Contrast
val primaryDarkMediumContrast = Color(0xFFE2DBD9)
val onPrimaryDarkMediumContrast = Color(0xFF282524)
val primaryContainerDarkMediumContrast = Color(0xFF95908E)
val onPrimaryContainerDarkMediumContrast = Color(0xFF000000)
val secondaryDarkMediumContrast = Color(0xFFFFD5A6)
val onSecondaryDarkMediumContrast = Color(0xFF382000)
val secondaryContainerDarkMediumContrast = Color(0xFFF59E0B)
val onSecondaryContainerDarkMediumContrast = Color(0xFF382100)
val tertiaryDarkMediumContrast = Color(0xFFCFE2C9)
val onTertiaryDarkMediumContrast = Color(0xFF1B2919)
val tertiaryContainerDarkMediumContrast = Color(0xFF849580)
val onTertiaryContainerDarkMediumContrast = Color(0xFF000000)
val errorDarkMediumContrast = Color(0xFFFFD1D2)
val onErrorDarkMediumContrast = Color(0xFF530013)
val errorContainerDarkMediumContrast = Color(0xFFFF5168)
val onErrorContainerDarkMediumContrast = Color(0xFF000000)
val backgroundDarkMediumContrast = Color(0xFF141313)
val onBackgroundDarkMediumContrast = Color(0xFFE6E1E1)
val surfaceDarkMediumContrast = Color(0xFF141313)
val onSurfaceDarkMediumContrast = Color(0xFFFFFFFF)
val surfaceVariantDarkMediumContrast = Color(0xFF4E4543)
val onSurfaceVariantDarkMediumContrast = Color(0xFFE7D9D6)
val outlineDarkMediumContrast = Color(0xFFBCAFAC)
val outlineVariantDarkMediumContrast = Color(0xFF998E8B)
val scrimDarkMediumContrast = Color(0xFF5A5858)
val inverseSurfaceDarkMediumContrast = Color(0xFFE6E1E0)
val inverseOnSurfaceDarkMediumContrast = Color(0xFF2B2A29)
val inversePrimaryDarkMediumContrast = Color(0xFF4B4746)
val surfaceDimDarkMediumContrast = Color(0xFF141313)
val surfaceBrightDarkMediumContrast = Color(0xFF464444)
val surfaceContainerLowestDarkMediumContrast = Color(0xFF080707)
val surfaceContainerLowDarkMediumContrast = Color(0xFF1E1D1D)
val surfaceContainerDarkMediumContrast = Color(0xFF292827)
val surfaceContainerHighDarkMediumContrast = Color(0xFF343232)
val surfaceContainerHighestDarkMediumContrast = Color(0xFF3F3D3D)

// Dark High Contrast
val primaryDarkHighContrast = Color(0xFFF6EEEC)
val onPrimaryDarkHighContrast = Color(0xFF000000)
val primaryContainerDarkHighContrast = Color(0xFFC7C1BF)
val onPrimaryContainerDarkHighContrast = Color(0xFF0D0B0A)
val secondaryDarkHighContrast = Color(0xFFFFEDDC)
val onSecondaryDarkHighContrast = Color(0xFF000000)
val secondaryContainerDarkHighContrast = Color(0xFFFFB34F)
val onSecondaryContainerDarkHighContrast = Color(0xFF140900)
val tertiaryDarkHighContrast = Color(0xFFE3F5DC)
val onTertiaryDarkHighContrast = Color(0xFF000000)
val tertiaryContainerDarkHighContrast = Color(0xFFB6C8B0)
val onTertiaryContainerDarkHighContrast = Color(0xFF030E03)
val errorDarkHighContrast = Color(0xFFFFECEB)
val onErrorDarkHighContrast = Color(0xFF000000)
val errorContainerDarkHighContrast = Color(0xFFFFADB1)
val onErrorContainerDarkHighContrast = Color(0xFF210004)
val backgroundDarkHighContrast = Color(0xFF141313)
val onBackgroundDarkHighContrast = Color(0xFFE6E1E1)
val surfaceDarkHighContrast = Color(0xFF141313)
val onSurfaceDarkHighContrast = Color(0xFFFFFFFF)
val surfaceVariantDarkHighContrast = Color(0xFF4E4543)
val onSurfaceVariantDarkHighContrast = Color(0xFFFFFFFF)
val outlineDarkHighContrast = Color(0xFFFBEDEA)
val outlineVariantDarkHighContrast = Color(0xFFCDC0BD)
val scrimDarkHighContrast = Color(0xFF5A5858)
val inverseSurfaceDarkHighContrast = Color(0xFFE6E1E0)
val inverseOnSurfaceDarkHighContrast = Color(0xFF000000)
val inversePrimaryDarkHighContrast = Color(0xFF4B4746)
val surfaceDimDarkHighContrast = Color(0xFF141313)
val surfaceBrightDarkHighContrast = Color(0xFF51504F)
val surfaceContainerLowestDarkHighContrast = Color(0xFF000000)
val surfaceContainerLowDarkHighContrast = Color(0xFF201F1F)
val surfaceContainerDarkHighContrast = Color(0xFF313030)
val surfaceContainerHighDarkHighContrast = Color(0xFF3C3B3B)
val surfaceContainerHighestDarkHighContrast = Color(0xFF484646)

// ==========================================
// SUCCESS & WARNING COLORS
// ==========================================
val successLight = Color(0xFF006948)
val onSuccessLight = Color(0xFFFFFFFF)
val successContainerLight = Color(0xFF00855D)
val onSuccessContainerLight = Color(0xFFF5FFF7)
val warningLight = Color(0xFF785A00)
val onWarningLight = Color(0xFFFFFFFF)
val warningContainerLight = Color(0xFFEAB308)
val onWarningContainerLight = Color(0xFF604700)

val successLightMediumContrast = Color(0xFF003F2A)
val onSuccessLightMediumContrast = Color(0xFFFFFFFF)
val successContainerLightMediumContrast = Color(0xFF007D56)
val onSuccessContainerLightMediumContrast = Color(0xFFFFFFFF)
val warningLightMediumContrast = Color(0xFF463300)
val onWarningLightMediumContrast = Color(0xFFFFFFFF)
val warningContainerLightMediumContrast = Color(0xFF8A6800)
val onWarningContainerLightMediumContrast = Color(0xFFFFFFFF)

val successLightHighContrast = Color(0xFF003321)
val onSuccessLightHighContrast = Color(0xFFFFFFFF)
val successContainerLightHighContrast = Color(0xFF005439)
val onSuccessContainerLightHighContrast = Color(0xFFFFFFFF)
val warningLightHighContrast = Color(0xFF3A2A00)
val onWarningLightHighContrast = Color(0xFFFFFFFF)
val warningContainerLightHighContrast = Color(0xFF5D4600)
val onWarningContainerLightHighContrast = Color(0xFFFFFFFF)

val successDark = Color(0xFF68DBA9)
val onSuccessDark = Color(0xFF003825)
val successContainerDark = Color(0xFF25A475)
val onSuccessContainerDark = Color(0xFF002114)
val warningDark = Color(0xFFFFD165)
val onWarningDark = Color(0xFF3F2E00)
val warningContainerDark = Color(0xFFEAB308)
val onWarningContainerDark = Color(0xFF604700)

val successDarkMediumContrast = Color(0xFF7FF2BE)
val onSuccessDarkMediumContrast = Color(0xFF002C1C)
val successContainerDarkMediumContrast = Color(0xFF25A475)
val onSuccessContainerDarkMediumContrast = Color(0xFF000000)
val warningDarkMediumContrast = Color(0xFFFFD87F)
val onWarningDarkMediumContrast = Color(0xFF322300)
val warningContainerDarkMediumContrast = Color(0xFFEAB308)
val onWarningContainerDarkMediumContrast = Color(0xFF3C2C00)

val successDarkHighContrast = Color(0xFFBAFFDB)
val onSuccessDarkHighContrast = Color(0xFF000000)
val successContainerDarkHighContrast = Color(0xFF64D7A5)
val onSuccessContainerDarkHighContrast = Color(0xFF000E07)
val warningDarkHighContrast = Color(0xFFFFEED0)
val onWarningDarkHighContrast = Color(0xFF000000)
val warningContainerDarkHighContrast = Color(0xFFF2BA17)
val onWarningContainerDarkHighContrast = Color(0xFF110A00)

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
