package carsExtend;

public class PassengerShip extends Ship {
    public static int DEFAULT_PASSENGERS_COUNT = 5;
    public int pass_count;

    public PassengerShip(String color, int vareliq, int width, int height, int prace, String model, int speed, int pass_count) {
        super(color, vareliq, width, height, prace, model, speed);
        this.pass_count = pass_count;
    }
}
