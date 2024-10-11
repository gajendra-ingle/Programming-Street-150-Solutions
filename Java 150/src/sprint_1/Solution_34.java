package sprint_1;

import java.util.Arrays;

//Checking for an Anagram
//Difficulty: Easy
//Topics: String Manipulation
//Description: Write a program to check if two strings are anagrams.
//Example:
//Input: string1 = "listen", string2 = "silent"
//Output: True
//Explanation: "listen" and "silent" are anagrams of each other.

public class Solution_34 {

	public static void main(String[] args) {
		String string1 = "listen";
		String string2 = "silent";
		System.out.println(isAnagram(string1, string2));
	}

	private static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
	}
}
