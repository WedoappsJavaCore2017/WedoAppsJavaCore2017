/**
 * Created by Robert on 19.09.2016.
 */
public class SpiralClass {
    public static void main(String[] args) {
        printSpiralUsingTwo_DimensionalArray(9);
    }

    public static void printSpiralUsingTwo_DimensionalArray(int arrayLenght){
          int[][] spiral = new int[arrayLenght][arrayLenght];
          int value = arrayLenght*arrayLenght;
          int minCol = 0;
          int maxCol = arrayLenght-1;
          int minRow = 0;
          int maxRow = arrayLenght-1;
          while (value >= 1) {
              for (int i = minRow; i <= maxRow; i++) {
                  spiral[i][maxCol] = value;
                  value--;
              }
              for (int i = maxCol - 1; i >= minCol; i--) {
                  spiral[maxRow][i] = value;
                  value--;
              }
              for (int i = maxRow-1; i >= minRow; i--) {
                  spiral[i][minCol] = value;
                  value--;
              }

              for (int i = minCol+1; i <= maxCol - 1; i++) {
                  spiral[minRow][i] = value;
                  value--;
              }
              minCol++;
              minRow++;
              maxCol--;
              maxRow--;
//              if(maxCol == arrayLenght/2-1 || maxRow == arrayLenght/2-1){
//                  break;
//              }
          }

          for (int i = 0; i < spiral.length; i++) {
              for (int j = 0; j < spiral.length; j++) {
                  System.out.print(spiral[i][j] + "\t");
              }

              System.out.println();
          }

//        print(spiral);
      }


    public static int countOfDigits(int number) {
        if (number < 10) return 1;
        if (number < 100) return 2;
        if (number < 1000) return 3;
        if (number < 10000) return 4;
        if (number < 100000) return 5;
        if (number < 1000000) return 6;
        if (number < 10000000) return 7;
        if (number < 100000000) return 8;
        if (number < 1000000000) return 9;
        return 10;
    }

    public static final String[] spaces = {
            " ",
            "  ",
            "   ",
            "    ",
            "     ",
            "      ",
            "       ",
            "        ",
            "         "
    };


    public static void print(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            int currRowLength = matrix[i].length;
            for (int j = 0; j < currRowLength; j++) {
                matrix[i][j] = i;
                System.out.print(matrix[i][j] + spaces[countOfDigits(matrix[size - 1][size - 1])
                        - countOfDigits(matrix[i][j])]);
            }
            System.out.println();
        }
    }
}
