package sprint_1;

//Finding the Count of Specific Digits in a Number
//Difficulty: Easy
//Topics: Basic Programming, String Manipulation
//Description: Write a program to count the occurrences of a specific digit in a number.
//Example:
//Input: number = 122333, digit = 3
//Output: 3
//Explanation: The digit 3 occurs 3 times in the number 122333.

public class Solution_41 {

	public static void main(String[] args) {
		
		int number = 122333, digit = 3;
		System.out.println(findDigitFrequency(number, digit));
	}

	public static int findDigitFrequency(int number, int digit) {
		int count = 0;
		while (number != 0) {
			int lastDigit = number % 10;
			if (lastDigit == digit) {
				count++;
			}
			number = number / 10;
		}
		return count;
	}

}
