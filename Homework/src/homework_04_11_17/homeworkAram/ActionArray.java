package gor_gevorgyan.homework;

import java.util.Random;

public class ActionArray {

    public static String sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    if (arr[i] > arr[j]) {
                        arr[i] = arr[i] + arr[j];
                        arr[j] = arr[i] - arr[j];
                        arr[i] = arr[i] - arr[j];

                    }
                }

            }
        }
        return "";
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    public static String printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        return "";
    }
}
