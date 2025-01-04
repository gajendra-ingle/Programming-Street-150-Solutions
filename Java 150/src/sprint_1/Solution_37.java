package sprint_1;

//Checking for Perfect Squares
//Difficulty: Easy
//Topics: Mathematical Computations
//Description: Write a program to determine if a number is a perfect square.
//Example:
//Input: number = 16
//Output: True
//Explanation: 16 is a perfect square (4^2 = 16).

public class Solution_37 {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(16));
	}

	private static boolean isPerfectSquare(int num) {
		if (num < 0) {
			return false; // Negative numbers can't be perfect squares
		}

		int sqrt = (int) Math.sqrt(num);
		return sqrt * sqrt == num;
	}
}
