package homework_28_10_17.homework_Aram;

public class WeaTher {
    public static void main(String[] args) {
        float[] Temperature = new float[]{17.8f,18.4f,19.9f,18.7f,16.2f,15.1f,16.3f,
        };
        float ded = 0;
        for (int i = 0; i < Temperature.length; i++) {
            ded +=  Temperature[i];
        }
        ded = ded / Temperature.length;
        System.out.println("week temperature is - " + ded);
    }
}
