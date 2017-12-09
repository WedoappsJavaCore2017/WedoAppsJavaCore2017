package oop.figure;

import java.awt.*;
import java.util.Collection;
import java.util.Random;

public class Rectangle extends Figure {

    static final int DEFAULT_COLOR = 10;
    int color;

    Rectangle(){
        this(DEFAULT_COLOR);
    }

    public Rectangle(int color) {
        this(DEFAULT_X, DEFAULT_Y, color);
    }

    public Rectangle(int x, int y, int color) {
        this(x, y, DEFAULT_WIDTH, DEFAULT_HEIGHT, color);
    }

    public Rectangle(int x, int y, int width, int height, int color) {
        super(x, y, width, height);
        this.color = color;
    }


    @Override
    protected double area() {
        return 0;
    }

    @Override
    protected void draw(Graphics graphics) {
//        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
//        graphics.setColor(color);
//        graphics.fillRect(x, y, width, height);
    }
}
