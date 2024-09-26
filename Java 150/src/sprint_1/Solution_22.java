package sprint_1;

//Calculating the Sum of Odd Numbers in a Range
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to find the sum of all odd numbers within a given range.
//Example:
//Input: range = [1, 10]
//Output: 25
//Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25.

public class Solution_22 {

	public static void main(String[] args) {

		int start = 1;
		int end = 10;
		int sum = oddSum(start, end);
		System.out.println(sum);
	}

	private static int oddSum(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}
}
