package homework_14_10_17.homeworkKaren;

public class SimpleNumbers {
    public static void main(String[] args) {
    simple(100);
    }

    public static void simple (int number) {
        if (number < 2) {
            System.out.println("0 kam 1 voch parz en voch baxadryal");
        } else {
            for (int i = 2; i < number; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println("Parz e " + i);
                } else {
                    System.out.println("Baxadryal e " + i);
                }
            }
        }
    }
}
