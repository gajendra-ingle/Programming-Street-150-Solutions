package sprint_1;

//Checking for Prime Numbers

//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to determine if a number is prime.
//Example:
//Input: number = 7
//Output: Prime
//Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.

public class Solution_2 {

	public static void main(String[] args) {

		int number = 7;
		if (isPrime(number)) {
			System.out.println("Prime");
		}
	}

	public static boolean isPrime(int number) {
		if (number < 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}
}
