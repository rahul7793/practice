// 53. Maximum Subarray

// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// A subarray is a contiguous part of an array.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23


public class MaxSubArray {

//	private static int[] numsArray;

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { -2, -1 }));
	}

	public static int maxSubArray(int[] nums) {
		// Kadane's Algo
		int current_sub = nums[0];
		int max_sum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			current_sub = Math.max(nums[i], current_sub + nums[i]);
			max_sum = Math.max(max_sum, current_sub);
		}
		return max_sum;

//		DP - divide & conquer
//numsArray = nums;
//		return maxSub(0, nums.length-1);
//
//	}
//
//	public static int maxSub(int left, int right) {
//		if (left > right)
//			return Integer.MIN_VALUE;
//
//		int mid = Math.floorDiv(left + right, 2);
//        int curr = 0;
//        int bestLeftSum = 0;
//        int bestRightSum = 0;
//        
//        // Iterate from the middle to the beginning.
//        for (int i = mid - 1; i >= left; i--) {
//            curr += numsArray[i];
//            bestLeftSum = Math.max(bestLeftSum, curr);
//        }
//        
//        // Reset curr and iterate from the middle to the end.
//        curr = 0;
//        for (int i = mid + 1; i <= right; i++) {
//            curr += numsArray[i];
//            bestRightSum = Math.max(bestRightSum, curr);
//        }
//        
//        // The bestCombinedSum uses the middle element and the best
//        // possible sum from each half.
//        int bestCombinedSum = numsArray[mid] + bestLeftSum + bestRightSum;
//        
//        // Find the best subarray possible from both halves.
//        int leftHalf = maxSub(left, mid - 1);
//        int rightHalf = maxSub(mid + 1, right);
//        
//        // The largest of the 3 is the answer for any given input array.
//        return Math.max(bestCombinedSum, Math.max(leftHalf, rightHalf));

	}

}
