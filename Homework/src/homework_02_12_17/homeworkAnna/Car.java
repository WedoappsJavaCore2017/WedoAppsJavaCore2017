package carsExtend;

public class Car extends Vehicle {

    private static int DEFAULT_SPEED = 120;
    public int volume;

    public Car(String color, int vareliq, int width, int height, int prace, String model, int speed) {
        super(color, vareliq, width, height, prace, model,speed);
    }
    public Car(String color, int vareliq, int width, int height, int prace, String model,int volume, int speed) {
        super(color, vareliq, width, height, prace, model,speed);
        this.volume = volume;
    }


    public void Drive(){

    }
}
