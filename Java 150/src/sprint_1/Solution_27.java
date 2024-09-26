package sprint_1;

//Generating a Pattern of Numbers
//Difficulty: Easy
//Topics: Basic Programming, Patterns
//Description: Write a program to generate number patterns (e.g., sequential numbers in a matrix).
//Example:
//Input: rows = 3
//Output:
/*
1  
2 3  
4 5 6  
*/
public class Solution_27 {

	public static void main(String[] args) {
		int row = 3;
		printPattern(row);
	}

	static void printPattern(int num) {
		int n = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n++ + " ");
			}
			System.out.println();
		}
	}
}
