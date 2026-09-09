package vn.io.litever.designsystem

import androidx.compose.ui.unit.dp
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import vn.io.litever.designsystem.theme.LiteverSpacing

class LiteverSpacingTest {

    @Test
    fun testDefaultSpacingValues() {
        val spacing = LiteverSpacing()

        assertEquals(0.dp, spacing.none)
        assertEquals(2.dp, spacing.tiny)
        assertEquals(4.dp, spacing.extraSmall)
        assertEquals(8.dp, spacing.small)
        assertEquals(12.dp, spacing.smallMedium)
        assertEquals(16.dp, spacing.medium)
        assertEquals(20.dp, spacing.mediumLarge)
        assertEquals(24.dp, spacing.large)
        assertEquals(32.dp, spacing.extraLarge)
        assertEquals(48.dp, spacing.doubleLarge)
        assertEquals(64.dp, spacing.tripleLarge)
    }

    @Test
    fun testSpacingScaleAscendingOrder() {
        val s = LiteverSpacing()

        assertTrue(s.none < s.tiny)
        assertTrue(s.tiny < s.extraSmall)
        assertTrue(s.extraSmall < s.small)
        assertTrue(s.small < s.smallMedium)
        assertTrue(s.smallMedium < s.medium)
        assertTrue(s.medium < s.mediumLarge)
        assertTrue(s.mediumLarge < s.large)
        assertTrue(s.large < s.extraLarge)
        assertTrue(s.extraLarge < s.doubleLarge)
        assertTrue(s.doubleLarge < s.tripleLarge)
    }

    @Test
    fun testCustomSpacingOverride() {
        val custom = LiteverSpacing(
            small = 10.dp,
            medium = 20.dp,
            large = 30.dp
        )

        assertEquals(10.dp, custom.small)
        assertEquals(20.dp, custom.medium)
        assertEquals(30.dp, custom.large)
        assertEquals(4.dp, custom.extraSmall) // default preserved
    }

    @Test
    fun testSpacingCopy() {
        val original = LiteverSpacing()
        val modified = original.copy(medium = 18.dp)

        assertEquals(16.dp, original.medium)
        assertEquals(18.dp, modified.medium)
        assertEquals(original.large, modified.large)
    }
}
