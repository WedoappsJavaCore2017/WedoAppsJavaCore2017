package homework_28_10_17.homeworkSaro;

public class Tnayin4 {
    public static void main(String[] args) {
        char[] tastA = new char[26];
        char arrayA = 'A';
        for (int q = 0; q < tastA.length; q++) {
            tastA[q] = arrayA;
            arrayA++;
            System.out.println(tastA[q]);
        }
    }
}
