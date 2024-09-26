package sprint_1;

//Calculating the Sum of Even Numbers in a Range
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to find the sum of all even numbers within a given range.
//Example:
//Input: range = [1, 10]
//Output: 30
//Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.

public class Solution_21 {

	public static void main(String[] args) {

		// range
		int start = 1;
		int end = 10;
		int ans = evenSum(start, end);
		System.out.println(ans);

	}

	static int evenSum(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
