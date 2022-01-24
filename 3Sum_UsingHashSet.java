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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSum {
	public static void main(String[] args) {
		System.out.println(threeSum(new int[] { -1,0,1,2,-1,-4 }));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> output = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				break;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			twoSum(nums, i, output);
		}

		return output;
	}

	public static void twoSum(int[] nums, int i, List<List<Integer>> output) {
		Set<Integer> seen = new HashSet<>();
		for (int j = i + 1; j > i && j < nums.length; j++) {
			int complement = (-1 * nums[i]) - nums[j];
			if (seen.contains(complement)) {
				output.add(Arrays.asList(nums[i], nums[j], complement));
				while (j+1 < nums.length && nums[j + 1] == nums[j])
					++j;

			}
			seen.add(nums[j]);
		}

	}
}
