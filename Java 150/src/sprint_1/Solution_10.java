package sprint_1;

//Finding the Greatest Common Divisor (GCD)
//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to find the GCD of two numbers.
//Example:
//Input: a = 48, b = 18
//Output: 6
//Explanation: The GCD of 48 and 18 is 6.

public class Solution_10 {

	public static void main(String[] args) {

		int a = 48;
		int b = 18;
		int ans = findGCD(a, b);
		System.out.println(ans);
	}

	public static int findGCD(int a, int b) {
		// Ensure b is not zero
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
