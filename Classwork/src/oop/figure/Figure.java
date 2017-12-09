package oop.figure;

import java.awt.*;
import java.util.Random;

public abstract class Figure {

    static final int DEFAULT_Y = 1;
    static final int DEFAULT_WIDTH = 10;
    static final int DEFAULT_X = 1;
    static final int DEFAULT_HEIGHT = 5;

    private int x;
    private int y;
    private int width;
    private int height;
    protected Random random;

    Figure() {
        this(DEFAULT_X, DEFAULT_Y);
    }

    public Figure(int x, int y) {
        this(x, y, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public Figure(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        random = new Random();
    }

    protected abstract double area();

    protected abstract void draw(Graphics graphics);


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
