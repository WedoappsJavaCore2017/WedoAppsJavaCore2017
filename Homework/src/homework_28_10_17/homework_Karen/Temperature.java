package homework_28_10_17.homework_Karen;

public class Temperature {
    public static void main(String[] args) {
        String[] weekDays = {"Երկուշաբթի", "Երեքշաբթր", "Չորեքշաբթի", "Հինգշաբթի", "Ուրբաթ", "Շաբաթ", "Կիրակի"};
        float[] temperatureOfWeekDays = {17.8F, 18.4F, 19.9F, 18.7F, 16.2F, 15.1F, 16.3F};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.print(weekDays[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < temperatureOfWeekDays.length; i++) {
            System.out.print(temperatureOfWeekDays[i] + "      ");
        }

        System.out.println();

        float averageTemperature = 0;
        for (int i = 0; i < temperatureOfWeekDays.length; i++) {
            averageTemperature += temperatureOfWeekDays[i];
        }

        System.out.print("The WeekDays Average Temperature " + averageTemperature / temperatureOfWeekDays.length);
    }
}
