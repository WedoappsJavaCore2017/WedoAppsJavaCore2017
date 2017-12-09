package homework_28_10_17.homework_Karen;

public class AsciCode {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        char character = 0;
        for (char i = 65; i < 90; i++) {
            alphabet[character] = i;
            System.out.print(" " + alphabet[character]);
            character++;
        }


//        for (char i = 'A'; i <= 'Z'; i++) {
//            System.out.println(i);
//        }
    }
}
