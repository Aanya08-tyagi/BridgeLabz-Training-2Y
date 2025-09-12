import java.util.Scanner;

public class MatrixTool {

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = 1 + (int)(Math.random() * 9);
        return mat;
    }

    public static void displayMatrix(String title, int[][] mat) {
        System.out.println("\n" + title);
        for (int[] row : mat) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
    }

    public static void displayMatrix(String title, double[][] mat) {
        System.out.println("\n" + title);
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = mat[i][j];
        return transposed;
    }

    public static int determinant2x2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(int[][] mat) {
        int det = determinant2x2(mat);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / (double)det;
        inv[0][1] = -mat[0][1] / (double)det;
        inv[1][0] = -mat[1][0] / (double)det;
        inv[1][1] = mat[0][0] / (double)det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;

        double[][] cof = new double[3][3];
        cof[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        cof[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        cof[0][2] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        cof[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        cof[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        cof[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        cof[2][0] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        cof[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        cof[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        double[][] adj = transpose(cof);
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                adj[i][j] = adj[i][j] / det;

        return adj;
    }

    public static double[][] transpose(double[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = mat[i][j];
        return transposed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
            sc.close();
            return;
        }

        int[][] matrix = generateMatrix(size, size);
        displayMatrix("Original Matrix", matrix);

        int[][] transposed = transpose(matrix);
        displayMatrix("Transpose", transposed);

        if (size == 2) {
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);
            double[][] inverse = inverse2x2(matrix);
            if (inverse != null)
                displayMatrix("Inverse", inverse);
            else
                System.out.println("Inverse not possible (Determinant is 0)");
        } else {
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);
            double[][] inverse = inverse3x3(matrix);
            if (inverse != null)
                displayMatrix("Inverse", inverse);
            else
                System.out.println("Inverse not possible (Determinant is 0)");
        }

        sc.close(); // ✅ Resource properly closed
    }
}