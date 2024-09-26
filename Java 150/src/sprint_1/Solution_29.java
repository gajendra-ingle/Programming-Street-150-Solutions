package sprint_1;

//Finding the Largest Palindrome in a String
//Difficulty: Easy
//Topics: Basic Programming, String Manipulation
//Description: Write a program to find the largest palindrome in a given string.
//Example:
//Input: string = "babad"
//Output: "bab" or "aba"
//Explanation: Both "bab" and "aba" are valid palindromes in the string.

public class Solution_29 {

	public static void main(String[] args) {
		String str = "babad";

		String s = findLargestPalindrome(str);
		System.out.println(s);
	}

	public static String findLargestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		String largestPalindrome = "";
		int length = s.length();

		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				String substring = s.substring(i, j + 1);
				if (isPalindrome(substring)) {
					if (substring.length() > largestPalindrome.length()) {
						largestPalindrome = substring;
					}
				}
			}
		}

		return largestPalindrome;
	}

	// check if a string is a palindrome
	private static boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}
}
