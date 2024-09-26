package sprint_1;

//Summing Digits of a Number
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to calculate the sum of digits of a number.
//Example:
//Input: number = 1234
//Output: 10
//Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.

public class Solution_9 {

	public static void main(String[] args) {

		int number = 1234;
		calSumOfDigit(number);
	}

	private static void calSumOfDigit(int number) {
		int sum = 0;
		while (number > 0) {
			int rem = number % 10;
			sum += rem;
			number /= 10;
		}
		System.out.println(sum);

	}
}
