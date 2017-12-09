package homework_21_10_17.homeworkAnna;

public class Rhombe {
    public static void main(String[] args) {
        int count = 5;

        for (int i = 0; i <= 2*count; i++){
            for (int k = 0; k <= 2*count; k++ ){
                if (i < count){
                    if (k < count + i && k > count - i  ) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }else {
                    if (k < count + (2*count - i) && k > count - (2*count - i)){
                        System.out.print("*");
                    } else System.out.print(" ");
                }

            }

            System.out.println(" ");
        }
        for (int i = 0; i <= 2*count; i++){
            for (int k = 0; k <= 2*count; k++ ){
                if (i<count){
                    if (k != count + i && k != count - i ) {

                        System.out.print(" ");
                    } else
                        System.out.print("1");
                }else {
                    if (k != count + (2*count - i) && k != count - (2*count - i) ){
                        System.out.print(" ");
                    } else System.out.print("1");
                }
            }

            System.out.println(" ");
        }



    }

}
