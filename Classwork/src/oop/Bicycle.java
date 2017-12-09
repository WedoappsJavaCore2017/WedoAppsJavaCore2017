package oop;

public class Bicycle {

    static String factoryName ;

    final int MAX_WHEEL_COUNT = 3;
    final int MIN_WHEEL_COUNT = 1;

    byte wheelCount;
    int speed;
    Wheel[] wheels;

    Bicycle() {

    }

    Bicycle(int speed) {
        this.speed = speed;
    }

    Bicycle(int speed, byte wheelCount) {
        this.speed = speed;
    }

    static void myStaticMethod(){
        factoryName = "";
    }

    void speedUp(int point) {
        speed += point;
    }

    void speedDown(int point) {
        speed -= point;
    }

    void setWheelCount(byte count) {
        if (count > MAX_WHEEL_COUNT || count < MIN_WHEEL_COUNT) {
            System.out.println("Invalid value");
            return;
        }
        wheelCount = count;
    }

    void makeWheels() {
        if (wheelCount == 0) {
            System.out.println("Wheel count is 0");
            return;
        }
        wheels = new Wheel[wheelCount];
        for (int i = 0; i < wheelCount; i++) {
            wheels[i] = new Wheel();
        }
    }
}
