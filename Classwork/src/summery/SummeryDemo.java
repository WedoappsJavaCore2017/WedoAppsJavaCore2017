package summery;

import java.util.Random;
import java.util.Scanner;

public class SummeryDemo {


    public static void main(String[] args) {
        swap(10, 39);
    }

    public static void continue_() {
        for (int i = 0; i < 15; i++) {
            if (i == 10) {
                break;
            }
            System.out.println(" i = " + i + " does not belong to (5 - 10)");
        }
    }

    public static boolean isStringPalindrome(String string) {

        return false;
    }


    public static void switchCase() {
        Random random = new Random();
        int a = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        switch (a) {
            case 10:
                System.out.println(" a = 10");
                break;
            case 9:
                System.out.println(" a = 9");
                break;
            case 8:
                System.out.println(" a = 8");
                break;
            default:
                System.out.println(" a < 8, a = " + a);
                break;
        }

        if (a == 10) {
            System.out.println(" a = 10");
        } else if (a == 9) {
            System.out.println("a = 9 ");
        } else {
            System.out.println("a < 9, a = " + a);
        }
    }

    public static void swap(int first, int second) {
        System.out.println(" first = " + first + ", second = " + second);
//        int temp = first;
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println(" first = " + first + ", second = " + second);
    }
}

