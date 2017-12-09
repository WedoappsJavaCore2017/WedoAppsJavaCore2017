package lesson_2_four_angle;

/**
 * Created by Angela on 10/15/2017.
 */
public class Pyutagoras_oneCycle {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        int line = 0;
        for (int j = 1; j <= 10; j++) {
            if (i * j == i && i != 0) {
                System.out.print(i + "   ");
            } else if (i == 0 && i + j == 1) {
                System.out.print("    ");
            }
            if (i == 0) {
                System.out.print(i + j + "   ");
                count++;
                if (count == 10) {
                    System.out.println();
                    line++;
                    if (line == 9) break;
                    count = 0;
                    j = 0;
                    i++;
                }
            } else {
                if (i * j > 9) {
                    System.out.print(i * j + "  ");
                    count++;
                } else {
                    System.out.print(i * j + "   ");
                    count++;
                }
                if (count == 10) {
                    System.out.println();
                    line++;
                    if (line == 10) break;
                    count = 0;
                    j = 0;
                    i++;
                }
            }
        }
    }


}

