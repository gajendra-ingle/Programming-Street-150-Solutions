package sprint_1;

//Finding the Mode of Numbers in an Array
//Difficulty: Medium
//Topics: Arrays, Statistical Analysis
//Description: Write a program to find the mode (most frequent number) in an array.
//Example:
//Input: array = [1, 2, 2, 3, 4, 4, 4]
//Output: 4
//Explanation: The most frequent number in the array is 4.

public class Solution_45 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 4 };
		System.out.println(mostFrequentNumber(arr));
	}

	public static int mostFrequentNumber(int[] array) {
		int mostFrequent = array[0];
		int maxCount = 0;

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}

			if (count > maxCount) {
				mostFrequent = array[i];
				maxCount = count;
			}
		}
		return mostFrequent;
	}
}
