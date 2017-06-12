package level7.dynamic;

import java.util.*;

/**
 * level7.dynamic
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 3. 10.
 */
public class Majority_Element {

	public static void main(String[] args) {
		Majority_Element me = new Majority_Element();
		int count = me.majorityElement(Arrays.asList(1, 1, 1, 2, 2));
		System.out.println(count);
	}

	private int majorityElement(final List<Integer> a) {

		if(a.size() == 0){
			return 0;
		}

		if(a.size() == 1){
			return a.get(0);
		}

		int size = a.size();
		double majorityCount = Math.floor(size/2);

		Map<Integer, Integer> majorElementMap = new HashMap<>();
		majorElementMap.put(a.get(0), 1);
		for (int x = 1; x < size ; x++) {

			if(majorElementMap.containsKey(a.get(x))){

				majorElementMap.put(a.get(x),  majorElementMap.get(a.get(x)) + 1);
				if(majorElementMap.get(a.get(x)) > majorityCount){
					return a.get(x);
				}
			} else {
				majorElementMap.put(a.get(x), 1);
			}
		}
		return a.get(a.size() -1);
	}
}
