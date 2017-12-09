package homework_28_10_17.homeworkGor;

public class ArrayTest {
    public static void main(String[] args) {

        float[] arrayWeek = {
                17.8f, 18.4f, 19.9f, 18.7f, 16.2f, 15.1f, 16.3f
        };
        float nearTemperature = 0;

        for (int i = 0; i < arrayWeek.length; i++) {
            System.out.println(arrayWeek[i]);
            nearTemperature += arrayWeek[i];

        }
        nearTemperature = nearTemperature / arrayWeek.length;
        System.out.println("Week near temperature --" + nearTemperature);
    }
}
