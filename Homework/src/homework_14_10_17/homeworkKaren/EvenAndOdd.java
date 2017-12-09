package homework_14_10_17.homeworkKaren;

public class EvenAndOdd {

    public static void main(String[] args) {

     odd(100);
        System.out.println("");
     even(100);
    }

    public static void odd (int number) {
        for (int i = 1; i < number; i++) {
            if (i % 2 != 0) {
                System.out.println("this number is Odd " + i);
            }
        }
    }

    public static void even (int number) {
        for (int i = 2; i < number; i++) {
            if (i % 2 == 0){
                System.out.println("this number is Even " + i);
            }
        }
    }
}
