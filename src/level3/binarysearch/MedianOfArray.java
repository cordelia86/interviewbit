package level3.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * level3.binarysearch
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 23.
 */
public class MedianOfArray {


	public static void main(String[] args) {

		MedianOfArray medianOfArray = new MedianOfArray();
		List<Integer> a = Arrays.asList(7, 9, 10, 12);
		List<Integer> b = Arrays.asList(-40, 1, 2, 3, 4, 11);

		System.out.println(medianOfArray.findMedianSortedArrays3(a, b));

	}

	public double findMedianSortedArrays1(final List<Integer> a, final List<Integer> b) {

		if(a.isEmpty() && b.isEmpty()){
			return -1;
		}

		List<Integer> merged = new ArrayList<>();
		merged.addAll(a);
		merged.addAll(b);

		Collections.sort(merged);

		int size = merged.size();

		if(size % 2 != 0){
			return merged.get(Math.round(size/2f) - 1);
		} else {
			return (double)(merged.get(size/2) + merged.get((size/2) - 1)) / 2;
		}
	}

	public double findMedianSortedArrays2(final List<Integer> a, final List<Integer> b) {

		if(a.isEmpty() && b.isEmpty()){
			return -1;
		}

		List<Integer> base = new ArrayList<>();
		List<Integer> target = new ArrayList<>();
		if(a.size() > b.size()){
			base.addAll(a);
			target.addAll(b);
		} else {
			base.addAll(b);
			target.addAll(a);
		}


		int nowIndex = -1;
		for (int baseIndex = 0; baseIndex < base.size(); baseIndex++) {
			for (int targetIndex = 0; targetIndex < target.size(); targetIndex++) {
				if(target.get(targetIndex) <= base.get(baseIndex)){
					base.add(targetIndex, target.get(targetIndex));
				}
			}
		}
		return -1;
	}

	public double findMedianSortedArrays3(final List<Integer> a, final List<Integer> b) {

		if(a.isEmpty() && b.isEmpty()){
			return -1;
		}

		int sizeA = a.size();
		int sizeB = b.size();

		if(sizeA == 0){
			return findMedianNumber(b);
		}

		if(sizeB == 0){
			return findMedianNumber(a);
		}


		int baseIndex = findMedianIndex(a);
		int baseNumber = -1;
		int targetIndex = findMedianIndex(b);

		List<Integer> merged = new ArrayList<>();
		List<Integer> target = new ArrayList<>();
		merged.addAll(a);
		target.addAll(b);

		for (int j = baseIndex; j < sizeA; j++) {
			baseNumber = a.get(j);
			for (int i = targetIndex; i >= 0 ; i--) {
				if(baseNumber >= b.get(i)){
					merged.addAll(j, target.subList(0, i+1));
					return findMedianSortedArrays3(merged, target.subList(i+1, target.size()));
				}
			}
		}

		return -1;
	}


	private double findMedianNumber(List<Integer> list){

		int medianIdx = list.size() / 2;

		if(list.size() % 2 == 0){
			return (list.get(medianIdx) + list.get(medianIdx - 1)) / 2f;
		} else {
			return list.get(medianIdx);
		}
	}

	private int findMedianIndex(List<Integer> list){

		return list.size() / 2;
	}
}
