package week1.day1;

import org.junit.Test;

public class TwoSum {
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
			twoSum_BruteForce(nums, target);
			// Output --> {0,1}
		}

		//@Test // edge
		public void example2() {
			
			int[] nums = {2,2,3,1,4,0,5};
			int target = 5;
			twoSum_BruteForce(nums, target);
			//Output --> {{0,2},{1,2},{3,4},{5,6}}

		}

		@Test // negative
		public void example3() {
			int[] nums = {2,2,3,1,4,0,5};
			int target = 45;
			twoSum_BruteForce(nums, target);

			//output => throw saying no match
		}

		
		//pseudo code
		/*
		 * 1.accept input as integer array and expected target
		 * check if array size > 0, if not throw exception or return {}
		 * 2.traverse every elt in the array using for loop starting from 0th index to length of array.
		 * 3.add this elt with next elt in outer loop
		 * 4.compare sum with target.
		 * 	a) if sum matches --> store this elt in a list
		 * 	b) if not continue.
		 * 5.after for loop ends, return the above list.
		 *  
		 */
		//actual code
		

		private void twoSum_BruteForce(int[] nums, int target) {
			if(nums.length == 0)
				throw new RuntimeException("Invalid array ");
			boolean bMatch = false;
				for(int i = 0; i < nums.length -1 ; i++) {
				if(nums[i]+nums[i+1] == target) {
					bMatch = true;
					System.out.println(i+","+(i+1));
				}
					
			}
			if(!bMatch)
				throw new RuntimeException("There is no matching indices!! ");
		}
		
}
