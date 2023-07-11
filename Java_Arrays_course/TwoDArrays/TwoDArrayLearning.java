package TwoDArrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import TwoDArrays.MatrixMultiplicationException;

public class TwoDArrayLearning {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int [][] TwoDarray = random2DArray(rows, cols);
        print2Darray(TwoDarray);
        System.out.println(sumOfRows(TwoDarray));
        try {
            int[][] matrix1 = random2DArray(3, 4);
            int[][] matrix2 = random2DArray(4, 3);
            int[][] product = matrixMultiplication(matrix1, matrix2);
            print2Darray(product);
        } catch (MatrixMultiplicationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void print2Darray(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        
    }

    public static int[][] random2DArray(int rows, int cols){
        int[][] arr = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int randomNum = ThreadLocalRandom.current().nextInt(0, rows*cols + 1);;
                arr[i][j] = randomNum;
            }
        }
        return arr;
    }

    public static ArrayList<Integer> sumOfRows(int[][] arr){
        int rows = arr.length;  
        int cols = arr[0].length;
        ArrayList<Integer> sum = new ArrayList<>();
        for(int i = 0; i<rows; i++){
            int rowSum = 0;
            for(int j = 0; j < cols; j++){
                rowSum = rowSum+arr[i][j];
            }
            sum.add(rowSum);
        }
        
        return sum;
    }   

    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) throws MatrixMultiplicationException{
        int cols1 = matrix1[0].length;
        int rows1 = matrix1.length;
        int cols2 = matrix2[0].length;
        int rows2 = matrix2.length;
        
        if (cols1 != rows2) {
            throw new MatrixMultiplicationException("Matrix dimensions are incompatible for multiplication.");
        }
        
        int[][] result = new int[rows1][cols2];
        
        for(int i = 0; i < rows1; i++){
            for(int j = 0; j < cols2; j++){
                for(int k = 0; k < cols1; k++){
                    result[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        return result;
    }
}

