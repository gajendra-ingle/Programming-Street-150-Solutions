package sprint_1;

//Finding the Number of Digits in a Number
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to count the number of digits in a given number.
//Example:
//Input: number = 12345
//Output: 5
//Explanation: The number 12345 has 5 digits.

public class Solution_25 {

	public static void main(String[] args) {

		int number = 12345;
		int ans = digtiInNumber(number);
		System.out.println(ans);

	}

	private static int digtiInNumber(int number) {
		int digitCount = 0;
		while (number > 0) {
			digitCount++;
			number /= 10;
		}
		return digitCount;
	}
}
