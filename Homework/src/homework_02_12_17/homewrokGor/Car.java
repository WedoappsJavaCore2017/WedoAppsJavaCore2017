package homework_02_12_17.homewrokGor;

public class Car extends Vehicle{


    public Car(String type, String colors, int tankFly, double dimensions) {
        super(type, colors, tankFly, dimensions);
    }

    public int speed(){
        return 0;
    }
    public String colors(){
        return "";
    }
    public int wheels(){
        return 0;
    }

    @Override
    public int tank() {
        return super.tank();
    }

    @Override
    public String type() {
        return super.type();
    }

    @Override
    public String means() {
        return super.means();
    }

    public String door(){
        return "";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
