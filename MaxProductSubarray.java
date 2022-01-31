// 152. Maximum Product Subarray


// Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

// A subarray is a contiguous subsequence of the array.

 

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
	
	
public class MaxProductSubarray {

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] { -2, 3, -4 }));
	}

	public static int maxProduct(int[] nums) {
		if (nums.length == 0)
			return 0;
		int min_so_far = nums[0];
		int max_so_far = nums[0];
		int maxProd = max_so_far;
		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			int current_max = Math.max(current, Math.max(max_so_far * current, min_so_far * current));
			min_so_far = Math.min(current, Math.min(max_so_far * current, min_so_far * current));

			max_so_far = current_max;
			
			maxProd = Math.max(maxProd, max_so_far);
		}

		return maxProd;

	}

}
