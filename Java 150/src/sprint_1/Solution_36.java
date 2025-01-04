package sprint_1;

// Finding the N-th Triangular Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to find the N-th triangular number.
// Example:
// Input: N = 4
// Output: 10
// Explanation: The 4th triangular number is 10 (sum of the first 4 natural numbers).

public class Solution_36 {

    public static void main(String[] args) {
        System.out.println(findNthTriangularNumber(4));
    }
    private static int findNthTriangularNumber(int n) {
        // Formula: N-th triangular number = N * (N + 1) / 2
        return n * (n + 1) / 2;
    }
}
