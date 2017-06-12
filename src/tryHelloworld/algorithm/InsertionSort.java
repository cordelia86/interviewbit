package tryHelloworld.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * tryHelloworld.algorithm
 * ㄴ InsertionSort.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public class InsertionSort {

	private List<Integer> insertionSort(List<Integer> list) {

		if (list == null || list.isEmpty() || list.size() == 1) {
			return list;
		}

		int base;
		int target;
		int count = 0;


		for (int i = 1; i < list.size(); i++) {

			base = list.get(i);

			for (int j = i - 1; j >= 0; j--) {
				++count;
				target = list.get(j);

				if (base <= target) {
					list.set(j, base);
					list.set(j + 1, target);
				} else {
					break;
				}
			}
		}

		System.out.println(count);
		return list;
	}

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		System.out.println(is.insertionSort(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
	}
}
