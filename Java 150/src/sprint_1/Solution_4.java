package sprint_1;

//Calculating Armstrong Numbers
//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to check if a number is an Armstrong number.
//Example:
//Input: number = 153
//Output: Armstrong Number
//Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

public class Solution_4 {

	public static void main(String[] args) {

		int number = 153;
		if (checkArmstrongNumber(number)) {
			System.out.println("Armstrong Number");
		}
	}

	public static boolean checkArmstrongNumber(int num) {
		int temp = num;
		int power = 0;
		while (temp > 0) {
			temp /= 10;
			power++;
		}

		int temp1 = num;
		int sum = 0;
		while (temp1 > 0) {
			int rem = temp1 % 10;
			sum += Math.pow(rem, power);
			temp1 /= 10;
		}

		if (sum == num) {
			return true;
		}
		return false;
	}
}
