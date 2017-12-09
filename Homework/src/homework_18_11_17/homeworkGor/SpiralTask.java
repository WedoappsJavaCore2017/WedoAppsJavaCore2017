package gor_gevorgyan.homework;

public class SpiralTask {
    public static void main(String[] args) {
        int[][] matrix = createSpiral(5);
        System.out.println("------------------------------");
        printMatrix(matrix);

    }


    public static int[][] createSpiral(int size) {
        int[][] matrix = new int[size][size];
        int k = size * size;
        int up = 0;
        int left = size - 1;

        while (k >= 1) {
            for (int i = up; i <= left; i++) {
                matrix[up][i] = k--;
            }
            for (int j = up + 1; j <= left; j++) {
                matrix[j][left] = k--;
            }
            for (int i = left - 1; i >= up; i--) {
                matrix[left][i] = k--;
            }

            for (int j = left - 1; j >= up + 1; j--) {
                matrix[j][up] = k--;
            }

            up++;
            left--;
        }
        for ( int i = 0;i < size; i++){
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        return matrix;
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ",  ");
            }
        }
    }
}
