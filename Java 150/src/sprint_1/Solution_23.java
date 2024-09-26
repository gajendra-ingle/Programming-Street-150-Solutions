package sprint_1;

//Finding the Fibonacci Number at a Specific Position
//Difficulty: Easy
//Topics: Basic Programming, Sequences
//Description: Write a program to find the Fibonacci number at a specific position.
//Example:
//Input: position = 5
//Output: 5
//Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).

public class Solution_23 {

	public static void main(String[] args) {

		int position = 5;
		int fib = FibonacciNumberAtPosition(position);
		System.out.println(fib);
	}

	static int FibonacciNumberAtPosition(int num) {

		if (num == 0)
			return 0;
		if (num == 1)
			return 1;

		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 2; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
