
public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		System.out.println(search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 5));
	}

	public static int search(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
//		while (l <= r) { //O(n) solution
//			if (nums[l] == target)
//				return l;
//			if (nums[r] == target)
//				return r;
//			l++;
//			r--;
//		}

		while (l <= r) {// O(log n) solution
			int mid = (l + r) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] >= nums[l]) {
				if (target >= nums[l] && target < nums[mid])
					r = mid - 1;
				else
					l = mid + 1;
			} else {
				if (target > nums[mid] && target <= nums[r])
					l = mid + 1;
				else
					r = mid - 1;
			}
		}

		return -1;
	}

}
