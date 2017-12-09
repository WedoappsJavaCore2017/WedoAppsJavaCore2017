package homework_14_10_17.homeworkGor;

public class Triangle {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i <= 10; i++) {
            for (int b = 10; b > i; b--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println() ;
        }
        System.out.println();

        for(int i = 10; i > 0; i--  ){
            for(int b = 10 ; b > i; b--  ){
                System.out.print("  ");
            }
            for(int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }
}

