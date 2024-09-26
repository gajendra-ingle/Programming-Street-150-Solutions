package sprint_1;

//Finding the Sum of the Digits of the Factorial of a Number
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to find the sum of the digits of the factorial of a given number.
//Example:
//Input: number = 4
//Output: 6
//Explanation: The factorial of 4 is 24, and the sum of the digits (2 + 4) is 6.

public class Solution_28 {

	public static void main(String[] args) {

		int number = 4;
		int factorial = calculateFactorial(number);
		int sumOFDigit = calculateDigitSum(factorial);
		System.out.println(sumOFDigit);
	}

	static int calculateFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	static int calculateDigitSum(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}

}
