package algorithm.test;

import org.junit.Test;
import org.junit.Assert;

public class BiggerAndSmallerTest {
	
	@Test
	public void numbersInIncreasingOrder() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {2, 3, 4});
		
		Assert.assertEquals(4, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getSmaller());
	}
	
	@Test
	public void numbersInDecreasingOrder() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {4, 3, 2});
		
		Assert.assertEquals(4, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getSmaller());
	}
	
	@Test
	public void numbersInAnyOrder() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {19, 5, 2, 17, 15, 10});
		
		Assert.assertEquals(19, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getSmaller());
	}
	
	@Test
	public void onlyOneNumber() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {16});
		
		Assert.assertEquals(16, algorithm.getBigger());
		Assert.assertEquals(16, algorithm.getSmaller());
	}
	
	@Test
	public void repeatedNumbers() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {16, 2, 16, 3, 4, 5, 15, 16});
		
		Assert.assertEquals(16, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getSmaller());
	}

}
