
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
