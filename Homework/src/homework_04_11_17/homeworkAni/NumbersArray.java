package homework_04_11_17.homeworkAni;

import java.util.Random;

public class NumbersArray {
    public static void main(String[] args) {
        array();
    }
    static void array(){
        while (true) {
        int arraySize = 20;
        Random random = new Random();
        int[] numbersArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            int number = random.nextInt(50);
            numbersArray[i] = number;
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();
        for (int i = arraySize - 1; i > 0; i--) {
            for (int k = 0; k <= i - 1; k++) {
                if (numbersArray[k] > numbersArray[k+1]) {
                    int temp = numbersArray[k];
                    numbersArray[k] = numbersArray[k+1];
                    numbersArray[k+1] = temp;
                }
            }
            System.out.print(numbersArray[i] + " ");

        }
        System.out.println();
        System.out.println("Max  = " + numbersArray[0]);
        System.out.println("Min = " + numbersArray[arraySize - 1]);

        }
    }
}
