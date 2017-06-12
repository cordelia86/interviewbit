package level6;

import java.util.*;
import java.util.stream.Collectors;

/**
 * level6
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 3. 7.
 */
public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {

		final List<Integer> a = Arrays.asList(-6, -4, -5, -2, -3 );
		Longest_Consecutive_Sequence lcs = new Longest_Consecutive_Sequence();

		System.out.println(lcs.longestConsecutive(a));
	}

	public int longestConsecutive(final List<Integer> a) {

		if(a.isEmpty()) {
			return 0;
		}

		List<Integer> hashSetList = a.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		Collections.sort(hashSetList);

		Integer start = hashSetList.get(0);
		ArrayList<Integer> countList = new ArrayList<>();
		Integer count = 1;

		for(int x=1; x< hashSetList.size(); x++){

			if(start + 1 == hashSetList.get(x)){
				count++;
			} else {
				countList.add(count);
				count = 1;
			}
			start = hashSetList.get(x);
		}

		if(count > 0) {
			countList.add(count);
		}

		return Collections.max(countList);
	}

	public class compare implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			if (a > b)
				return -1; // highest value first
			if (a == b)
				return 0;
			return 1;
		}
	}
}
