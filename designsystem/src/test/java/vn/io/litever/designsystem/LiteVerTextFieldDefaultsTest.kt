package vn.io.litever.designsystem

import org.junit.Assert.assertNotNull
import org.junit.Assert.assertSame
import org.junit.Test
import vn.io.litever.designsystem.components.textfield.LiteVerTextFieldDefaults
import vn.io.litever.designsystem.components.textfield.LiteverTextFieldDefaults

class LiteVerTextFieldDefaultsTest {

    @Test
    fun testTypeAliasEquivalence() {
        assertSame(LiteVerTextFieldDefaults, LiteverTextFieldDefaults)
        assertNotNull(LiteVerTextFieldDefaults)
        assertNotNull(LiteverTextFieldDefaults)
    }

    @Test
    fun testDefaultsObjectDeclaredMethods() {
        val methods = LiteVerTextFieldDefaults::class.java.methods.map { it.name }
        assert(methods.contains("colors") || methods.any { it.startsWith("colors") })
        assert(methods.contains("textFieldColors") || methods.any { it.startsWith("textFieldColors") })
        assert(methods.contains("outlinedColors") || methods.any { it.startsWith("outlinedColors") })
        assert(methods.contains("outlinedTextFieldColors") || methods.any { it.startsWith("outlinedTextFieldColors") })
        assert(methods.contains("shape") || methods.any { it.startsWith("getShape") })
    }
}
