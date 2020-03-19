import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertEquals


@DisplayName("Necklace Matching Tests")
class NecklaceMatchingTests {
    @Test
    fun `Test areSameNecklace with 10 inputs`() {
        assertTrue(areSameNecklace("helloworld", "loworldhel"))
        assertTrue(areSameNecklace("abcabcabc", "bcabcabca"))
        assertTrue(areSameNecklace("botbusters", "bustersbot"))
        assertTrue(areSameNecklace("xyzabc", "bcxyza"))
        assertTrue(areSameNecklace("", ""))
        assertFalse(areSameNecklace("a", "b"))
        assertFalse(areSameNecklace("amarinthine", "blueberry"))
        assertFalse(areSameNecklace("aaaaaa", "aaaa"))
        assertFalse(areSameNecklace("xyxy", "yxyy"))
        assertFalse(areSameNecklace("first", "irst"))
    }

    @Test
    fun `Test repeats with 10 inputs`() {
        assertEquals(1, repeats("abcded"))
        assertEquals(1, repeats("botbusters"))
        assertEquals(6, repeats("aaaaaa"))
        assertEquals(3, repeats("xyzxyzxyz"))
        assertEquals(1, repeats("abcxyzabc"))
        assertEquals(1, repeats("abcabcxyz"))
        assertEquals(1, repeats("helloworld"))
        assertEquals(1, repeats("roguelike"))
        assertEquals(1, repeats(""))
        assertEquals(1, repeats("a"))
        assertEquals(1, repeats("abc"))
    }
}