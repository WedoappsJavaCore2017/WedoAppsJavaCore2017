package homework_14_10_17.homeworkKaren;

public class Treangle {

    public static void main(String[] args) {
        firstTreangle(10);
        System.out.println("");
        secondTreangle(10);
        System.out.println("");
        thirdTreangle(10);
        System.out.println("");
        fourTriangle(10);
    }

    public static void firstTreangle(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void secondTreangle(int number) {
        for (int i = number; i > 0; i--) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void thirdTreangle(int number) {
        for (int i = number; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = number; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void fourTriangle(int nummber) {
        for (int i = nummber; i > 0; i--) {
            for (int j = nummber; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    long l = 2L;
    double d = 34.23423;
}