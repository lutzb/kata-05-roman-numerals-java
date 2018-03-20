package RomanNumerals.RomanNumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralCalculatorTest {
	
	RomanNumeralCalculator romanNumeral;
	
	@Before
	public void setup () {
		romanNumeral = new RomanNumeralCalculator();
	}

	@Test
    public void whenRomanNumeralCalculatorIsGiven1ItReturnsI() {
        assertEquals("I", romanNumeral.getRomanNumeral(1));
    }
	
	@Test
    public void whenRomanNumeralCalculatorIsGiven2ItReturnsII() {
        assertEquals("II", romanNumeral.getRomanNumeral(2));
    }
	
	@Test
    public void whenRomanNumeralCalculatorIsGiven3ItReturnsIII() {
        assertEquals("III", romanNumeral.getRomanNumeral(3));
    }
	
	@Test
    public void whenRomanNumeralCalculatorIsGiven4ItReturnsIV() {
        assertEquals("IV", romanNumeral.getRomanNumeral(4));
    }
	
	@Test
    public void whenRomanNumeralCalculatorIsGiven5ItReturnsV() {
        assertEquals("V", romanNumeral.getRomanNumeral(5));
    }
	
	@Test
    public void whenRomanNumeralCalculatorIsGiven6ItReturnsVI() {
        assertEquals("VI", romanNumeral.getRomanNumeral(6));
    }
	
	@Test
    public void whenRomanNumeralCalculatorIsGiven7ItReturnsVII() {
        assertEquals("VII", romanNumeral.getRomanNumeral(7));
    }
	
	@Test
    public void whenRomanNumeralCalculatorIsGiven8ItReturnsVIII() {
        assertEquals("VIII", romanNumeral.getRomanNumeral(8));
    }
}
