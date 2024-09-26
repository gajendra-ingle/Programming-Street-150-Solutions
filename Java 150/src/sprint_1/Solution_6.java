package sprint_1;

//Identifying Palindromes

//Difficulty: Easy
//Topics: Basic Programming, String Manipulation
//Description: Write a program to check if a string or number is a palindrome.
//Example:
//Input: string = "radar"
//Output: Palindrome
//Explanation: "radar" reads the same backward as forward.

public class Solution_6 {

	public static void main(String[] args) {

		String str = "radar";
		if (isStringPalindrome(str)) {
			System.out.println("String is a palindrome");
		}

		int num = 12321;
		if (isNumberPalindrome(num)) {
			System.out.println("Number is Plaindrome");
		}

	}

	public static boolean isStringPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start <= end) {
			char s = str.charAt(start);
			char e = str.charAt(end);
			if (Character.toLowerCase(s) != Character.toLowerCase(e)) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

	public static boolean isNumberPalindrome(int n) {

		int temp = n;
		int rev = 0;
		while (temp > 0) {
			int rem = temp % 10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}

		if (rev == n) {
			return true;
		}
		return false;
	}
}
