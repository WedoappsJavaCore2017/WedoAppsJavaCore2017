package homework_21_10_17.homework_Saro;

public class Tnayin4 {
    public static void main(String[] args) {
        for(int a=10; a>0; a-- ){
            for(int b=0;b<a; b++ ){
                System.out.print(' ');
            }
            for(int q=0; q<10-a; q++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
