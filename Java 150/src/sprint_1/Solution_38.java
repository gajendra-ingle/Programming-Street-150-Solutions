package sprint_1;

//Finding the Sum of Squares of Digits
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to find the sum of the squares of the digits of a number.
//Example:
//Input: number = 123
//Output: 14
//Explanation: The sum of the squares of digits is 1^2 + 2^2 + 3^2 = 14.

public class Solution_38 {

	public static void main(String[] args) {
		System.out.println(sumOfSquaresOfDiigt(123));
	}

	private static int sumOfSquaresOfDiigt(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += rem * rem;
			num /= 10;
		}
		return sum;
	}
}
