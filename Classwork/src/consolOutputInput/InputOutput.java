package consolOutputInput;

import java.util.Scanner;

public class InputOutput {
    static int arraySize = 10;
    public static void main(String[] args) {
        int[] array = new int[arraySize];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + arraySize + " numbers, and press Enter after each input");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array at first looks like this ");
        printArrayElements(array);
        System.out.println();

        System.out.println("Array sorted by acceding order looks like this");
        sortByAccedingOrder(array);
        printArrayElements(array);
        System.out.println();


        System.out.println("Array sorted by descending order looks like this");
        sortByDescendingOrder(array);
        printArrayElements(array);
        System.out.println();
    }

    public static void sortByAccedingOrder(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
    }

    public static void sortByDescendingOrder(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
    }

    public static void printArrayElements(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
