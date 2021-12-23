package week2.day2;

import org.junit.Test;

public class SW1_SubArrOfSum {
	/*
	 *Given an array of +ve integers, find all subarrays summing up to given target k.
	 */
	
	//pseudo code
	/*
	 * 1.Start with initial sum = 0.
	 * 2.start index with 0.
	 * 3.loop until array size.
	 * 4.sum ith elt to intial sum  and check if matches with target.
	 * 		a) if matches --> print indices and grow left and rt. by subtracting sum with nums[left] and summing sum with nums[rt]
	 * 		b) if sum > target --> subtract nums[left] 
	 * 		c) if sum < target --> add nums[rt]..
	 */
	
	
	@Test
	public void test() {
		int[] nums = {1,7,4,3,1,2,1,5,1};
		int k = 8;
		findSubArray(nums, k);
	}
	private void findSubArray(int[] nums, int k) {
		int sum = 0;
		int left = 0; 
		int rt = 0;
		
		while(left < nums.length && rt < nums.length) {
			
			if(sum < k) {
				sum += nums[rt++];
			}
			else if (sum > k) {
				sum -= nums[left++];
			}
			else {
				System.out.println("("+left+","+(rt-1)+")");
				sum -= nums[left++];
				sum += nums[rt++];
			}
		}
	}
}
