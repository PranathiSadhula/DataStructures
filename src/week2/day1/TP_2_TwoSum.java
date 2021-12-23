package week2.day1;

import org.junit.Test;

public class TP_2_TwoSum {
	/*
	 * Given an integer array, find indices of the matching 2 elts to sum up to give the target.
	 * 
	 * The same questn can be rewritten as below :
	 * 
	 * GIven integer array, find the indices of matching numbers giving the target/
	 */

	
	//********************test data**********************
	@Test // +ve
		public void example1() {
			int[] nums = {2,7,11,15};
			int target = 9;
			twoSum_TP(nums, target);
			System.out.println("=====================");
		}

	@Test // edge
		public void example2() {
			
			int[] nums = {2,2,3,1,4,0,5};
			int target = 5;
			twoSum_TP(nums, target);
			System.out.println("=====================");

		}


		@Test // negative
		public void example3() {
			int[] nums = {2,2,3,1,4,0,5};
			int target = 45;
			twoSum_TP(nums, target);
			System.out.println("=====================");
		}
		
	//pseudo code
		/*
		 * 1.accept input int array and int target.
		 * 2.start left from 0 and rt from length-1.
		 * 3.loop until left < rt
		 * 4.compare sum of elts at left and rt indices with given target 
		 * 		a) if equal ==> print left and rt.and increment left, decrease rt.
		 * 		b) if sum < target ==> increment left.
		 * 		c) if sum > target ==> decrease rt.
		 */

		private void twoSum_TP(int[] nums, int target) {
			int left = 0;
			int rt = nums.length-1;
		
			while(left < rt) {
				int sum = nums[left]+nums[rt];
				if( sum== target)
				{
					System.out.println(left+++ ","+rt);
					rt = nums.length-1;
				}
				else rt--;
				
			}
			
		}

}
