package homework_14_10_17.homeworkAnna;

public class SimpleNumbers {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            boolean isPrime = true;
            if (i == 0 || i == 1) {
                System.out.println(i + " isn't simple");
            } else {
                for ( int k = 2; k <= Math.sqrt(i); k++){
                    if (i % k == 0) {
                        isPrime = false;

                    }
                }
                if (isPrime) {
                    System.out.println(i + " is simple" );
                } else {
                    System.out.println(i + " isn't simple" );
                }
            }
        }

    }
}
