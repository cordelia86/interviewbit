package tryHelloworld;

import java.util.Stack;
import java.util.concurrent.CompletableFuture;

/**
 * tryHelloworld
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 11.
 */
public class Test {
	public static void main(String[] args) {
//		String[] str = new String[5];
//		Vector<String> v = new Vector<>();
//		ArrayList<String> arr = new ArrayList<>();
//
//		String addStr = "asdf";
//		for (int i = 0; i <20 ; i++) {
//			v.add(addStr);
//			arr.add(addStr);
//		}
//
//		Collections.synchronizedCollection(arr);
//
//
//		HashMap<String, String> hashMap = new HashMap<>();
//		Hashtable<String, String> hashTable = new Hashtable<>();
//
//		System.out.println(str.length);
//		System.out.println(v.capacity());
//		Collections.synchronizedList(arr);
//		Collections.sort(arr);


		int a = (int)'a';
		int b = (int)'b';

		a ^= b;
		b ^= a;
		a ^= b;

		System.out.println((char)a);
		System.out.println((char)b);


		String str1 = "a";
		String str2 = "b";

		str1 += str2;
		str2 = str1.replaceFirst(str2, "");
		str1 = str1.replaceFirst(str2, "");

		System.out.println(str1);
		System.out.println(str2);


		System.out.println("aaa".replace("a", "b"));
		System.out.println("aaa".replaceAll("a", "b"));
		System.out.println("aaa".replaceFirst("a","b"));

		Stack<String> stack = new Stack<>();

		CompletableFuture<String> completableFuture1 = new CompletableFuture<>();
		CompletableFuture<String> completableFuture2 = new CompletableFuture<>();
		CompletableFuture.allOf(completableFuture1, completableFuture2);
	}

}
