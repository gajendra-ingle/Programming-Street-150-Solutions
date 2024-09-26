package sprint_1;

//Checking for Perfect Numbers
//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to determine if a number is a perfect number.
//Example:
//Input: number = 28
//Output: Perfect Number
//Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.

public class Solution_20 {

	public static void main(String[] args) {

		int number = 28;
		if (isPerfectNumber(number)) {
			System.out.println("Perfect Number");
		}

	}

	static boolean isPerfectNumber(int num) {

		if (num <= 0)
			return false;

		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return num == sum;
	}
}
