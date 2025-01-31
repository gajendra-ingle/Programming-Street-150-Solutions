package sprint_1;

//Finding All Divisors of a Number
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to find all divisors of a given number.
//Example:
//Input: number = 12
//Output: 1, 2, 3, 4, 6, 12
//Explanation: The divisors of 12 are 1, 2, 3, 4, 6, and 12.

public class Solution_43 {

	public static void main(String[] args) {
		int number = 12;

		System.out.println("Divisors of " + number + ":");
		printDivisors(number);
	}

	public static void printDivisors(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
