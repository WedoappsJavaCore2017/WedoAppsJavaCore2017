package arrayUtils;

import java.util.Random;

public class MultipleArray {
    public static void main(String[] args) {
        int[] array = new int[6];
        Random random = new Random();
        int[][] multArray = new int[4][];
//        {
//            {1,2,3},
//            {4,5,7},
//            {9,5,6}
//        }
        multArray[0] = new int[6];
        multArray[1] = new int[19];
        multArray[2] = new int[10];
        multArray[3] = new int[4];
        for (int i = 0; i < multArray.length; i++){
            for (int j = 0; j < multArray[i].length; j++) {
                multArray[i][j] = random.nextInt(30);
                System.out.print(multArray[i][j] + " - ");
            }
            System.out.println();
        }
    }
}
