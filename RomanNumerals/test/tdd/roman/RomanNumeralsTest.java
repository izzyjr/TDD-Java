package tdd.roman;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {
	
	// I - 1
	// II - 2
	// V - 5
	// VII - 7
	// XVI - 16
	// IV - 4
	// XIV - 14
	
	//I - 1
	@Test 
	public void aSingleNumber() {
		RomanNumeral roman = new RomanNumeral();
		int number = roman.convert("I");
		
		Assert.assertEquals(1, number);
	}

}
