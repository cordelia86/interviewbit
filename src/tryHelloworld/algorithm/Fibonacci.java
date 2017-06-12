package tryHelloworld.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * tryHelloworld.algorithm
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 7.
 */
public class Fibonacci {

	// O(2^n)
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

	private int fibonacciMemory(int number, Map<Integer, Integer> memo) {

		if (memo.containsKey(number)) return memo.get(number);
		if (number <= 2) return 1;

		return memo.put(number, fibonacciMemory(number - 1, memo) + fibonacciMemory(number - 2, memo));
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
		Map<Integer, Integer> cache = new HashMap<>();
		System.out.println(fibonacci.fibonacciMemory(inputNumber, cache));
		long endMemory = System.currentTimeMillis();
		System.out.println("Memory : " + (endMemory - startMemory));
	}
}
