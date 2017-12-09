package homework_28_10_17.homeworkGor;

import javax.print.DocFlavor;

public class NumbersArray {

    static double one_funt = 405.9;
    public static void main(String[] args) {
//        int rectArea =

        System.out.println(calculateRectangleArea(0, 5));
    }

    public static int calculateRectangleArea(int length, int width){
        if(length <= 0 || width <= 0){
            System.out.println("Rectangle length or width is <= 0");
            return 0;
        }
        return length * width;
    }

    public static String circleArea(int radius){
        return "yerkarutyun - " + 10 + " makeres - " + 80;
    }



}
