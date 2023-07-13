package TwoDArrays;
import java.util.Arrays;
import java.util.Random;

public class TwoDArrayLearning {
    public static void main(String[] args) {
        int[][] matrix1 = createRandomArray(3, 3);
        int[][] matrix2 = createRandomArray(2, 4);

        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        try {
            int[][] result = multiplyMatrices(matrix1, matrix2);
            System.out.println("Resultant Matrix:");
            printMatrix(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Matrices cannot be multiplied.");
        }
    }

    public static int[][] createRandomArray(int rows, int columns) {
        Random random = new Random();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(10); // Random integer from 0 to 9
            }
        }
        return array;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        if (columns1 != rows2) {
            throw new IllegalArgumentException("Matrices cannot be multiplied.");
        }

        int[][] result = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}