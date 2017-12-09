package homework_04_11_17.homeworkAni;

import java.util.Random;
import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        simpleNumber();

    }

    public static void simpleNumber(){
        while (true) {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int armat = (int) Math.sqrt(number);
        String string = "";


            boolean isSimple = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0 ) {
                    string = string + i + " ";
                    isSimple = false;
                }
            }
            System.out.print(string);
            if (isSimple) {
                System.out.println("Parz tiv e");
            }

        }

    }

}
