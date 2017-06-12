package level5.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * level5.hashing
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 4. 21.
 */
public class Equals {
	public static void main(String[] args) {

		Equals equals = new Equals();
		ArrayList<Integer> array = new ArrayList<>();
		array.addAll(Arrays.asList( 9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5, 5));
		System.out.println(equals.equal(array));

	}

	public ArrayList<Integer> equal(ArrayList<Integer> a) {
		Map<Integer, IndexClass> map = new HashMap<>();

		IndexClass indexClass = null;
		int size = a.size();
		int sum = 0;
		ArrayList<Integer> candidate = new ArrayList<>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				sum = a.get(i) + a.get(j);
				if (!map.containsKey(sum)) {
					map.put(sum, new IndexClass(i, j));

					continue;
				} else {
					indexClass = map.get(sum);

					if (indexClass.getA2() != i && indexClass.getA2() != j && indexClass.getA1() < i){

						ArrayList<Integer> temp = new ArrayList<>();
						temp.addAll(Arrays.asList(indexClass.getA1(), indexClass.getA2(), i, j));

						if(candidate.isEmpty()){
							candidate.addAll(temp);
						} else {
							for (int k = 0; k < candidate.size(); k++) {
								if(candidate.get(k) > temp.get(k)){
									list.add(temp);
									candidate.clear();
									candidate.addAll(temp);
								} else if(candidate.get(k) == temp.get(k)) {
									continue;
								}

								break;
							}
						}

					}
				}
			}
		}


		return candidate;
	}


	class IndexClass {
		private int a1;
		private int a2;

		public IndexClass(int a1, int a2) {
			this.a1 = a1;
			this.a2 = a2;
		}

		public int getA1() {
			return this.a1;
		}

		public int getA2() {
			return this.a2;
		}
	}
}
