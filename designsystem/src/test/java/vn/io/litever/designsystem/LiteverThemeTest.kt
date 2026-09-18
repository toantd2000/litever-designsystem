package vn.io.litever.designsystem

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import vn.io.litever.designsystem.theme.LiteverShapes
import vn.io.litever.designsystem.theme.asLiteverColors
import vn.io.litever.designsystem.theme.asMaterial3
import vn.io.litever.designsystem.theme.palettes.blueDarkColorScheme
import vn.io.litever.designsystem.theme.palettes.blueLightColorScheme
import vn.io.litever.designsystem.theme.successDark
import vn.io.litever.designsystem.theme.successLight
import vn.io.litever.designsystem.theme.warningDark
import vn.io.litever.designsystem.theme.warningLight

class LiteverThemeTest {

    @Test
    fun testDefaultColorSchemes() {
        assertEquals(blueLightColorScheme.primary, blueLightColorScheme.primary)
        assertEquals(blueDarkColorScheme.primary, blueDarkColorScheme.primary)
        assertNotNull(blueLightColorScheme.background)
        assertNotNull(blueDarkColorScheme.background)
    }

    @Test
    fun testLiteverShapesScale() {
        assertEquals(RoundedCornerShape(2.dp), LiteverShapes.extraSmall)
        assertEquals(RoundedCornerShape(4.dp), LiteverShapes.small)
        assertEquals(RoundedCornerShape(8.dp), LiteverShapes.medium)
        assertEquals(RoundedCornerShape(12.dp), LiteverShapes.large)
        assertEquals(RoundedCornerShape(20.dp), LiteverShapes.extraLarge)
    }

    @Test
    fun testCustomColorSchemeMapping() {
        // Consumer app (e.g. FinLog or ReMind) supplies custom ColorScheme
        val customPrimary = Color(0xFF112233)
        val customBackground = Color(0xFFEEFFEE)
        val customScheme = lightColorScheme(
            primary = customPrimary,
            background = customBackground
        )

        val liteverColors = customScheme.asLiteverColors(isLight = true)

        assertEquals(customPrimary, liteverColors.primary)
        assertEquals(customBackground, liteverColors.background)
        assertEquals(Color(0xFF1E1E1E), liteverColors.brandVer)
        assertEquals(Color(0xFF757575), liteverColors.brandLite)
        assertEquals(successLight, liteverColors.success)
        assertEquals(warningLight, liteverColors.warning)
    }

    @Test
    fun testDarkColorSchemeMapping() {
        val customDarkPrimary = Color(0xFFAABBCC)
        val customDarkScheme = darkColorScheme(
            primary = customDarkPrimary
        )

        val liteverColors = customDarkScheme.asLiteverColors(isLight = false)

        assertEquals(customDarkPrimary, liteverColors.primary)
        assertEquals(Color(0xFFEEEEEE), liteverColors.brandVer)
        assertEquals(Color(0xFF9E9E9E), liteverColors.brandLite)
        assertEquals(successDark, liteverColors.success)
        assertEquals(warningDark, liteverColors.warning)
    }

    @Test
    fun testLiteverColorsRoundTrip() {
        val lightColors = blueLightColorScheme.asLiteverColors(isLight = true)
        val m3Scheme = lightColors.asMaterial3()

        assertEquals(lightColors.primary, m3Scheme.primary)
        assertEquals(lightColors.secondary, m3Scheme.secondary)
        assertEquals(lightColors.surface, m3Scheme.surface)

        val darkColors = blueDarkColorScheme.asLiteverColors(isLight = false)
        val darkM3Scheme = darkColors.asMaterial3()

        assertEquals(darkColors.primary, darkM3Scheme.primary)
        assertEquals(darkColors.surface, darkM3Scheme.surface)
    }
}
