package homework_28_10_17.homeworkSeda;

public class Task3 {
    public static void main(String[] args) {
        int a = 65;
        int b = 97;
        char[] abs = new char[26];
        char[] abc = new char[26];
        for (int i = 0; i < abs.length; i++) {
            abs[i] = (char) a;
            a++;
        }
        for (int i = 0; i < abc.length; i++) {
            abc[i] = (char) b;
            b++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(abs[i] + " " + abc[i] + ", ");
        }
    }
}
