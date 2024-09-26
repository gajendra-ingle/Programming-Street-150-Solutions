package sprint_1;

//Checking for Armstrong Numbers in a Range
//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to find all Armstrong numbers within a given range.
//Example:
//Input: range = [1, 500]
//Output: [1, 153, 370, 371, 407]
//Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.

public class Solution_17 {

	public static void main(String[] args) {

		int start = 1;
		int end = 500;
		for (int i = start; i <= end; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}

	}

	static boolean isArmstrong(int num) {
		int temp = num;
		int digitCount = 0;
		while (temp > 0) {
			temp /= 10;
			digitCount++;
		}

		int n = num;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += Math.pow(rem, digitCount);
			n /= 10;
		}

		if (num == sum)
			return true;

		return false;
	}
}
