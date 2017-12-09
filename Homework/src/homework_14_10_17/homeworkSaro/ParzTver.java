package homework_14_10_17.homeworkSaro;

public class ParzTver {
    public static void main(String[] args) {
        for (int b = 1; b <= 100; b++) {
            if (b < 2) {
                System.out.println("0 kam 1 chi handisanum parz tiv");
            } else if (b == 2) {
                System.out.println("2-y arajin parz tiv");
            } else {
                boolean bool = true;
                for (int a = 2; a <= (b / 2); a++) {
                    if (b % a == 0) {
                        bool = false;
                    }
                }
//                System.out.println(bool ? "b-n parz tiv e " + b : "b-n parz tiv che" + b);
                //  !bool

                if (bool == false) {
                    System.out.println("b-n parz tiv che" + b);
                } else {
                    System.out.println("b-n parz tiv e " + b);
                }
            }
        }
    }
}
