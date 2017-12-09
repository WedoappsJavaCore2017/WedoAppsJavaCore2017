package homework_28_10_17.homework_Anna;

import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {

        //ex1
        randomArray();

        System.out.println();

        //ex2
        daysTempArray();

        System.out.println();

        //ex3
        charArray();
    }

    public static void randomArray() {
        Random random = new Random();
        int size = 10;
        float [] randomArray = new float[size];

        for (int i = 0; i < size; i++) {
            float number = random.nextFloat();
            randomArray[i] = number;
            System.out.println(randomArray[i]);
        }

    }

    public static void daysTempArray() {
        double sum = 0;
        double [] daysTempArray = {17.8, 18.4, 19.9, 18.7, 16.2, 15.1, 16.3};

        for (int i = 0; i < daysTempArray.length; i++) {
            sum = sum + daysTempArray[i];
        }
        System.out.println(sum/daysTempArray.length);

    }

    public static void charArray() {
        int size = 52 ;//26
        int charI = 65;
        char [] charArray = new char[size];

        for (int i = 0; i < size; i+=2/* += 1 */) {
            charArray[i] = (char) charI;
            charI++;
            System.out.print(charArray[i]+" ");
        }
    }


}
