package level7.dynamic;

/**
 * level7.dynamic
 * ㄴ STAIRS.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 2. 21.
 */
public class STAIRS {

	public static void main(String[] args) {
		STAIRS s = new STAIRS();
		System.out.println(s.climbStairs1(1000000));

	}

	public int climbStairs1(int A) {

		int ways[] = new int[A + 1];

		if (A == 1)
			return 1;

		ways[1] = 1;
		ways[2] = 2;

		for (int i = 3; i <= A; i++) {

			ways[i] = ways[i - 1] + ways[i - 2];


		}
		return ways[A];
	}

	/**
	 * recursive하기 때문에 1번 풀이방법보다 처리할 수 있는 범위가 적다. (stack over flow)
	 * @param a
	 * @return
	 */
	public int climbStairs2(int a) {

		if ( a <= 1 ){
			return 1;
		}

		int result = 0 ;

		result += climbStairs2(a - 1);
		result += climbStairs2(a - 2);

		return result;
	}
}
