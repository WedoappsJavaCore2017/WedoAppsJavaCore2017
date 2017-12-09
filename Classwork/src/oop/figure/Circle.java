package oop.figure;

import java.awt.*;

public class Circle extends Figure {

    private static final int DEFAULT_RADIUS = 10;
    protected int radius;

    public Circle(){
        this(DEFAULT_RADIUS);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(int x, int y, int width, int height, int radius) {
        super(x, y, width, height);
        this.radius = radius;
    }

    @Override
    protected double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw(Graphics graphics) {
        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        graphics.setColor(Color.BLACK);
        graphics.fillOval(getX(), getY(), 2*radius, 2*radius);
    }

    public boolean isBelong(int x, int y){
        return Math.pow(radius, 2) >= Math.pow(x - (this.getX() + radius), 2) + Math.pow(y - (this.getY() + radius), 2);
    }
}
