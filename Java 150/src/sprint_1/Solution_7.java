package sprint_1;

//Crafting Star Patterns
//Difficulty: Easy
//Topics: Basic Programming, Patterns
//Description: Write a program to create different star patterns (e.g., pyramid, diamond).
//Example:
//Input: patternType = "pyramid", height = 5
//Output:
/*
    *
   ***
  *****
 *******
*********
*/

public class Solution_7 {

	public static void main(String[] args) {
		int height = 5;
		printPattern(height);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			// Print asterisks
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
