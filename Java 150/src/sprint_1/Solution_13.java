package sprint_1;

//Reversing a String
//Difficulty: Easy
//Topics: Basic Programming, String Manipulation
//Description: Write a program to reverse a given string.
//Example:
//Input: string = "programming"
//Output: "gnimmargorp"
//Explanation: The reversed string of "programming" is "gnimmargorp".

public class Solution_13 {

	public static void main(String[] args) {

		String str = "programming";
		reverseString(str);
	}

	private static void reverseString(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);

	}

}
