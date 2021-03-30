import java.util.Arrays;

/**
 * Given the array nums consisting of 2n elements in the form
 * [x1,x2,...,xn,y1,y2,...,yn].
 * 
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,5,1,3,4,7], n = 3 Output: [2,3,5,4,1,7] Explanation: Since
 * x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]. Example
 * 2:
 * 
 * Input: nums = [1,2,3,4,4,3,2,1], n = 4 Output: [1,4,2,3,3,2,4,1] Example 3:
 * 
 * Input: nums = [1,1,2,2], n = 2 Output: [1,2,1,2]
 * 
 * @author rahulsharma
 *
 */
public class ShuffleArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(shuffle(nums, 4)));
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] a1 = new int[n];
		int[] a2 = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++)
			a1[i] = nums[i];
		for (int j = n; j < 2 * n; j++)
			a2[k++] = nums[j];
		int aCount1 = 0, aCount2 = 0;
		for (int x = 0; x < 2 * n; x = x + 2) {
			nums[x] = a1[aCount1++];
			nums[x + 1] = a2[aCount2++];
		}
		return nums;

//		int[] output = new int[2 * n];
//		for (int i = 0; i < n; i++) {
//			output[i*2] = nums[i];
//			output[(i*2)+1] = nums[n+i];
//		}
//
//		return output;
	}

}
