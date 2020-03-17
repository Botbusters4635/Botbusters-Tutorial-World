import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import applyTax

@DisplayName("Progressive Taxation Tests")
class ProgressiveTaxationTests {
    @Test
    fun `Test progressive taxation function with 5 inputs`() {
        assertEquals(0.0, applyTax(4566.0))
        assertEquals(700.0, applyTax(17000.0))
        assertEquals(1.0, applyTax(10010.0))
        assertEquals(8697.35, applyTax(56789.0))
        assertEquals(473326.8, applyTax(1234567.0))
    }

    @Test
    fun `Test income from tax rate function with 5 inputs` () {
        assertTrue(computeIncomeForTaxRate(0.00) in 0.0 .. 10000.0)
        assertEquals(25000.0, computeIncomeForTaxRate(0.06))
        assertEquals(34375.0, computeIncomeForTaxRate(0.09))
        assertEquals(256250.0, computeIncomeForTaxRate(0.32))
        assertEquals(Double.NaN, computeIncomeForTaxRate(0.40))
    }
}