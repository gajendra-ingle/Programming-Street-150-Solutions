package sprint_1;

//Checking if a Number is a Narcissistic Number
//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to check if a number is a narcissistic number (where the sum of its digits raised to the power of the number of digits equals the number itself).
//Example:
//Input: number = 153
//Output: Narcissistic Number
//Explanation: 153 is a narcissistic number because 1^3 + 5^3 + 3^3 = 153.

public class Solution_26 {

	public static void main(String[] args) {
		int number = 153;
		if (isNarcissisticNumber(number)) {
			System.out.println("Narcissistic Number");
		}
	}

	static boolean isNarcissisticNumber(int num) {
		int temp = num;
		int power = 0;
		while (temp > 0) {
			temp /= 10;
			power++;
		}

		int n = num;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += Math.pow(rem, power);
			n /= 10;
		}

		return sum == num;

	}
}
