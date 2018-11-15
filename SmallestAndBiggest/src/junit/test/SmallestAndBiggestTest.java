package junit.test;

import org.junit.Test;
import org.junit.Assert;

public class SmallestAndBiggestTest {
	
	@Test
	public void oddNumbers() {
		SmallestAndBiggest algorithm = new SmallestAndBiggest();
		
		algorithm.smallestAndBiggestNumbers(new int[]{1, 3, 5, 7 ,9, 11});
		
		Assert.assertEquals(11, algorithm.getBiggest());
		Assert.assertEquals(1, algorithm.getSmallest());
	}
	
	public void evenNumbers() {
		SmallestAndBiggest algorithm = new SmallestAndBiggest();
		
		algorithm.smallestAndBiggestNumbers(new int[]{2, 4, 6, 8 ,10, 12});
		
		Assert.assertEquals(12, algorithm.getBiggest());
		Assert.assertEquals(2, algorithm.getSmallest());
	}
	
	public void noOrder() {
		SmallestAndBiggest algorithm = new SmallestAndBiggest();
		
		algorithm.smallestAndBiggestNumbers(new int[]{3, 27, 7, 86 ,34, 58});
		
		Assert.assertEquals(86, algorithm.getBiggest());
		Assert.assertEquals(3, algorithm.getSmallest());
	}

}
