package sprint_1;

//Generating a Fibonacci Sequence Using Recursion
//Difficulty: Medium
//Topics: Recursion, Sequences
//Description: Write a recursive program to generate the Fibonacci sequence up to a given number.
//Example:
//Input: number = 5
//Output: 0, 1, 1, 2, 3
//Explanation: The Fibonacci sequence up to 5 is generated.

public class Solution_42 {

	public static void main(String[] args) {
		int number = 5;
		for (int i = 0; i < number; i++) {
			System.out.print(fib(i) + " ");
		}
	}

	static int fib(int n) {
		if (n == 0) {
			return 0;
		}

		if (n == 1 || n == 2) {
			return 1;
		}

		return fib(n - 1) + fib(n - 2);
	}

}
