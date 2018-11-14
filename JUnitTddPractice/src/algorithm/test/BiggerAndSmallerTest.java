package algorithm.test;

import org.junit.Test;
import org.junit.Assert;

public class BiggerAndSmallerTest {
	
	@Test
	public void smallAndBig() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {19, 2, 5, 6, 9});
		
		System.out.println("Hello");
		Assert.assertEquals(19, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getSmaller());
	}

}
