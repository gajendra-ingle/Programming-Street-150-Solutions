package sprint_1;

//Finding the Sum of Prime Numbers in a Range
//Difficulty: Medium
//Topics: Number Theory, Mathematical Computations
//Description: Write a program to calculate the sum of all prime numbers within a given range.
//Example:
//Input: range = [1, 10]
//Output: 17
//Explanation: The sum of prime numbers between 1 and 10 is 2 + 3 + 5 + 7 = 17.

public class Solution_35 {

	public static void main(String[] args) {

		int start = 1;
		int end = 10;

		int primeSum = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				primeSum += i;
			}
		}
		System.out.println(primeSum);
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
