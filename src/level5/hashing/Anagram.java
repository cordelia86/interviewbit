package level5.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * level5.hashing
 * ㄴ Anagram.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 8.
 */
public class Anagram {

	public enum Alphabet{

	}

	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {


		Map<String, ArrayList<Integer>> map = new HashMap<>();
		ArrayList<Integer> positions = new ArrayList<>();

		// O(n^2Log(n))
		for (int i = 0; i < a.size(); i++) {
			char[] alphabet = a.get(i).toCharArray();
			positions = new ArrayList<>();

			// O(nLog(n)) Dual-QuickSort
			Arrays.sort(alphabet);

			String sortedWord = String.copyValueOf(alphabet);
			if(map.containsKey(sortedWord)){
				positions = map.get(sortedWord);
			}

			positions.add(i + 1);
			map.put(sortedWord, positions);
		}

		Iterator<String> iterator = map.keySet().iterator();
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		while(iterator.hasNext()){
			result.add(map.get(iterator.next()));
		}
		return result;
	}

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		System.out.println(anagram.anagrams(Arrays.asList("cat", "dog", "god", "tca")));

		System.out.println(anagram.isAnagramWithPosition("hello Java", "JAva Hello"));
		System.out.println(anagram.isAnagramWithSort("apple", "epalp"));
	}

	private boolean isAnagramWithSort(String a, String b){

		if(a.equals(b)){
			return true;
		}

		if(a.length() != b.length()){
			return false;
		}

		char[] splicedStringA;
		char[] splicedStringB;


		splicedStringA = a.replaceAll(" ","").toLowerCase().toCharArray();
		splicedStringB = b.replaceAll(" ","").toLowerCase().toCharArray();

		Arrays.sort(splicedStringA);
		Arrays.sort(splicedStringB);


		if(Arrays.equals(splicedStringA, splicedStringB)){
			return true;
		}

		return false;
	}


	private boolean isAnagramWithPosition(String a, String b){

		if(a.equals(b)){
			return true;
		}

		if(a.length() != b.length()){
			return false;
		}

		char[] splicedStringA;
		char[] splicedStringB;
		int[] alphabetPositionA = new int[28];
		int[] alphabetPositionB = new int[28];


		splicedStringA = a.replaceAll(" ","").toLowerCase().toCharArray();
		splicedStringB = b.replaceAll(" ","").toLowerCase().toCharArray();
		for (int j = 0; j < splicedStringA.length; j++) {
			++alphabetPositionA[(int)splicedStringA[j] - 97];
		}

		for (int j = 0; j < splicedStringB.length; j++) {
			++alphabetPositionB[(int)splicedStringB[j] - 97];
		}

		if(Arrays.equals(alphabetPositionA,alphabetPositionB)){
			return true;
		}

		return false;
	}
}

