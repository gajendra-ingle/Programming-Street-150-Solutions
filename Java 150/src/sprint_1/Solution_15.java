package sprint_1;

//Sorting an Array
//Difficulty: Easy
//Topics: Basic Programming, Sorting Algorithms
//Description: Write a program to sort an array of numbers in ascending order.
//Example:
//Input: array = [3, 1, 4, 1, 5, 9]
//Output: [1, 1, 3, 4, 5, 9]
//Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9].

public class Solution_15 {

	public static void main(String[] args) {

		int[] array = { 3, 1, 4, 1, 5, 9 };
		sort(array);
		System.out.print("[");
		for (int val : array) {
			System.out.print(val + ", ");
		}
		System.out.print("]");
	}

	private static void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}
