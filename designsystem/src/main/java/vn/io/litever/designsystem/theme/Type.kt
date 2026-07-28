package vn.io.litever.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import vn.io.litever.designsystem.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val LiteverFont = GoogleFont("Nunito")

val LiteverFontFamily = FontFamily(
    Font(googleFont = LiteverFont, fontProvider = provider),
)

class LiteverTypography(
    val displayLarge: TextStyle,
    val displayMedium: TextStyle,
    val displaySmall: TextStyle,
    val headlineLarge: TextStyle,
    val headlineMedium: TextStyle,
    val headlineSmall: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val bodyLarge: TextStyle,
    val bodyMedium: TextStyle,
    val bodySmall: TextStyle,
    val labelLarge: TextStyle,
    val labelMedium: TextStyle,
    val labelSmall: TextStyle,
)

val defaultLiteverTypography = with(Typography()) {
    LiteverTypography(
        displayLarge = displayLarge.copy(fontFamily = LiteverFontFamily),
        displayMedium = displayMedium.copy(fontFamily = LiteverFontFamily),
        displaySmall = displaySmall.copy(fontFamily = LiteverFontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = LiteverFontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = LiteverFontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = LiteverFontFamily),
        titleLarge = titleLarge.copy(fontFamily = LiteverFontFamily),
        titleMedium = titleMedium.copy(fontFamily = LiteverFontFamily),
        titleSmall = titleSmall.copy(fontFamily = LiteverFontFamily),
        bodyLarge = bodyLarge.copy(fontFamily = LiteverFontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = LiteverFontFamily),
        bodySmall = bodySmall.copy(fontFamily = LiteverFontFamily),
        labelLarge = labelLarge.copy(fontFamily = LiteverFontFamily),
        labelMedium = labelMedium.copy(fontFamily = LiteverFontFamily),
        labelSmall = labelSmall.copy(fontFamily = LiteverFontFamily)
    )
}

val LocalLiteverTypography = staticCompositionLocalOf<LiteverTypography> {
    error("No LiteverTypography provided")
}

// Helper to convert LiteverTypography to Material3 Typography
fun LiteverTypography.asMaterial3(): Typography = Typography(
    displayLarge = displayLarge,
    displayMedium = displayMedium,
    displaySmall = displaySmall,
    headlineLarge = headlineLarge,
    headlineMedium = headlineMedium,
    headlineSmall = headlineSmall,
    titleLarge = titleLarge,
    titleMedium = titleMedium,
    titleSmall = titleSmall,
    bodyLarge = bodyLarge,
    bodyMedium = bodyMedium,
    bodySmall = bodySmall,
    labelLarge = labelLarge,
    labelMedium = labelMedium,
    labelSmall = labelSmall
)
