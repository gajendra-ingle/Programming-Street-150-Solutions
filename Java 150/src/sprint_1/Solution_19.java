package sprint_1;

//Finding Prime Numbers in a Range
//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to find all prime numbers within a given range.
//Example:
//Input: range = [10, 30]
//Output: [11, 13, 17, 19, 23, 29]
//Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.

public class Solution_19 {

	public static void main(String[] args) {
		// range = [10, 30]
		int start = 10;
		int end = 30;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	static boolean isPrime(int num) {
		if (num < 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
