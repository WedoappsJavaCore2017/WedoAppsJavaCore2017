package homework_14_10_17.homeworkAngela;

/**
 * Created by homeworkAngela on 10/11/2017.
 */
public class Triangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');

            }
            System.out.println();
        }

//        int i = 0;
//        for (int i = 0; i < 10; ++i){
//            System.out.println(++i > 2 ? i + " > 2" : "asdfasdf");
//        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 10; j++) {
                if (j <= 10 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j > 10 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
