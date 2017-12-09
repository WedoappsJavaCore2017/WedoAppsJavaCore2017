package homework_14_10_17.homeworkAngela;

/**
 * Created by homeworkAngela on 10/11/2017.
 */
public class Simple {

    public static void main(String[] args) {
        for (double i = 3; i <= 100; i++) {
            boolean parze = true;
            double x = Math.sqrt(i);
            for (double j = 2; j <= x ; ++j) {
                if (i % j == 0) {
                    parze = false;
                    break;
                }
            }
            if (parze){
                System.out.println(i);
            }

        }
    }
}
