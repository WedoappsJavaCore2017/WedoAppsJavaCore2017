package homework_28_10_17.homeworkSeda;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        double averageTemp = 0;
        double[] array = {17.8, 18.4, 20.6, 18.5, 19.8, 16.4, 18.4};
        String[] arr = {"Երկուշաբթի", "Երեքշաբթի", "Չորեքշաբթի", "Հինգշաբթի", "Ուրբաթ", "Շաբաթ", "Կիրակի"};
        for (int i = 0; i < 7; i++) {
            averageTemp += array[i];
            System.out.println(arr[i] + "- " + array[i] + " աստիճան");
        }
        System.out.println(averageTemp / 7);
    }
}
