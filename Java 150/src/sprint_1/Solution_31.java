package sprint_1;

//Generating a Pascal’s Triangle

//Difficulty: Medium
//Topics: Arrays, Mathematical Computations
//Description: Write a program to generate Pascal's Triangle up to a given number of rows.
//Example:
//Input: rows = 4
//Output:
//1  
//1 1  
//1 2 1  
//1 3 3 1  

public class Solution_31 {

	public static void main(String[] args) {

		int n = 4;
		generatingPascalTriangle(n);
	}

	private static void generatingPascalTriangle(int n) {
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				// First and last values in every row are 1
				if (i == j || j == 0) {
					arr[i][j] = 1;
				}

				else {
					// Other values are sum of values just above and left of above
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					System.out.print(arr[i][j]);
				}

			}
			System.out.println("");
		}
	}
}
