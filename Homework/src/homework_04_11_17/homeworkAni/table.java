package homework_04_11_17.homeworkAni;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        table();
    }
    static void table(){
        while (true){
            Scanner num = new Scanner(System.in);
            int number = num.nextInt();
            System.out.println("Mutqagrel 1-9@ mijakaiqi voreve tiv.");
            for (int i = 1; i <= 10; i++){
                System.out.println(i + " * " + number + " = " + i*number);
            }
        }

    }
}
