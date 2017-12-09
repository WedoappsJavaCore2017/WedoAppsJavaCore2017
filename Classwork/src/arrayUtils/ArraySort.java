package arrayUtils;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        array = arrayLeftShift(array, 7);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//       System.out.println(Arrays.toString(siftLeft(array,5)));


//        Random random = new Random();
//        int[] randomArr = new int[10];
//        for (int i = 0; i < randomArr.length; i++) {
//            randomArr[i] = random.nextInt(100);
//            System.out.print(randomArr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < randomArr.length; i++) {
//            for (int j = i + 1; j < randomArr.length; j++) {
//                if (randomArr[i] > randomArr[j]) {
//                    randomArr[i] = randomArr[i] + randomArr[j];
//                    randomArr[j] = randomArr[i] - randomArr[j];
//                    randomArr[i] = randomArr[i] - randomArr[j];
//                }
//            }
//        }
//
//        for (int i = randomArr.length - 1; i > 0; i--) {
//            for (int j = 0; j <= i - 1; j++) {
//                if (randomArr[j] > randomArr[j + 1]) {
//                    int temporary = randomArr[j];
//                    randomArr[j] = randomArr[j + 1];
//                    randomArr[j + 1] = temporary;
//                }
//            }
//        }
//
//
//        for (int i = 0; i < randomArr.length; i++) {
//            System.out.print(randomArr[i] + " ");
//        }

//        int[] arr = {2, 7, 8, 9, 1, 3};
//
//        arrayLeftShift(arr, 4);
//    }
//
//    public static void arrayLeftShift(int [] array, int point){
//        int arrLength = array.length;
//        if(point < 1 && point >= arrLength){
//            System.out.println("Invalid point");
//            return;
//        }
//        int [] tempArray = new int[point];
//        for (int i = 0; i < point; i++) {
//            tempArray[i] = array[i];
//        }
//
//        for (int i = 0; i < arrLength; i++) {
//            if(i < arrLength - point){
//                array[i] = array[i + point];
//            } else {
//                array[i] = tempArray[arrLength - i - 1];
//            }
    }

    public static int[] arrayLeftShift(int[] array, int point) {

        int temp[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[point];
            point = (point + 1) % array.length;
        }

        return temp;

    }

    public static int[] siftLeft(int[] array, int point) {


        for (int i = 0; i < array.length - point; i++) {

            int temp = array[i];
            array[i] = array[point - i];
            array[point - i] = temp;


        }

        return array;

    }

}



