package sprint_1;

import java.util.Arrays;

//Finding the Median of an Array
//Difficulty: Medium
//Topics: Arrays, Sorting
//Description: Write a program to find the median of an array of numbers.
//Example:
//Input: array = [3, 1, 2, 4, 5]
//Output: 3
//Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3.

public class Solution_32 {

	public static void main(String[] args) {

		int[] array = { 3, 1, 2, 4, 5 };
		System.out.println(medianArray(array));
	}

	private static int medianArray(int[] arr) {
		Arrays.sort(arr);
		int median = arr.length / 2;
		return arr[median];
	}
}
