package homework_04_11_17.homeworkAram;

import java.util.Scanner;

public class Axyusak {
    public static void main(String[] args) {
        axyusak();
    }
    static void axyusak() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("input number 1-9");
            int a = scanner.nextInt();
            if (a <= 0 || a > 9) {
                System.out.println("cher kareli");
                break;
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(a + " * " + i + " = " + (a * i));
            }
        }
    }
}
