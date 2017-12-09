package homework_04_11_17.homeworkSaro;

import java.util.Random;
import java.util.Scanner;

public class Tnayin3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");
        }
        sortByAcceding(array);
        System.out.println();
        printarray(array);
        System.out.println();
        maxMinArray(array);
    }
    public static void sortByAcceding(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tiv = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tiv;
                }
            }
        }
    }
    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
    public static void maxMinArray(int[] array) {
        int maxarray = array[0];
        int minarray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxarray) {
                maxarray = array[i];
            }
            if (array[i] < minarray) {
                minarray = array[i];
            }
        }
        System.out.println("max " + maxarray);
        System.out.println("min " + minarray);
    }
}

