import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FarFromZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Integer farthestValue = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < size; i++) {
			int element = sc.nextInt();
			Integer key = element;
			Integer value = (0 - key) <= 0 ? key : (key * -1);
			if (value > farthestValue)
				farthestValue = value;
			map.put(key, value);

		}
		List<Integer> duplicateValueKeys = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == farthestValue) {
				duplicateValueKeys.add(entry.getKey());
			}
		}

		if (duplicateValueKeys.size() == 1)
			System.out.println(duplicateValueKeys.get(0));
		else {
			for (Integer key : duplicateValueKeys) {
				if (key < 0)
					System.out.println(key);
			}
		}

	}

}
