package homework_28_10_17.homework_Karen;

public class IntervalNumbers {
    public static void main(String[] args) {
        float [] numbersArray = new float[10];
        for (int i = 1; i < numbersArray.length; i++) {
            numbersArray[i] = (float) (i * 0.1);
            System.out.printf("%.2f",numbersArray[i]);
            System.out.println();
        }
    }
}
