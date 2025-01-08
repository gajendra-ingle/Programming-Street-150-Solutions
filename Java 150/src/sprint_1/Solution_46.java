package sprint_1;

//Determining the Length of a String Without Using Built-In Functions
//Difficulty: Medium
//Topics: String Manipulation
//Description: Write a program to determine the length of a string without using built-in functions.
//Example:
//Input: string = "hello"
//Output: 5
//Explanation: The length of the string "hello" is determined without using built-in functions.

public class Solution_46 {

	public static void main(String[] args) {

		String str = "hello";

		int count = 0;
		for (char ch : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}

}
