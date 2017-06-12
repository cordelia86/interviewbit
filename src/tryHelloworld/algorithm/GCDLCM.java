package tryHelloworld.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * tryHelloworld.algorithm
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 8.
 */
public class GCDLCM {

	private boolean isPrime(int A) {
		if (A < 2) {
			return false;
		}
		int upperLimit = (int) (Math.sqrt(A));
		for (int i = 2; i <= upperLimit; i++) {
			if (A % i == 0) return false;
		}

		return true;
	}

	private List<Integer> getPrimeNumber(int max) {

		List<Integer> uniqueNumber = new ArrayList<>();
//		uniqueNumber.add(2);
//		boolean isUnique = true;

		for (int i = 2; i <= max; i++) {

//			isUnique = true;
//			for (Integer anUniqueNumber : uniqueNumber) {
//				if (i % anUniqueNumber == 0) {
//					isUnique = false;
//					break;
//				}
//			}
//
//			if (isUnique) {
//				uniqueNumber.add(i);
//			}
			if (isPrime(i)) {
				uniqueNumber.add(i);
			}
		}

		return uniqueNumber;
	}

	private int gcd(int a, int b){
		int temp;

		while(b > 0){
			temp = a;
			a = b;
			b = temp % b;
		}

		return a;

	}

	public int[] gcdlcm(int a, int b) {

		int[] answer = new int[2];
//		List<Integer> uniqueNumber;
//
//		if (a > b) {
//			uniqueNumber = getPrimeNumber(b);
//		} else {
//			uniqueNumber = getPrimeNumber(a);
//		}
//
//		int gcd = 1;
//		int lcm = 1;
//
//		for (int number : uniqueNumber) {
//			while (a % number == 0 && b % number == 0) {
//				gcd *= number;
//				lcm *= number;
//
//				a /= number;
//				b /= number;
//			}
//		}
//
//		lcm *= (a * b);


//		answer[0] = gcd(Math.min(a, b), Math.max(a, b));
		answer[0] = gcd(a, b);
		answer[1] = (a * b) / answer[0];
		return answer;
	}

	public static void main(String[] args) {
		GCDLCM gcdlcm = new GCDLCM();
		int[] result = gcdlcm.gcdlcm(2316, 1224);
		System.out.println(result[0] + ", " + result[1]);
//		System.out.println(gcdlcm.isPrime(13));

//		long start = System.currentTimeMillis();
//		gcdlcm.getPrimeNumber(1000);
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
	}

}
