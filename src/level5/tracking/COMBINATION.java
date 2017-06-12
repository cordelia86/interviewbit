package level5.tracking;

import java.util.ArrayList;

/**
 * level5.tracking
 * ㄴ COMBINATION.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 3. 3.
 */
public class COMBINATION {
	public static void main(String[] args) {
		COMBINATION combination = new COMBINATION();
		System.out.println(combination.combine(4, 2));
	}

	public ArrayList<ArrayList<Integer>> combine(int n, int k) {

		ArrayList<Integer> kList = new ArrayList<>();
		ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();

		for (int x = 1; x < n; x++){


//			kList.add(process(x, n, k--));

			if (k == 0){
				break;
			}
		}

		return resultList;
	}

	public ArrayList<Integer> process(ArrayList<Integer> list, int start, int end, int size){

		while(list.size() <= size){
			list.add(start++);
		}

		return null;
	}

//	public Integer process(int start, int end, int cnt){
//
//		ArrayList<Integer> returnList = new ArrayList<>();
//
//		if(cnt == 0){
//			return null;
//		}
//
//		returnList.add(start);
//
//		for( int index = start + 1; index < end; index++ ){
//
//			process(index + 1, end, cnt);
//			if(cnt == 0){
//
//				return returnList;
//			}
//			cnt--;
//			returnList.add(index);
//			returnList.addAll(process(index, end, cnt));
//
//		}
//
//		return returnList;
//	}
}
