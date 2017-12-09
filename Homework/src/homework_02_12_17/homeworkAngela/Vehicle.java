package homework_02_12_17.homeworkAngela;


public class Vehicle{
    String country;
    int speed;
    int countOfSeeting;
    String mark;
    String color;

  };
    class Car extends Vehicle{


    };
    class Ship extends Vehicle{

    };
    class Airplane extends Vehicle{

    };
    class Truck extends Car{

    };
    class CargoShip extends Ship{};
    class CargoPlane extends Airplane{};
    class PassengerCar extends Car{
      String sedanOrJeep;
    };
    class PassengerShip extends Ship{};
    class PassengerPlane extends Airplane{};
    class Mercedes extends Car{};
    class MercedesE320 extends  PassengerCar{};
    class Bmw extends Car{};
    class BmwX5 extends PassengerCar{};





