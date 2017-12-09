package homework_04_11_17.homeworkSeda;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean numPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                numPrime = false;
                System.out.print(i + "  ");
            }
        }
        if (numPrime) {
            System.out.println(num+" is prime");
        }
    }
}
