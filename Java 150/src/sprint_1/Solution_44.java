package sprint_1;

//Finding the Average of Numbers in an Array
//Difficulty: Easy
//Topics: Arrays, Mathematical Computations
//Description: Write a program to calculate the average of numbers in an array.
//Example:
//Input: array = [1, 2, 3, 4, 5]
//Output: 3
//Explanation: The average of the numbers is (1 + 2 + 3 + 4 + 5) / 5 = 3.

public class Solution_44 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(calculateTheAverage(arr));
	}

	static int calculateTheAverage(int[] arr) {
		int sum = 0;
		for (int val : arr) {
			sum += val;
		}
		return sum / arr.length;
	}
}
