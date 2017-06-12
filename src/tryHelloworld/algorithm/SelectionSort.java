package tryHelloworld.algorithm;

/**
 * tryHelloworld.algorithm
 * ㄴ SelectionSort.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public class SelectionSort {

	private int[] selectionSort(int[] arr) {

		int min;
		int temp;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				++count;
				if (arr[j] <= arr[min]) {
					min = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		System.out.println(count);
		return arr;
	}

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] sortedArray = selectionSort.selectionSort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});

		for (int sortedNumber: sortedArray) {
			System.out.print(sortedNumber + ", ");
		}
	}
}