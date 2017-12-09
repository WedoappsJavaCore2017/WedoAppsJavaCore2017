package lesson_2_four_angle;

/**
 * Created by Angela on 10/15/2017.
 */
public class Pyutagoras {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                System.out.print("    ");
            } else {
                System.out.print(i + "   ");
            }
            for (int j = 1; j < 11; j++) {
                if (i == 0) {
                    System.out.print(i + j + "    ");
                } else if (i * j > 9) {
                    System.out.print(i * j + "   ");
                } else {
                    System.out.print(i * j + "    ");
                }
            }
            System.out.println();

        }

    }
}
