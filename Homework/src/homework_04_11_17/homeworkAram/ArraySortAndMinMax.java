package homework_04_11_17.homeworkAram;

import java.util.Random;

import static gor_gevorgyan.homework.ActionArray.getMax;
import static gor_gevorgyan.homework.ActionArray.getMin;
import static gor_gevorgyan.homework.ActionArray.sortArray;
import static gor_gevorgyan.homework.ActionArray.printArray;

public class ArraySortAndMinMax {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.print(sortArray(arr));
        System.out.println("Get max array index " + getMax(arr));
        System.out.println("Get min array index " + getMin(arr));
        System.out.println(printArray(arr));

    }
}
