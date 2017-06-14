package tryHelloworld.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * tryHelloworld.algorithm
 * ㄴ Fibonacci.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 7.
 */
public class Fibonacci {

	// O(2^n)

	/**
	 * 피보나치 수열
	 * 1, 1, 2, 3, 5, 8, 13 ..... -> f(n) = f(n-1) + f(n-2)
	 *
	 * @param number
	 * @return
	 */
	private int fibonacciRecursive(int number) {
		if (number <= 0) {
			return 0;
		} else if (number <= 2) {
			return 1;
		} else {
			return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
		}
	}

	// O(n)
	private int fibonacciWhile(int number) {

		int temp = 0;
		int a = 1, b = 0;

		while (number > 0) {
			temp = a;
			a = a + b;
			b = temp;
			number--;
		}

		return b;

	}

	private static Map<Integer,Long> memo = new HashMap<>();
	static {
		memo.put(0,0L); //fibonacci(0)
		memo.put(1,1L); //fibonacci(1)
	}

	private long fibonacciMemory(int x) {
		return memo.computeIfAbsent(x, n -> fibonacciMemory(n-1) + fibonacciMemory(n-2));
	}


	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		int inputNumber = 40;

		long startRecursive = System.currentTimeMillis();
		System.out.println(fibonacci.fibonacciRecursive(inputNumber));
		long endRecursive = System.currentTimeMillis();
		System.out.println("Recursive : " + (endRecursive - startRecursive));

		System.out.println("------------------------------------------");

		long startWhile = System.currentTimeMillis();
		System.out.println(fibonacci.fibonacciWhile(inputNumber));
		long endWhile = System.currentTimeMillis();
		System.out.println("While : " + (endWhile - startWhile));


		System.out.println("------------------------------------------");

		long startMemory = System.currentTimeMillis();

		System.out.println(fibonacci.fibonacciMemory(inputNumber));
		long endMemory = System.currentTimeMillis();
		System.out.println("Memory : " + (endMemory - startMemory));
	}
}
