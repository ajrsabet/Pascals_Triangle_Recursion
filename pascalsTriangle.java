
/*
 * CS240 Lab 1: Recursion
 * Team: John Humphry, Jing Lin Lai, Adam Sabet
 */
import java.util.Scanner;
import java.util.Arrays;

public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many levels Pascal's Triangle should be: ");

        int levelsDeep = scanner.nextInt();

        int triangle[][] = new int[levelsDeep][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    triangle[i][j] = 1;
                } else if (j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
            System.out.println(Arrays.toString(triangle[i]));
        }

        scanner.close();
    }
}
// Ask user how many levels

// Initiate a 2D array (rows, columns)

// Function

// Sample iterative function
// public static int[] calcRow(levelsDeep, triangle) {

// }
// Print row

/*---------------------------------------------------------------------------------------- */
// test that user input is int
// public static int inputTestInt(Scanner input) {
// boolean test = false;
// int userInput = -1;
// do {
// try {
// userInput = input.nextInt();
// test = true;
// } catch (Exception e) {
// System.out.println("Error! try again \n" + input.nextLine() + "\n is not
// valid");
// test = false;
// }

// } while (!test);
// return userInput;
// }
