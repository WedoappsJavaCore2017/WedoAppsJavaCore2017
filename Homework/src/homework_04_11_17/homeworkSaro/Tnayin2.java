package homework_04_11_17.homeworkSaro;

import java.util.Scanner;

public class Tnayin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bazmapatkum = scanner.nextInt();
        for (int i = 0; i <= 9; i++){
            System.out.println(i+" * "+ bazmapatkum + " = "+artadryal(bazmapatkum, i));
        }
    }
    public static int artadryal( int a, int b){
        return  a * b;

    }
}
