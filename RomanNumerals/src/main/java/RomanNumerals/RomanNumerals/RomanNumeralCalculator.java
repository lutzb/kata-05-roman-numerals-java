package RomanNumerals.RomanNumerals;

public class RomanNumeralCalculator {
    
	public String getRomanNumeral(int value) {
		String romanNumeral = "";
		for (int i = 0; i < value; i++) {
			romanNumeral += "I";
		}
		return romanNumeral;
	}
}
