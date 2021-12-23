package week2.day2.assignments;

import org.junit.Test;

public class As5_MinSizeSubArraySum {
	/*
	 * 209. Minimum Size Subarray Sum
	 * 
	 * Given an array of positive integers nums and a positive integer target,
	 * return the minimal length of a contiguous subarray [numsl, numsl+1, ...,
	 * numsr-1, numsr] of which the sum is greater than or equal to target. If there
	 * is no such subarray, return 0 instead.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: target = 7, nums = [2,3,1,2,4,3]
	 * 
	 * Output: 2 Explanation:
	 * 
	 * The subarray [4,3] has the minimal length under the problem constraint.
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: target = 4, nums = [1,4,4] Output: 1 
	 * 
	 * 
	 * Example 3:
	 * 
	 * Input: target = 11, nums = [1,1,1,1,1,1,1,1] Output: 0
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= target <= 109 1 <= nums.length <= 105 1 <= nums[i] <= 105
	 */
	
	//pseudo code
	/**
	 * 1.accept input as int array and int target.
	 * 
	 * 2.check target always > 1 and < 10^9. and array length > 1 and each elt > 1
	 * 
	 * 3.start start and end with 0.
	 * 
	 * 4.loop until start reaches 1 less than array length and end reaches array length.
	 * 
	 * 5.keep summing up elts from start till end indices. 
	 * 
	 * 6.Now check if this sum matches with given target.
	 * 
	 * a) if matches return length btw start and end indices.
	 * 
	 * b) else if sum < target --> keep adding elt at end index from sum.
	 * 
	 * c) else sum > target ---> keep removing elt at start index from sum.
	 */
	
	@Test
	public void test() {
		int[] nums = {2,3,1,2,4,3};
		int target = 7	;
		getMinSubArray(nums, target);
	}
	
	private int getMinSubArray(int[] nums, int target) {
		if(target < 1 || target > 10*10*10*10*10*10*10*10*10)
			throw new RuntimeException("invalid target");
		if(nums.length < 1 || nums.length > 10*10*10*10*10)
			throw new RuntimeException("invalid array of integers");
		int start = 0;
		int end = 0;
		int sum = 0;
		int minSubArrLength = 0;
		while(end <= nums.length) {
			if(sum == target) {
				Math.min(minSubArrLength, Math.abs(start-end));
			}
			else if( sum < target) {
				sum += nums[end];
				System.out.println("sum at ["+end+"] is ["+sum+"]");
				end++;
			}
			else {
				sum -= nums[start];
				System.out.println("sum after removing elt ["+start+"] is ["+sum+"]");
				start++;
			}
		}
		
		return minSubArrLength;
	}
}
