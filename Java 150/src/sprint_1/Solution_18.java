package sprint_1;

//Generating Multiplication Tables
//Difficulty: Easy
//Topics: Basic Programming, Mathematical Computations
//Description: Write a program to generate multiplication tables for a given number.
//Example:
//Input: number = 4
//Output:
/*
4 x 1 = 4  
4 x 2 = 8  
4 x 3 = 12  
4 x 4 = 16  
4 x 5 = 20  
*/

public class Solution_18 {

	public static void main(String[] args) {
		int number = 4;
		printtTable(number);
	}

	static void printtTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}
}
