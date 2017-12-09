package homework_28_10_17.homeworkSaro;

public class Tnayin1 {
    public static void main(String[] args) {
        double[] number = new double[10];
        double a = 0.1;
        for (int b = 0; b < number.length; b++) {
            System.out.println(a);
            number[b] = a;
            a += 0.1;
        }
    }
}

