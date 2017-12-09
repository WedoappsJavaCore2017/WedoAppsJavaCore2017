package homework_21_10_17.homework_Saro;

public class Tnayin6 {
    public static void main(String[] args) {
        int raw = 10;
        for (int a = raw; a > 0; a--) {
            for (int b = 0; b < 2 * raw; b++) {
                if (b < raw + a && b > raw - a) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
