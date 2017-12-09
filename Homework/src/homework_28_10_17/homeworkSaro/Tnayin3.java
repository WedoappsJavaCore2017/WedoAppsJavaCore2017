package homework_28_10_17.homeworkSaro;

public class Tnayin3 {
    public static void main(String[] args) {
        char[] array = new char[26];
        char tastA = 65;
        for (int b = 0; b < array.length; b++) {
            array[b] = tastA;
            tastA++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
