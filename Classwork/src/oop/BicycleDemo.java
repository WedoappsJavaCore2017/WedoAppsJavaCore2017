package oop;

public class BicycleDemo {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Bicycle secondBicycle = new Bicycle(10);
        Bicycle thirdBicycle = secondBicycle;
        secondBicycle = null;
        System.out.println("This is main method");
        methodFirst();
        bicycle.speedUp(10);
    }

    static void methodFirst(){
        System.out.println("This is first method");
        methodSecond();
    }

    static void methodSecond(){
        System.out.println("This is second method");
    }


    // main{
    //
    //      methodFirst{
    //
    //          methodSecond{
    //
    //          }
    //
    //      }
    //
    // }
}
