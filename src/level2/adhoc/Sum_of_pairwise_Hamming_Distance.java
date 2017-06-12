package level2.adhoc;

import java.util.Arrays;
import java.util.List;

/**
 * level2.adhoc
 * ㄴ Sum_of_pairwise_Hamming_Distance.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 4. 25.
 */
public class Sum_of_pairwise_Hamming_Distance {
	public static void main(String[] args) {
		Sum_of_pairwise_Hamming_Distance sumOfPairwiseHammingDistance = new Sum_of_pairwise_Hamming_Distance();
		System.out.println(sumOfPairwiseHammingDistance.hammingDistance(Arrays.asList(2, 4, 6)));
	}

	public int hammingDistance(final List<Integer> A) {

		if (A.isEmpty()) {
			return -1;
		}

		int size = A.size();
		int mod = 1000000007;
		int sum = 0;
		int shift = 0;

		for (int i = 0; i < 31; i++) {
			int sumBitOne = 0, sumBitZero = 0;

			for (int j = 0; j < size; j++) {
				if( (A.get(j) & (1 << i)) > 0) {
					++sumBitOne;
				} else {
					++sumBitZero;
				}
			}

			sum += ((2l * sumBitOne * sumBitZero) % mod);
			if (sum >= mod) sum = sum - mod;

		}

		return sum;
	}
}
