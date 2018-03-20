package RomanNumerals.RomanNumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralCalculatorTest {

	@Test
    public void whenRomanNumeralCalculatorIsGiven1ItReturnsI() {
    	RomanNumeralCalculator romanNumeral = new RomanNumeralCalculator();
    	
        assertEquals("I", romanNumeral.getRomanNumeral(1));
    }
}
