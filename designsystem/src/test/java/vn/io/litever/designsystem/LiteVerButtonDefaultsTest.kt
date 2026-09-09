package vn.io.litever.designsystem

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.dp
import org.junit.Assert.assertEquals
import org.junit.Assert.assertSame
import org.junit.Test
import vn.io.litever.designsystem.components.LiteVerButtonDefaults
import vn.io.litever.designsystem.components.LiteverButtonDefaults

class LiteVerButtonDefaultsTest {

    @Test
    fun testButtonDimensions() {
        assertEquals(40.dp, LiteVerButtonDefaults.MinHeight)
        assertEquals(64.dp, LiteVerButtonDefaults.MinWidth)
        assertEquals(18.dp, LiteVerButtonDefaults.IconSize)
        assertEquals(8.dp, LiteVerButtonDefaults.IconSpacing)
    }

    @Test
    fun testContentPaddingValues() {
        val expectedStandard = PaddingValues(horizontal = 24.dp, vertical = 10.dp)
        val expectedSmall = PaddingValues(horizontal = 16.dp, vertical = 6.dp)
        val expectedText = PaddingValues(horizontal = 12.dp, vertical = 8.dp)

        assertEquals(expectedStandard, LiteVerButtonDefaults.ContentPadding)
        assertEquals(expectedSmall, LiteVerButtonDefaults.SmallContentPadding)
        assertEquals(expectedText, LiteVerButtonDefaults.TextButtonContentPadding)
    }

    @Test
    fun testTypeAliasEquivalence() {
        // Verify LiteverButtonDefaults typealias points to LiteVerButtonDefaults
        assertSame(LiteVerButtonDefaults, LiteverButtonDefaults)
        assertEquals(LiteVerButtonDefaults.MinHeight, LiteverButtonDefaults.MinHeight)
        assertEquals(LiteVerButtonDefaults.ContentPadding, LiteverButtonDefaults.ContentPadding)
    }
}
