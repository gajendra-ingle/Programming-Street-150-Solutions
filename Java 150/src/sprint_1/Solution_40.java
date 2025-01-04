package sprint_1;

//Calculating the Sum of Digits of a Number Until Single Digit
//Difficulty: Medium
//Topics: Mathematical Computations
//Description: Write a program to keep summing the digits of a number until a single digit is obtained.
//Example:
//Input: number = 9875
//Output: 2
//Explanation: The sum of digits is 9 + 8 + 7 + 5 = 29, and then 2 + 9 = 11, and finally 1 + 1 = 2.

public class Solution_40 {
	public static void main(String[] args) {
		
		System.out.println(getSingleDigitSum(9875));
	}

	private static int getSingleDigitSum(int num) {
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			num = sum;
		}
		return num;
	}
}
