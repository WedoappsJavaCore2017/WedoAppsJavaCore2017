package carsExtend;

public class Ship extends Vehicle {
    private static int DEFAULT_SPEED = 100;
    public int volume;

    public Ship(String color, int vareliq, int width, int height, int prace, String model, int speed) {
        super(color, vareliq, width, height, prace, model,speed);
    }
    public Ship(String color, int vareliq, int width, int height, int prace, String model,int volume, int speed) {
        super(color, vareliq, width, height, prace, model,speed);
        this.volume = volume;
    }
}
