package homework_04_11_17.homeworkSeda;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] area = new int[20];
        Random random = new Random();

        for (int i = 0; i < area.length; i++) {
            area[i] = random.nextInt(100);
        }

        for (int i = 0; i < area.length - 1; i++) {
            for (int j = i + 1; j < area.length; j++) {
                if (area[i] > area[j]) {
                    area[i] = area[i] + area[j];
                    area[j] = area[i] - area[j];
                    area[i] = area[i] - area[j];

                }
            }
        }
        for (int k = 0; k < area.length; k++) {
            System.out.print(area[k] + "  ");
        }
        System.out.println();
        System.out.println("min-" + area[0]);
        System.out.println("max-" + area[area.length - 1]);
    }
}
