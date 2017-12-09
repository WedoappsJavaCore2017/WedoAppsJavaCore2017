package homework_02_12_17.homewrokGor;

public class Airplane extends Vehicle {

    public Airplane(String type, String colors, int tankFly, double dimensions) {
        super(type, colors, tankFly, dimensions);
    }

    public String transporting(){
        return "";
    }
    public String WideBodyAirliners(){
        return "";
    }

    @Override
    public String colors() {
        return super.colors();
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
}
