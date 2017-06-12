package level3.bit.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * level3.bit.manipulation
 * ㄴ MinXORValue.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 4. 4.
 */
public class MinXORValue {

	public static void main(String[] args) {

		Integer temp = 5;
		MinXORValue minXORValue = new MinXORValue();
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(Arrays.asList(0, 4, 7, 9));
		System.out.println(minXORValue.findMinXor(arr));
	}

	public int findMinXor(ArrayList<Integer> a) {

		Collections.sort(a);

		int minXOR = a.get(1)^a.get(0);
		int xor;

		for(int x = 1; x<a.size(); x++){
			xor = a.get(x)^a.get(x - 1);
			if(minXOR > xor){
				minXOR = xor;
			}
		}

		return minXOR;
	}
}
