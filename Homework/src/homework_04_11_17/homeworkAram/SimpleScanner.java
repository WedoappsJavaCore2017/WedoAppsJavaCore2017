package gor_gevorgyan.homework;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPrime(number)){
            System.out.println("Input " + isPrime(number) + " number simple");
        }else{
            System.out.println("Input " + isPrime(number) + " is not number simple");
        }


    }
    static boolean isPrime(int number){
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }else {
                return true;
            }
        }return false;
    }
}
