package junit.test;

public class SmallestAndBiggest {
	
	private int smallest = Integer.MAX_VALUE;
	private int biggest = Integer.MIN_VALUE;
	
	public void smallestAndBiggestNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > biggest) {
				biggest = numbers[i];
			}
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
	}

	public int getSmallest() {
		return smallest;
	}

	public int getBiggest() {
		return biggest;
	}
	
	

}
