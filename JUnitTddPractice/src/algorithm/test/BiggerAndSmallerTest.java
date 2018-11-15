package algorithm.test;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class BiggerAndSmallerTest {
	
	private BiggerAndSmaller algorithm;
	
	@Before
	public void setUp() {
		algorithm = new BiggerAndSmaller();
		System.out.println("setUp()");
	}
	
	private int[] nums(int... ns) {
		return ns;
	}
	
	private void assertNumbers(int smallest, int biggest) {
		Assert.assertEquals(biggest, algorithm.getBigger());
		Assert.assertEquals(smallest, algorithm.getSmaller());
	}
	
	@Test
	public void numbersInIncreasingOrder() {
		
		algorithm.find(nums(2, 3, 4));
		
		assertNumbers(2, 4);
	}
	
	@Test
	public void numbersInDecreasingOrder() {

		algorithm.find(nums(4, 3, 2));
		
		assertNumbers(2, 4);
	}
	
	@Test
	public void numbersInAnyOrder() {

		algorithm.find(nums(19, 5, 2, 17, 15, 10));
		
		assertNumbers(2, 19);
	}
	
	@Test
	public void onlyOneNumber() {

		algorithm.find(nums(16));
		
		assertNumbers(16, 16);
	}
	
	@Test
	public void repeatedNumbers() {

		algorithm.find(nums(16, 2, 16, 3, 4, 5, 15, 16));
		
		assertNumbers(2, 16);
	}

}
