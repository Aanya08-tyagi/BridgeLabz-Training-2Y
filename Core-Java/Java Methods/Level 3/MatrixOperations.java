import java.util.Scanner;

public class MatrixOperations {

    // Method to generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + (int)(Math.random() * 9); // Random values 1–9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(String title, int[][] matrix) {
        System.out.println("\n" + title);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns for Matrix A: ");
        int rowsA = sc.nextInt(), colsA = sc.nextInt();

        System.out.print("Enter rows and columns for Matrix B: ");
        int rowsB = sc.nextInt(), colsB = sc.nextInt();

        // Generate matrices
        int[][] A = generateMatrix(rowsA, colsA);
        int[][] B = generateMatrix(rowsB, colsB);

        displayMatrix("Matrix A", A);
        displayMatrix("Matrix B", B);

        // Perform addition and subtraction if dimensions match
        if (rowsA == rowsB && colsA == colsB) {
            displayMatrix("Addition (A + B)", addMatrices(A, B));
            displayMatrix("Subtraction (A - B)", subtractMatrices(A, B));
        } else {
            System.out.println("\nAddition/Subtraction not possible: Dimension mismatch.");
        }

        // Perform multiplication if colsA == rowsB
        if (colsA == rowsB) {
            displayMatrix("Multiplication (A × B)", multiplyMatrices(A, B));
        } else {
            System.out.println("\nMultiplication not possible: A's columns ≠ B's rows.");
        }

        sc.close();
    }
}