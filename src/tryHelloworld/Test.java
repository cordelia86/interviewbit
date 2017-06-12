package tryHelloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

/**
 * tryHelloworld
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 11.
 */
public class Test {
	public static void main(String[] args) {
		String[] str = new String[5];
		Vector<String> v = new Vector<>();
		ArrayList<String> arr = new ArrayList<>();

		String addStr = "asdf";
		for (int i = 0; i <20 ; i++) {
			v.add(addStr);
			arr.add(addStr);
		}

		Collections.synchronizedCollection(arr);


		HashMap<String, String> hashMap = new HashMap<>();
		Hashtable<String, String> hashTable = new Hashtable<>();

		System.out.println(str.length);
		System.out.println(v.capacity());
		Collections.synchronizedList(arr);
		Collections.sort(arr);
	}
}
