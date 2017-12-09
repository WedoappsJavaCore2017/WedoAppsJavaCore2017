package homework_28_10_17.homeworkGor;

public class ArrayAlphabet {

    public static void main(String[] args) {
        char[] arrayCharAlphabet = new char[26];
        int index = 0;
        char i;
        for (i = 'A'; i <= 'Z'; ++i) {
            arrayCharAlphabet[index] = i;
            index++;
        }
        String result = new String(arrayCharAlphabet);
        System.out.println(result.length());
        System.out.println(result);
    }
}
