package sprint_1;

//Finding the Second Largest Number in an Array
//Difficulty: Medium
//Topics: Arrays, Sorting
//Description: Write a program to find the second largest number in an array.
//Example:
//Input: array = [10, 20, 4, 45, 99]
//Output: 45
//Explanation: The second largest number in the array is 45.

public class Solution_49 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 4, 45, 99};
		System.out.println(findSecondMax(arr));
	}

	public static int findSecondMax(int[] nums) {
		int max = 0;
		int secondMax = 0;

		for (int num : nums) {
			if (num > max) {
				secondMax = max;
				max = num;
			} else if (num > secondMax && num < max) {
				secondMax = num;
			}
		}
		return secondMax;
	}
}
