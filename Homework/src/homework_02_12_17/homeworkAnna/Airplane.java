package carsExtend;

public class Airplane extends Vehicle {

    static int DEFAULT_SPEED = 120;
    public int volume;


    public int field;

    public Airplane(String color, int vareliq, int width, int height, int prace, String model,int volume, int speed) {
        super(color, vareliq, width, height, prace, model,speed);
        this.volume = volume;
    }

    public Airplane(String color, int vareliq, int width, int height, int prace, String model, int speed) {
        super(color, vareliq, width, height, prace, model,speed);
    }
}
