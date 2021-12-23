package week2.day2.assignments;

import java.util.HashMap;

import org.junit.Test;

public class As4_ContainsDuplicate {
	/*
	 * Given an integer array nums and an integer k, return true if there are two
	 * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
	 * - j) <= k.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3,1], k = 3 Output: true Example 2:
	 * 
	 * Input: nums = [1,0,1,1], k = 1 Output: true Example 3:
	 * 
	 * Input: nums = [1,2,3,1,2,3], k = 2 Output: false
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 105 -109 <= nums[i] <= 109 0 <= k <= 105
	 */
	
	//pseudo code
	/*
	 * 1.accept int array and int k value as input.
	 * 
	 * 2.check always if nums.length >= 1 and <= 10^5.
	 * 
	 * 3.check if k is always >= 0 and < 10^5.
	 * 
	 * 4.initialize start with 0 and end with start+1.
	 * 
	 * 5.loop until start < nums.length and end == nums.length.
	 * 
	 * 6.check if any duplicates available. 
	 * 
	 * 7.if duplicates yes==> check if the abs of their indices subtraction matches given int k. ==> if yes return true.
	 * 
	 * 8.else return false.
	 * 
	 * 
	 */
	
	@Test
	public void test() {
		int[] nums = {1,0,1,1};
		int k = 1;
		System.out.println(containsDuplicate(nums, k));
		System.out.println(containsNearbyDuplicate(nums, k));
	}
	//actual code [1,2,3,1,2,3]
	private boolean containsDuplicate(int[] nums, int k) {
		
		if(nums.length < 1 || nums.length > 10*10*10*10*10)
			throw new RuntimeException("");
		if(k < 0 || k > 10*10*10*10*10)
			throw new RuntimeException("");
		int start = 0;
		int end = start +1;
		while(start < nums.length-1 && end <= nums.length - 1) {
			if(nums[start] == nums[end] && Math.abs(start - end) <= k)
				return true;
			if(end == nums.length-1)
			{
				start++;
				end =start;
			}
			end++;
		}
		
		return false;
	}
	
	
	  public boolean containsNearbyDuplicate(int[] nums, int k) {
		 	HashMap<Integer, Integer> mapWithDups = new HashMap<Integer, Integer>();
				for (int index = 0; index < nums.length; index++) {
					if (mapWithDups.containsKey(nums[index]) && Math.abs(mapWithDups.get(nums[index]) - index) <= k)
						return true;
					else
						mapWithDups.put(nums[index], index);
				}
				return false;
		    }
}
