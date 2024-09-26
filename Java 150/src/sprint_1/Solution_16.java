package sprint_1;

//Finding the Sum of Elements in an Array
//Difficulty: Easy
//Topics: Basic Programming, Arrays
//Description: Write a program to find the sum of elements in an array.
//Example:
//Input: array = [1, 2, 3, 4, 5]
//Output: 15
//Explanation: The sum of the elements in the array is 15.

public class Solution_16 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		findArraySum(array);
	}

	private static void findArraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}
}
