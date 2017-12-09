package lesson_2_four_angle;

/**
 * Created by Angela on 10/14/2017.
 */
public class Border {
    public static void main(String[] args) {

        int line = 21;
        int count = 1;
        int q = 0;

        for (int i = 1; i <= line; i++) {
            if (i > line / 2 + 1) {
                int g = line - count;
                for (int k = 1; k <= g; k++) {
                    if (k == g || k == q - g) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                count++;
            } else {
                int y = (line / 2 + i);
//                int z = line + 1; Unused variable!!!!
                for (int j = 1; j <= y; j++) {

                    if (j == y || j == y - q) {
                        System.out.print("*");
                        q++;
                        if (q == 1) q = 2;
                    } else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}