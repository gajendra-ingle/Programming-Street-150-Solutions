package sprint_1;

//Finding the Largest and Smallest Numbers in an Array
//Difficulty: Easy
//Topics: Basic Programming, Arrays
//Description: Write a program to find the largest and smallest numbers in an array.
//Example:
//Input: array = [4, 7, 1, 8, 5]
//Output: Largest: 8, Smallest: 1
//Explanation: The largest number in the array is 8 and the smallest is 1.

public class Solution_14 {

	public static void main(String[] args) {

		int[] array = { 4, 7, 1, 8, 5 };
		findLargestAndSmallest(array);

	}

	private static void findLargestAndSmallest(int[] array) {
		int largest = array[0];
		int smallest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		System.out.println("Largest: " + largest + " Smallest: " + smallest);

	}

}
