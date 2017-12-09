package triangles;

public class Four_angle {
    public static void main(String[]args) {

        int line = 31;
        int count = 1;

        for (int i = 1; i <= line; i++) {
            if (i > line / 2 + 1) {
                for (int k = 1; k <= line - count; k++) {

                    if (k <= i - (line / 2 + 1)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
                count++;
            } else {
                int y = (line / 2 + i);
                int z = line + 1;

                for (int j = 1; j <= y; j++) {

                    if (j >= z - y) {
                        System.out.print("*");
                    } else System.out.print(" ");

                }
                System.out.println();
            }


        }

    }

}

