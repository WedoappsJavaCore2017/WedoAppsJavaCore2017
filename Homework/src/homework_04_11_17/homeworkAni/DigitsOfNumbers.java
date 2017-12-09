package homework_04_11_17.homeworkAni;

import java.util.Scanner;

public class DigitsOfNumbers {
    public static void main(String[] args) {
        digitsOfNumber();
    }
    static void digitsOfNumber() {
        while (true) {
            System.out.println("Mutqagrel 10-ic mec tiv");
            Scanner num = new Scanner(System.in);
            int n = num.nextInt();
            int[] arr = new int[10];
            if (n >= 10) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = n % 10;
                    n = n / 10;
                    System.out.print(arr[arr.length - 1 - i] + " ");
                }
            } else System.out.println("Mutqagrel 10-ic mec tiv!!");
        }
    }
}
