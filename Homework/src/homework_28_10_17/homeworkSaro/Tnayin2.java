package homework_28_10_17.homeworkSaro;

public class Tnayin2 {
    public static void main(String[] args) {
        bun(5);
        volume(5);
        konus(5,7);
     }
     public static void bun (double r){
         System.out.println(Math.PI * 4 * Math.pow(r,2));
     }

    public static void volume (double r){
        System.out.println(Math.PI * 3/4 * Math.pow(r, 3));
    }

    public static void konus(int r, int h){
        double konusMakeres =  Math.PI* Math.pow(r,2) * h /3;
        System.out.printf("%.1f",konusMakeres);
    }
}
