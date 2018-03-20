package RomanNumerals.RomanNumerals;

public class RomanNumeralCalculator {
    
	public String getRomanNumeral(int value) {
		String romanNumeral = "";
		if (value < 4) {
			for (int i = 0; i < value; i++) {
				romanNumeral += "I";
			}	
		} else if (value == 4) {
			romanNumeral = "IV";
		}
		return romanNumeral;
	}
}
