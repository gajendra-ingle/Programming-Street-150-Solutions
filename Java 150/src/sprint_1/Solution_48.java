package sprint_1;

//Finding the Sum of Prime Factors of a Number
//Difficulty: Medium
//Topics: Number Theory, Mathematical Computations
//Description: Write a program to find the sum of the prime factors of a given number.
//Example:
//Input: number = 12
//Output: 5
//Explanation: The prime factors of 12 are 2 and 3, and their sum is 2 + 3 = 5.

public class Solution_48 {

	public static void main(String[] args) {
		System.out.println(sumOfPrimeFactors(12));
	}

	static int sumOfPrimeFactors(int n) {
		int sum = 0;
		if (n % 2 == 0) {
			sum += 2;
			while (n % 2 == 0) {
				n /= 2;
			}
		}
		for (int i = 3; i <= n; i += 2) {
			if (n % i == 0) {
				sum += i;
				while (n % i == 0) {
					n /= i;
				}
			}
		}
		return sum;
	}
}
