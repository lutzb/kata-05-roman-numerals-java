package RomanNumerals.RomanNumerals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RomanNumeralCalculator {
    
	public String getRomanNumeral(int value) {
		Map<Integer, String> mappedValues = romanNumeralMap();
		String romanNumeral = "";
		while (value > 0) {
			Optional<String> subset = Optional.ofNullable(mappedValues.get(value));
			
			if (subset.isPresent()) {
				romanNumeral = subset.get() + romanNumeral;
				value = 0;
			} else {
				romanNumeral = "I" + romanNumeral;
				value -= 1;
			}
		}
		return romanNumeral;
	}
	
	public Map<Integer, String> romanNumeralMap() {
		Map<Integer, String> romanNumeralMapping = new HashMap<Integer, String>();
		
		romanNumeralMapping.put(1, "I");
		romanNumeralMapping.put(4, "IV");
		romanNumeralMapping.put(5, "V");
		
		return romanNumeralMapping;
	}
}
