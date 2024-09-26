package sprint_1;

//Finding the Least Common Multiple (LCM)
//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to find the LCM of two numbers.
//Example:
//Input: a = 12, b = 15
//Output: 60
//Explanation: The LCM of 12 and 15 is 60.

public class Solution_11 {

	public static void main(String[] args) {

		int a = 12, b = 15;
		int lcm = findLCM(a, b);
		System.out.println(lcm);

	}

	private static int findLCM(int a, int b) {
		int gcd = findGCD(a, b);
		return Math.abs(a * b) / gcd;
	}

	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
