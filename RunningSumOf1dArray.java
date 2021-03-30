import java.util.Arrays;

public class RunningSumOf1dArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		arr = runningSum(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}
		return nums;
	}

}
