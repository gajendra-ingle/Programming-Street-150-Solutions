package sprint_1;

//Finding Missing Numbers in a Sequence
//Difficulty: Easy
//Topics: Basic Programming, Arrays
//Description: Write a program to find missing numbers in a sequence from 1 to n.
//Example:
//Input: sequence = [1, 2, 4, 5]
//Output: [3]
//Explanation: The missing number in the sequence from 1 to 5 is 3.

public class Solution_30 {

	public static void main(String[] args) {
		int[] sequence = { 1, 2, 4, 5 };

		int missingNumber = findMissingNumber(sequence);
		System.out.println(missingNumber);

	}

	static int findMissingNumber(int[] arr) {
		int n = arr.length;

		int totalSum = (n * (n + 1)) / 2;
		int arraySum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			arraySum += arr[i];
		}

		return totalSum - arraySum;

	}
}
