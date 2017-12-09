package homework_21_10_17.homework_Saro;

public class Tnayin3 {
    public static void main(String[] args) {
        for(int a=1; a<=10; a++ ){
            for(int b=0; b<a; b++) {
                System.out.print(" ");
            }
            for (int j=0; j<10-a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
