package sprint_1;

//Printing Prime Numbers Less Than a Given Number
//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to print all prime numbers less than a given number.
//Example:
//Input: number = 20
//Output: 2, 3, 5, 7, 11, 13, 17, 19
//Explanation: The prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, and 19.

public class Solution_24 {

	public static void main(String[] args) {

		int number = 20;
		for (int i = 1; i <= number; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
