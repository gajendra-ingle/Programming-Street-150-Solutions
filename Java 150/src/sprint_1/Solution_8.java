package sprint_1;

//Finding the Factorial of a Number
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to compute the factorial of a given number.
//Example:
//Input: number = 5
//Output: 120
//Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.
public class Solution_8 {

	public static void main(String[] args) {

		int number = 5;
		findFactorial(number);
	}

	public static void findFactorial(int number) {

		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}

}
