package matrices.task_6;

import java.util.Arrays;

/*
 * Form a square matrix of order n according to a given pattern (n-even).
 */

public class Task6 {
    public static void main(String[] args) {
        int evenNumber = 8;
        int[][] matrix = generateTaskMatrix(evenNumber);
        show(matrix);
    }

    public static int[][] generateTaskMatrix(int matrixSize) {
        if (matrixSize % 2 != 0) {
            return generateTaskMatrix(matrixSize + 1);
        }
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int row = 0; row < matrixSize; row++) {
            for (int column = 0; column < matrixSize; column++) {
                if (column >= matrixSize - row - 1 && column <= row ||
                        column < matrixSize - row && column >= row) {
                    matrix[row][column] = 1;
                }
            }
        }
        return matrix;
    }

    public static void show(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
