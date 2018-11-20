package tdd.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
	
	private Map<String, Integer> table;
	
	public RomanNumeral() {
		table = new HashMap <String, Integer>();
		table.put("I", 1);
		table.put("V", 5);
		table.put("X", 10);

	}

	public int convert(String roman) {
		int result = 0;
		for (int i = 0; i < roman.length(); i++) {
			result += table.get(String.valueOf(roman.charAt(i)));
		}
		return result;
	}

}
