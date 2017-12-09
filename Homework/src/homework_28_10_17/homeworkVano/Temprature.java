package homework_28_10_17.homeworkVano;

public class Temprature {
    public static void main(String[] args) {
        float [] days =  {17.5f, 13.5f, 10.2f, 9.4f, 4.5f, 19.4f, 11.5f};
        float sum = 0.0f;
         for (int i = 0; i < days.length; i++ ){
             sum = sum + days[i];
         }
        System.out.println(sum/ days.length);
    }
}
