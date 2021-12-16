package week1.day1.assignments;

import org.junit.Test;

public class As2_MaxConsecutiveOnesCount {
	/*
	 * 2. 485. Max Consecutive Ones Link:
	 * https://leetcode.com/problems/max-consecutive-ones/ Problem Statement: Given
	 * a binary array nums, return the maximum number of consecutive 1's in the
	 * array. Example 1: Input: nums = [1,1,0,1,1,1] Output: 3 Explanation: The
	 * first two digits or the last three digits are consecutive 1s. The maximum
	 * number of consecutive 1s is 3. Example 2: Input: nums = [1,0,1,1,0,1] Output:
	 * 2
	 * 
	 */

	// testdata
	@Test
	public void testPos() {
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		int maxConsecOnesCount = 3;
		getMaxConsecutiveOnesCount(nums);
	}

	//pseudo code
	/*
	 * 1.accept input binary array.
	 * 2.check if array size < 1 or >  10 * 10 * 10 * 10 * 10
	 * 3.initialize a int variables oneCount and maxCount with 0;
	 * 4.loop over the array and check if ith elt matches with 1
	 * 5.if elt matches with 1, increment oneCount.
	 * 6.using Math.maxcompare maxCOunt and oneCOunt and assign max value to maxCount
	 * 7.if elt is not matches qith 1, reassign onecount to 0.
	 * 8.return maxCOunt.
	 */
	
	//actual code
	private int getMaxConsecutiveOnesCount(int[] nums) {
		if (nums.length == 0 || nums.length == 10 * 10 * 10 * 10 * 10)
			return 0;
		int oneCount = 0;
		int maxCount = 0;
		for (int i = 0; i <= nums.length-1; i++) {
			if(nums[i] == 1)
			{
				oneCount++;
				maxCount = Math.max(maxCount, oneCount);
			}
			else
				oneCount = 0;
		}
		
		return maxCount;
	}
}
