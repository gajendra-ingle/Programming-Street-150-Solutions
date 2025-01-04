package sprint_1;

//Generating a Square Matrix of a Given Size
//Difficulty: Medium
//Topics: Arrays, Matrix Operations
//Description: Write a program to generate a square matrix of a given size and fill it with sequential numbers.
//Example:
//Input: size = 3
//Output:
//1 2 3  
//4 5 6  
//7 8 9  

public class Solution_39 {

	public static void main(String[] args) {
		generateMatrix(3);
	}

	private static void generateMatrix(int size) {
		int num = 1;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

}
