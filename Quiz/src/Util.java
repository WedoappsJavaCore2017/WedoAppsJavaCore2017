import javax.print.DocFlavor;

/**
 * Created by Robert on 14.10.2016.
 */

public class Util {

    public static void main(String[] args) {
//        System.out.println(findLongestPalindrome("madama ."));


        //shiftLeft
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        array = shiftLeft(array, 1);
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }


//        palindrome("AsdfghjjkA");
//        System.out.println(reverseString("asdfghjkl;"));
        String string = "raceiutrwerfecar";
        istPalindrom(string.toCharArray());
    }

    /**
     * A palindrome is a word, phrase, number or other sequence of units that has
     * the property of reading the same in either direction
     * like ara , anna, madam, wow, radar, etc.
     *
     * @param text text
     * @return true if text is palindrome
     */
    public static void palindrome(String text) {
        if (text.length() == 0) {
            System.out.println("The text is empty");
        } else {
            int textLastCharIndex = text.length() - 1;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == text.charAt(textLastCharIndex - i)) {
                    System.out.println("The text is palindrome");
                } else {
                    System.out.println("The text is not palindrome");
                }
            }
        }
    }


    public static boolean istPalindrom(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        StringBuilder first = new StringBuilder();
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                break;
            }
            first = first.append(word[i1]);
            ++i1;
            --i2;
        }
        System.out.println("First - " + first);
        System.out.println("Last - " + reverseString(String.valueOf(first)));
        return true;
    }


    /**
     * A palindrome is a word, phrase, number or other sequence of units that has
     * the property of reading the same in either direction
     * like ara , anna, madam, wow, radar, etc
     * <p>
     * //* @param text text
     *
     * @return longist palindrome from text
     */
    public static String findLongestPalindrome(String text) {
        String palindromeString  = "";
        if(text.length()==0){
            return "The text is empty \n";
        }else {
            int textLastCharIndex = text.length()-1;
            for(int i = 0; i <= textLastCharIndex; i++){
                for(int j = textLastCharIndex; j >=0;j--){

                }
                if(text.charAt(i) == text.charAt(textLastCharIndex-i)){
                    palindromeString += text.charAt(i);
                    System.out.println("The text is palindrome");
                    return "";
                }else{
                    break;
                }
            }
        }
        return palindromeString + reverseString(palindromeString);
    }
    private static String reverseString(String str) {
        String string = "";
        int lastCharIndexInString = str.length() - 1;
        for (int i = lastCharIndexInString; i >= 0; i--) {
            string += str.charAt(i);
        }

        return string;
    }

    /**
     * Shift array element left appropriate shiftSize
     * like this we have   [1, 2, 3, 4, 5, 6] end we want to shift 2
     * the result must be  [5, 6, 1, 2, 3, 4]
     *
     * @param a         array
     * @param shiftSize shit size
     * @return array which already shifted
     */
    public static int[] shiftLeft(int a[], int shiftSize) {
        int lenghtOfArray = a.length;
        int[] newArray = new int[lenghtOfArray];
        int j = 0;
        if (lenghtOfArray > 0 && shiftSize < lenghtOfArray) {
            while (j < lenghtOfArray) {
                for (int i = 0; i < lenghtOfArray; i++) {
                    if (i >= lenghtOfArray - shiftSize) {
                        newArray[shiftSize - j - 1] = a[i];
                        j--;
                    } else {
                        newArray[lenghtOfArray - j - 1] = a[lenghtOfArray - shiftSize - j - 1];
                        j++;
                    }

                }
                if (j == 0) {
                    break;
                }
            }
        } else if (lenghtOfArray > 0) {
            System.out.println("Array length is 0");
        } else if (shiftSize < lenghtOfArray) {
            System.out.println("Shift size must be lower than array elements count");
        }

        return newArray;
    }

}