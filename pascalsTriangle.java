
/*
 * CS240 Lab 1: Recursion
 * Team: John Humphry, Jing Lin Lai, Adam Sabet
 */
import java.util.Scanner;
import java.util.Arrays;

public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user how many levels
        System.out.print("Enter how many levels Pascal's Triangle should be: ");

        int levels = inputTestInt(scanner); // with testing input

        int triangle[][] = new int[levels][];
        int i = 0;
        int j = 0;

        recursion(triangle, i, j);

        // Sample iterative function
        // solved using iteration
        // for (int i = 0; i < triangle.length; i++) {
        // triangle[i] = new int[i + 1];
        // for (int j = 0; j <= i; j++) {
        // if (j == 0) {
        // triangle[i][j] = 1;
        // } else if (j == i) {
        // triangle[i][j] = 1;
        // } else {
        // triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
        // }
        // }
        // System.out.println(Arrays.toString(triangle[i]));
        // }

        scanner.close();
    }

    // Recursive Function REV 1
    public static void recursion(int[][] triangle, int i, int j) {
        if (i == triangle.length) { // Base case: stop recursion
            return;
        }

        // System.out.println("i: " + i + " j: " + j);
        if (j == i) { // Last column
            if (i == 0) { // Correct for first row
                triangle[i] = new int[i + 1]; // Create a new row
            }
            triangle[i][j] = 1;
            printRow(triangle[i]);
            recursion(triangle, i + 1, 0); // Move to the next row
        } else if (j == 0) { // First column
            triangle[i] = new int[i + 1]; // Create a new row
            triangle[i][j] = 1;
            // printRow(triangle[i]);
            recursion(triangle, i, j + 1);
        } else { // Middle columns
            if (i > 0 && j > 0) { // Ensure valid indices
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                recursion(triangle, i, j + 1);
            }
        }
    }

    // Print triangle
    public static void printRow(int row[]) {
        System.out.println(Arrays.toString(row));
    }

    /*---------------------------------------------------------------------------------------- */
    // test that user input is int
    public static int inputTestInt(Scanner input) {
        boolean test = false;
        int userInput = -1;
        do {
            try {
                userInput = input.nextInt();
                test = true;
            } catch (Exception e) {
                System.out.println("Error! try again \n" + input.nextLine() + "\n is not valid");
                test = false;
            }

        } while (!test);
        return userInput;
    }
}
