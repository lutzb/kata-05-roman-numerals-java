package RomanNumerals.RomanNumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralCalculatorTest {

	@Test
    public void whenRomanNumeralCalculatorIsGiven1ItReturnsI() {
    	RomanNumeralCalculator romanNumeral = new RomanNumeralCalculator();
    	
        assertEquals("I", romanNumeral.getRomanNumeral(1));
    }
	
	@Test
    public void whenRomanNumeralCalculatorIsGiven2ItReturnsII() {
    	RomanNumeralCalculator romanNumeral = new RomanNumeralCalculator();
    	
        assertEquals("II", romanNumeral.getRomanNumeral(2));
    }
	
	@Test
    public void whenRomanNumeralCalculatorIsGiven4ItReturnsIV() {
    	RomanNumeralCalculator romanNumeral = new RomanNumeralCalculator();
    	
        assertEquals("IV", romanNumeral.getRomanNumeral(4));
    }
}
