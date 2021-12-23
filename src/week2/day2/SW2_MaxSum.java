package week2.day2;

import org.junit.Test;

public class SW2_MaxSum {
/*
 * 
 */
	
	@Test
	public void test() {
		int[] nums = {2,7,8,1,9,5};
		int k = 3;
		findMaxSum(nums, k);
	}
	
	//pseudo code
	/*
	 * 1.Start with initial sum = 0.
	 * 2.start index with 0 and maxIndex = 0
	 * 3.loop until maxIndex reaches k and sum up the elts and assign to sum.
	 * 4.loop starting from maxndex till nums.length.
	 * 5.remove nums[index] and add nums[maxIndex]
	 * 6.check for maxSum and sum and retain maxSum
	 */
	//actual code
	
	private void findMaxSum(int[] nums, int k) {
		int sum = 0;
		int index = 0;
		int maxIndex = 0;
		while(maxIndex < k) {
			sum += nums[maxIndex++];
		}
		int maxSum = sum;
		while(maxIndex < nums.length) {
			sum -= nums[index++];
			sum += nums[maxIndex++];
			 maxSum = Math.max(maxSum, sum);
		}
	}
	
	
	
	
	
	
	
	
	/*
	 * 1) Add first k elements and have a sum 
	 * 2) loop from k element until end 
	 * 	a) subtract the first element from the sum 
	 * 	b) add the new element to the sum 
	 * 	c) compare with existing sum --> whichever max --> make it max
	 */
}
