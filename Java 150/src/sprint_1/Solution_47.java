package sprint_1;

//Generating a Number Pyramid
//Difficulty: Medium
//Topics: Patterns, Basic Programming
//Description: Write a program to generate a pyramid of numbers (e.g., 1, 12, 123, etc.).
//Example:
//Input: rows = 4
//Output:
//1  
//12  
//123  
//1234  

public class Solution_47 {

	public static void main(String[] args) {

		int rows = 4;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
