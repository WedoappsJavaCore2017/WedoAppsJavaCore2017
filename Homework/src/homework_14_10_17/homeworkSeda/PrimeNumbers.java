package homework_14_10_17.homeworkSeda;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num;
        for (int i = 2; i <= 100; i++) {
            boolean numPrime = true;
            num = i;
            for (int j = 2; j < i; j++) {
                if (num % j == 0) {
                    numPrime = false;
                    break;
                }
            }
            if (numPrime) {
                System.out.print(num + ", ");
            }
        }
    }
}

