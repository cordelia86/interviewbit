package level7.dynamic;

import java.util.Arrays;
import java.util.Collections;

/**
 * level7.dynamic
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 16.
 */
public class Edit_Distance {

	public static void main(String[] args) {

		Edit_Distance editDistance = new Edit_Distance();
		System.out.println(editDistance.minDistance("bbbaabaa", "aababbabb"));
//		System.out.println(editDistance.minDistance("aac", "abac"));
	}

	private int dp[][];
	private String A, B;

	public int minDistance(String A, String B) {

		if (A == null && B == null)
			return 0;

		int nA, nB;
		nA = A.length();
		nB = B.length();

		if (nA == 0)
			return nB;

		if (nB == 0)
			return nA;

		dp = new int[nA][nB];
		this.A = A;
		this.B = B;

		for (int i = 0; i < nA; i++)
			Arrays.fill(dp[i], -1);

		int res = rec(nA - 1, nB - 1);

		return res;
	}



	public int rec(int iA, int iB) {

		if (iA < 0 && iB < 0)
			return 0;

		if (iA < 0)
			return iB + 1;

		if (iB < 0)
			return iA + 1;

		if (dp[iA][iB] != -1)
			return dp[iA][iB];

		int res = Integer.MAX_VALUE;

		if (A.charAt(iA) == B.charAt(iB))
			res = rec(iA - 1, iB - 1);

		int temp = 1 + rec(iA - 1, iB - 1);
		temp = Math.min(temp, 1 + rec(iA - 1, iB));
		temp = Math.min(temp, 1 + rec(iA, iB - 1));

		res = Math.min(res, temp);

		return dp[iA][iB] = res;
	}

	public int minDistance1(String a, String b) {

		if (a == null || b == null) {
			return -1;
		}

		if (a.isEmpty()) {
			return b.length();
		}

		if (b.isEmpty()) {
			return a.length();
		}

		if (a.equals(b)) {
			return 0;
		}


//		return process(a, b, 0);
		return process2(a, 0, b, 0);
	}

	private int process(String a, String b, int count) {

		if (a.isEmpty()) {
			return count + b.length();
		}

		if (b.isEmpty()) {
			return count + a.length();
		}

		if (a.equals(b)) {
			return count;
		}

		if (a.charAt(0) == b.charAt(0)) {
			count = process(a.substring(1, a.length()), b.substring(1, b.length()), count);
		} else if (a.length() > b.length()) {

			count = process(a.substring(1, a.length()), b, ++count);
		} else {

			int indexOf = b.indexOf(a);
			if (indexOf != -1 && b.length() - (indexOf + 1) >= a.length()) {

			}
			count = process(a, b.substring(1, b.length()), ++count);
		}

		return count;
	}

	private int process2(String a, int index1, String b, int index2) {

//		if (a.length() <= index1) {
//			if(b.length() > a.length()){
//				return b.length() - a.length();
//			}
//		}
//
//		if(b.length() <= index2){
//			return 0;
//		}


		if (a.isEmpty()) {
			return b.length();
		}

		if (b.isEmpty()) {
			return a.length();
		}

		if (a.equals(b)) {
			return 0;
		}

		if(a.length() <= index1){
			return 0;
		}

		if(b.length() <= index2){
			return 0;
		}

		if (a.charAt(index1) == b.charAt(index2)) {
			return process2(a, ++index1, b, ++index2);
		} else {

			return Collections.min(Arrays.asList(1 + process2(a, index1 + 1, b, index2), 1 + process2(a, index1, b, index2 + 1), 1 + process2(a, index1 + 1, b, index2 + 1)));
//			return Math.min(Math.min(1 + process2(a, index1 + 1, b, index2), 1 + process2(a, index1, b, index2 + 1)),
//				1 + process2(a, index1 + 1, b, index2 + 1));
		}
	}
}

