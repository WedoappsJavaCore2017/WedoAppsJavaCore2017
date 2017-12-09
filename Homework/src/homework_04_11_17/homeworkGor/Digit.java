package homework_04_11_17.homeworkGor;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please number 10 < Enter ");
        int number = scanner.nextInt();
        if (number < 10){
            System.out.println("Please give a big 10 number");
        }
        System.out.println(digitArray(number));
    }
    public static String digitArray(int number){
        String str = String.valueOf(number);
        int num ;
        for (int i = 0; i < str.length(); i++) {
            num = Character.digit(str.charAt(i), 10);
            System.out.println(num);
        }
        return "";

    }
}
