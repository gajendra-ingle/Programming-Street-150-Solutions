package sprint_1;

//Calculating the Power of a Number
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to calculate the power of a number.
//Example:
//Input: base = 2, exponent = 3
//Output: 8
//Explanation: 2 raised to the power of 3 is 8.

public class Solution_33 {

	public static void main(String[] args) {
		int base = 2;
		int exponent = 3;
		System.out.println(calculatePower(base, exponent));

	}

	private static int calculatePower(int base, int exponent) {
		int pow = 1;
		for (int i = 1; i <= exponent; i++) {
			pow *= base;
		}
		return pow;
	}
}
