package homework_28_10_17.homeworkSeda;

public class Task1 {
    public static void main(String[] args) {
        double num=0;
        double [] array=new double[11];
        for (int i = 0; i <array.length; i++) {
            array[i]=num;
            num=(double) num+0.1;
        }
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
