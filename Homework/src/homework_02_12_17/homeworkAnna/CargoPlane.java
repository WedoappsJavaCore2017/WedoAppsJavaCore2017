package carsExtend;

public class CargoPlane extends Airplane {
    public static int DEFAULT_VOLUME = 150;

    public CargoPlane(String color, int vareliq, int width, int height, int prace, String model, int volume, int speed) {
        super(color, vareliq, width, height, prace, model, volume, speed);
    }
}
