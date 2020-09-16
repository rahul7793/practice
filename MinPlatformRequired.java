import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/*
 * Minimum Number of Platforms Required for a Railway/Bus Station
 * 
 * 
Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
Explantion: There are at-most three trains at a time (time between 11:00 to 11:20)

Input: arr[] = {9:00, 9:40}
dep[] = {9:10, 12:00}
Output: 1
Explantion: Only one platform is needed.
*/
public class MinPlatformRequired {
	public static void main(String[] args) {
		System.out.println(platformNeeded());
	}

	private static int platformNeeded() {
		ArrayList<Integer> arrArr = new ArrayList<>(Arrays.asList(900, 940, 950, 1100, 1500, 1800));
		ArrayList<Integer> depArr = new ArrayList<>(Arrays.asList(910, 1200, 1120, 1130, 1900, 2000));
		int[] maxPlatform = new int[1];
		int[] currPlat = new int[1];

		TreeMap<Integer, String> map = new TreeMap<>();

		for (Integer dep : depArr) {
			map.put(dep, "dep");
		}

		for (Integer arr : arrArr) {
			map.put(arr, "arr");
		}

		map.keySet().forEach(key -> {
//			System.out.println(key + "->"+map.get(key));
			if (map.get(key).equalsIgnoreCase("arr")) {
				++currPlat[0];
				maxPlatform[0] = Math.max(currPlat[0], maxPlatform[0]);
			} else
				--currPlat[0];
		});

		return maxPlatform[0];
	}
}