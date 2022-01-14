import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 3,3 }, 6)));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			int x = target - current;
			if (map.containsKey(x))
				return new int[] { map.get(x), i };
			map.put(current, i);
		}
		return null;
	}

}
