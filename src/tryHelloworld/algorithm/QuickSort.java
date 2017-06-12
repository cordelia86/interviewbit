package tryHelloworld.algorithm;

/**
 * tryHelloworld.algorithm
 * ㄴ QuickSort.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */

// O(nLogn), 최악 n^2
public class QuickSort {

	private static int[] arr;

	private void initial(int[] arr) {
		this.arr = arr;

		quickSort(0, arr.length - 1);
	}

	private void quickSort(int start, int end) {
		int pivot = arr[(start + end) / 2];
		int i = start;
		int j = end;
		int temp = 0;

		while (i <= j) {
			while (arr[i] < pivot) {
				++i;
			}

			while (arr[j] > pivot) {
				--j;
			}

			if (i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		if (start < j) {
			quickSort(start, j);
		}

		if (i < end) {
			quickSort(i, end);
		}
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		qs.initial(new int[]{5, 4, 2, 8, 3, 1, 10});

		System.out.println(arr);
	}
}
