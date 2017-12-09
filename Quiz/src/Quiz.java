import javaSETests.JavaSETest;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int[] userArr = new int[10];

        System.out.println("------------------------------------------------------");
        System.out.println("Please enter eny ten numbers");


        for (int i = 0; i < userArr.length; i++) {

            int userNum = scanner.nextInt();
            userArr[i] = userNum;

        }

        System.out.println("------------------------------------------------------");
        System.out.println("Your array is ");
        System.out.println();


        for (int i = 0; i < userArr.length; i++) {

            System.out.print(userArr[i] + "   ");

        }

        System.out.println();
        System.out.println("------------------------------------------------------");


        int max = 0;
        int min = 0;

        for (int i = 0; i < userArr.length; i++) {

            if (max < userArr[i]) {
                max = userArr[i];
            }
            if (min > userArr[i]) {
                min = userArr[i];
            }


        }


        System.out.println("Maximum value is " + max);
        System.out.println("Minimum value is " + min);
        System.out.println("------------------------------------------------------");


        System.out.println("Sorted array is ");
        System.out.println();

        for (int i = 1; i < userArr.length ; i++) {
            int j = i;

            while (j > 0 && userArr[j] < userArr[j - 1]) {

                int temp = userArr[j];
                userArr[j] = userArr[j - 1];
                userArr[j - 1] = temp;
                j--;

            }
        }

        for (int i = 0; i < userArr.length; i++) {
            System.out.print(userArr[i] + "   ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------");


    }

}
