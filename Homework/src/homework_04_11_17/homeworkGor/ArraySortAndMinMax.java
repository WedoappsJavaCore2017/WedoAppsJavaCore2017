package homework_04_11_17.homeworkGor;

import java.util.Random;

import static homework_04_11_17.homeworkGor.ActionArray.getMax;
import static homework_04_11_17.homeworkGor.ActionArray.getMin;
import static homework_04_11_17.homeworkGor.ActionArray.printArray;
import static homework_04_11_17.homeworkGor.ActionArray.sortArray;

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
