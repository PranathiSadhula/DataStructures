package week2.day1.assignments;

import org.junit.Assert;
import org.junit.Test;

public class AS1_SortedSquaresUsingAbs {
/**
 * Given sorted integer array in non-decreasing order, 
 * return the  array of the squares of each number sorted in non-decreasing order
 */
	/*
	 * 
	 * 1) Create a new array of same size and value 2) left = 0, right = len-1 3) insertIndex = len - 1
	 *  (bigger number at end) 4) while (left <= right) a) If left absolute is smaller than right absolute --> insert the squared value of left in the insert index b) else insert the squared value of right in the insert index
	 */
	
	//test data
		//	@Test
			public void testEdgeCase() {
				int[] nums = {-7,-5,1,4,6,7};
				int[] output = {1,16,25,36,49,49};
				Assert.assertArrayEquals(output, squareAndSort(nums));
			}
			@Test
			public void test() {
				int[] nums = {-7,-3,2,9,11};
				int[] output = {4,9,49,81,121};
				Assert.assertArrayEquals(output, squareAndSort(nums));
			
			}
			
			
		//	@Test
			public void testNegative() {
				int[] nums = {-4,-1,0,3,10};
				int[] output = {0,1,9,16,100};
				Assert.assertArrayEquals(output, squareAndSort(nums));
			}
			
		//	@Test
			public void testPositive() {
				int[] nums = {2,3,4,4,5};
				int[] output = {4,9,16,16,25};
				Assert.assertArrayEquals(output, squareAndSort(nums));
			}
			
		//pseudo code
			/*
			 * 
			 */
			
			
	/*
	 * int[] nums = {-7,-5,1,4,6,7};
				int[] output = {1,16,25,49,49};		
	 */
			private int[] squareAndSort(int[] nums) {
				int left = 0;
				int rt = nums.length-1;
				int[] output = new int[nums.length];
				int outIndex = nums.length-1;
				while(left <= rt) {
						int rtSuqare = nums[rt] *nums[rt];
						int leftSquare = nums[left] *nums[left] ;
					 if (Math.abs(nums[left]) < Math.abs(nums[rt])) {
						output[outIndex--] = rtSuqare;
						rt--;
					}
					else {
						
						output[outIndex--] = leftSquare;
						left++;	
					}
	
				}
			
				
				return output;
			}

			
}
