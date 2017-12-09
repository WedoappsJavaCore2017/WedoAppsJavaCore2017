package primitiveTypes;

public class ParzTver {

    public static void main(String[] args) {

        for (int i = 0; i <= 30; i++) {
            if (i < 2) {
                System.out.println("0 kam 1 chi handisanum parz tiv");
            } else if (i == 2) {
                System.out.println(" 2 handisanum e arajin parz tiv@");
            } else {
                boolean isPrime = true;
                double top = Math.sqrt(i);
                for (int j = 2; j <= top; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime) {
                    System.out.println("Parz tiv - " + i);
                } else {
                    System.out.println("Voch parz tiv - " + i);
                }
//                System.out.println("Parz tiv - " + i);
            }
        }

    }

}
