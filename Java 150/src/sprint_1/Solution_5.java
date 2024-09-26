package sprint_1;

//Generating the Fibonacci Series

//Difficulty: Easy
//Topics: Basic Programming, Sequences
//Description: Write a program to generate the Fibonacci series up to a given number.
//Example:
//Input: limit = 10
//Output: [0, 1, 1, 2, 3, 5, 8]
//Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].

public class Solution_5 {

	public static void main(String[] args) {
		int limit = 10;
		generateFibonacciseries(limit);
	}

	public static void generateFibonacciseries(int n) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print("[");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + ", ");
			c = a + b;
			a = b;
			b = c;
		}
		System.out.print("]");
	}
}
