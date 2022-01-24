// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Example 2:

// Input: nums = []
// Output: []
// Example 3:

// Input: nums = [0]
// Output: []

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class ThreeSum {
	public static void main(String[] args) {
		System.out.println(threeSum(new int[] { -1,0,1,2,-1,-4 }));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> output = new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0)
				break;
			if(i>0 && nums[i] == nums[i-1])
				continue;
			twoSumII(nums, i, output);
		}

		return output;
	}
	
	public static void twoSumII(int[] nums, int i, List<List<Integer>> output) {
		int low = i+1;
		int high = nums.length-1;
		
		while(low<high) {
			int sum = nums[i] + nums[low] + nums[high];
			if( sum < 0) {
				++low;
			} else if( sum > 0)
				--high;
			else
			{
				output.add(Arrays.asList(nums[i] , nums[low] , nums[high]));
				++low;
				--high;
				while(low<high && nums[low] == nums[low-1])
					low++;
			}
		}
	}
}
