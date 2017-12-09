package carsExtend;

public class CargoShip extends Ship {
    public static int DEFAULT_VOLUME = 150;

    public CargoShip(String color, int vareliq, int width, int height, int prace, String model, int volume, int speed) {
        super(color, vareliq, width, height, prace, model, volume, speed);
    }
}
