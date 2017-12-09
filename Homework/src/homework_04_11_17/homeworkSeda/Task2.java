package homework_04_11_17.homeworkSeda;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "x" + num + "=" + i * num);
        }
    }
}
