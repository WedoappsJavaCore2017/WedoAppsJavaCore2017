package homework_04_11_17.homeworkSaro;

import java.util.Random;
import java.util.Scanner;

public class Tnayin1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isSimple = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                isSimple = true;
            }
        }
        if (isSimple == true) {
            System.out.println("tivy parz che");
        } else {
            System.out.println("tivy parz e");
        }
    }
}





