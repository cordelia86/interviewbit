package level7.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * level7.dynamic
 * ㄴ NDigitNumbersWithDigitSumS.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 4. 5.
 */
public class NDigitNumbersWithDigitSumS {

	public static void main(String[] args) {

		NDigitNumbersWithDigitSumS n = new NDigitNumbersWithDigitSumS();
		System.out.println(n.solve(75, 22));
	}

	public int solve(int A, int B) {

		Map<Integer, Integer> cache = new HashMap<>();

		if( A == 1 && B >= 10){
			return 0;
		}

		if(A == 1){
			return 1;
		}

		int count = 0;
		int sum;

		for(int x = 1; x < 10; x++){
			sum = B - x;

			if(sum >= 0){
				count += process(A-1, sum, cache);
				count %= 1000000007;
			}
		}


		return count;
	}

	private int process(int A, int B, Map<Integer, Integer> cache){
		int sum;
		int count = 0;
		int result;

		if( A == 1 && B >= 10){
			return 0;
		}

		if(A == 1){
			return 1;
		}

		for(int x = 0; x < 10; x++){

			sum = B - x;

			if(sum >= 0){
				if(cache.containsKey((A-1) + (sum * 1000))){
					count += cache.get((A-1) + (sum * 1000));
					count %= 1000000007;

				} else {
					result = process(A-1, sum, cache);
					cache.put((A-1) + (sum * 1000), result);

					count += result;
					count %= 1000000007;
				}
			}
		}
		return count;
	}
}
