package tryHelloworld.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * tryHelloworld.algorithm
 * ㄴ BubbleSort.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public class BubbleSort {

	private List<Integer> bubbleSort(List<Integer> list){


		int a;
		int b;
		boolean isChanged = true;
		int count = 0;

		for (int i = list.size() - 1; i >= 0 && isChanged; i--) {

			isChanged = false;

			for (int j = 0; j <= i - 1; j++) {
				count++;
				a = list.get(j);
				b = list.get(j+1);

				if( a >= b ){
					list.set(j, b);
					list.set(j + 1, a);

					isChanged = true;
				}
			}
		}

		System.out.println("count : " + count);
		return list;
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		System.out.println(bs.bubbleSort(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
	}
}
