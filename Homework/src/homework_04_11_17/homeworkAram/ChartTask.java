package gor_gevorgyan.homework;

import java.util.Scanner;

public class ChartTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (1 <= number && number <= 9){
            System.out.println("  " + chartNumbers(number));
        }else{
            System.out.println("Plisse 0 < number , number > 9 ");
        }
    }
    static String chartNumbers(int number){

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " * " + number  + " = " + i * number);

        }
        return "";
    }
}
