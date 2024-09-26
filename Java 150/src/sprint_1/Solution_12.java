package sprint_1;

//Counting Vowels and Consonants in a String
//Difficulty: Easy
//Topics: Basic Programming, String Manipulation
//Description: Write a program to count vowels and consonants in a given string.
//Example:
//Input: string = "hello world"
//Output: Vowels: 3, Consonants: 7
//Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).

public class Solution_12 {

	public static void main(String[] args) {

		String str = "hello world";
		countVowelsAndConsonants(str);
	}

	private static void countVowelsAndConsonants(String str) {
		int vowelsCount = 0;
		int consonantsCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelsCount++;
			} else {
				if (str.charAt(i) != ' ') {
					consonantsCount++;
				}
			}
		}

		System.out.println("Vowels: " + vowelsCount + ", " + "Consonants: " + consonantsCount);

	}
}
