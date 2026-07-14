package vn.io.litever.designsystem.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// ==========================================
// CHẾ ĐỘ SÁNG (LIGHT THEME) - Tối ưu tương phản
// ==========================================
val primaryLight = Color(0xFF000000)
val onPrimaryLight = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFF1F1F1F)
val onPrimaryContainerLight = Color(0xFFFFFFFF)

val secondaryLight = Color(0xFF555555)
val onSecondaryLight = Color(0xFFFFFFFF)
val secondaryContainerLight = Color(0xFFF2F2F7)
val onSecondaryContainerLight = Color(0xFF1C1C1E)

val tertiaryLight = Color(0xFFE1306C)
val onTertiaryLight = Color(0xFFFFFFFF)
val tertiaryContainerLight = Color(0xFFFFEBF0)
val onTertiaryContainerLight = Color(0xFF3F0015)

val errorLight = Color(0xFFBA1A1A)
val onErrorLight = Color(0xFFFFFFFF)
val errorContainerLight = Color(0xFFFFDAD6)
val onErrorContainerLight = Color(0xFF410002)

val warningLight = Color(0xFF8B5000)
val onWarningLight = Color(0xFFFFFFFF)
val warningContainerLight = Color(0xFFFFDCBE)
val onWarningContainerLight = Color(0xFF2D1600)

val successLight = Color(0xFF006D32)
val onSuccessLight = Color(0xFFFFFFFF)
val successContainerLight = Color(0xFF98F9AB)
val onSuccessContainerLight = Color(0xFF00210B)

val backgroundLight = Color(0xFFFFFFFF)
val onBackgroundLight = Color(0xFF000000)
val surfaceLight = Color(0xFFFFFFFF)
val onSurfaceLight = Color(0xFF000000)

val surfaceVariantLight = Color(0xFFF2F2F7)   // Nền Card: Xám nhạt tách biệt rõ với nền trắng
val onSurfaceVariantLight = Color(0xFF636366) // Text trên card: đủ tiêu chuẩn tương phản
val outlineLight = Color(0xFFC7C7CC)          // Viền rõ ràng hơn cho Button/Card
val outlineVariantLight = Color(0xFFE5E5EA)   // Đường kẻ Divider thanh mảnh
val scrimLight = Color(0xFF000000)

val inverseSurfaceLight = Color(0xFF1C1C1E)
val inverseOnSurfaceLight = Color(0xFFF2F2F7)
val inversePrimaryLight = Color(0xFFFFFFFF)

// Dải màu Surface mới cho Light Theme
val surfaceDimLight = Color(0xFFE5E5EA)
val surfaceBrightLight = Color(0xFFFFFFFF)
val surfaceContainerLowestLight = Color(0xFFFFFFFF)
val surfaceContainerLowLight = Color(0xFFF8F9FA)
val surfaceContainerLight = Color(0xFFF2F2F7)
val surfaceContainerHighLight = Color(0xFFE5E5EA)
val surfaceContainerHighestLight = Color(0xFFD1D1D6)

// ==========================================
// CHẾ ĐỘ TỐI (DARK THEME) - Đã tối ưu chống dính thành phần
// ==========================================
val primaryDark = Color(0xFFFFFFFF)
val onPrimaryDark = Color(0xFF000000)
val primaryContainerDark = Color(0xFF2C2C2E)
val onPrimaryContainerDark = Color(0xFFFFFFFF)

val secondaryDark = Color(0xFFAEAED2)
val onSecondaryDark = Color(0xFF1C1C1E)
val secondaryContainerDark = Color(0xFF2C2C2E)
val onSecondaryContainerDark = Color(0xFFE5E5EA)

val tertiaryDark = Color(0xFFF06292)
val onTertiaryDark = Color(0xFF5F0022)
val tertiaryContainerDark = Color(0xFF3F0015)
val onTertiaryContainerDark = Color(0xFFFFEBF0)

val errorDark = Color(0xFFFFB4AB)
val onErrorDark = Color(0xFF690005)
val errorContainerDark = Color(0xFF93000A)
val onErrorContainerDark = Color(0xFFFFDAD6)

val warningDark = Color(0xFFFFB870)
val onWarningDark = Color(0xFF4B2800)
val warningContainerDark = Color(0xFF6A3C00)
val onWarningContainerDark = Color(0xFFFFDCBE)

val successDark = Color(0xFF7DDA91)
val onSuccessDark = Color(0xFF003917)
val successContainerDark = Color(0xFF005224)
val onSuccessContainerDark = Color(0xFF98F9AB)

val backgroundDark = Color(0xFF000000)
val onBackgroundDark = Color(0xFFF3F5F7)
val surfaceDark = Color(0xFF000000)
val onSurfaceDark = Color(0xFFF3F5F7)

// Sửa lại các token xám để Card tách rõ khỏi nền đen #000000
val surfaceVariantDark = Color(0xFF1C1C1E)     // Nền Card chính (Nâng lên 1C để rõ khối hơn)
val onSurfaceVariantDark = Color(0xFFA0A0A0)
val outlineDark = Color(0xFF48484A)            // Viền Button: Sáng rõ hơn một chút
val outlineVariantDark = Color(0xFF2C2C2E)     // Đường Divider: Đủ sáng để phân cách hàng/cột
val scrimDark = Color(0xFF000000)

val inverseSurfaceDark = Color(0xFFF2F2F7)
val inverseOnSurfaceDark = Color(0xFF1C1C1E)
val inversePrimaryDark = Color(0xFF000000)

// Dải màu Surface mới cho Dark Theme - Phân cấp khoảng cách xa nhau để chống bết màu
val surfaceDimDark = Color(0xFF0A0A0A)
val surfaceBrightDark = Color(0xFF1C1C1E)
val surfaceContainerLowestDark = Color(0xFF000000) // Đáy dưới cùng
val surfaceContainerLowDark = Color(0xFF121212)    // Thành phần phụ nhẹ
val surfaceContainerDark = Color(0xFF1C1C1E)       // Nền Card tiêu chuẩn trên background đen
val surfaceContainerHighDark = Color(0xFF2C2C2E)   // Nền Dialog / Bottom Sheet nổi lên trên Card
val surfaceContainerHighestDark = Color(0xFF3A3A3C) // Thành phần ưu tiên cao nhất hoặc trạng thái Hover/Pressed

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

// Default Light Palette
val liteverLightColors = LiteverColors(
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
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    surfaceTint = primaryLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    warning = warningLight,
    onWarning = onWarningLight,
    warningContainer = warningContainerLight,
    onWarningContainer = onWarningContainerLight,
    success = successLight,
    onSuccess = onSuccessLight,
    successContainer = successContainerLight,
    onSuccessContainer = onSuccessContainerLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    surfaceBright = surfaceBrightLight,
    surfaceDim = surfaceDimLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
    isLight = true
)

// Default Dark Palette
val liteverDarkColors = LiteverColors(
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
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    surfaceTint = primaryDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    warning = warningDark,
    onWarning = onWarningDark,
    warningContainer = warningContainerDark,
    onWarningContainer = onWarningContainerDark,
    success = successDark,
    onSuccess = onSuccessDark,
    successContainer = successContainerDark,
    onSuccessContainer = onSuccessContainerDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    surfaceBright = surfaceBrightDark,
    surfaceDim = surfaceDimDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
    isLight = false
)

val LocalLiteverColors = staticCompositionLocalOf<LiteverColors> {
    error("No LiteverColors provided")
}