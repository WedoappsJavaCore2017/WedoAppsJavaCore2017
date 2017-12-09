package stack;


import oop.figure.Circle;
import oop.figure.Figure;
import triangles.A;

import java.awt.*;
import java.util.List;

public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

    /**
     * Data storage to store the Stack's values
     */
    private Circle[] storage;

    /**
     * Index of the last element in the Stack.
     * Initial value must be -1.
     * This is not a length of data storage.
     * It must be increased when new element is added in to StackImpl
     * and decreased on pop action
     */
    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        storage = new Circle[capacity];
        tos = -1;
    }


    public void push(Circle object) {
        if (tos == storage.length - 1){
            extentStorage();
        }
        storage[++tos] = object;
    }

    public Figure pop() {
        if(tos < 0){
            return null;
        }
        return storage[tos--];
    }

    private void extentStorage() {
        Circle[] figures = new Circle[storage.length * 3 / 2];
        for (int i = 0; i < storage.length; i++) {
            figures[i] = storage[i];
        }
        storage = figures;
    }

    public void printSackElements(Graphics g){
        if(storage.length < 1) return;
        for (int i = 0; i < storage.length; i++) {
            storage[i].draw(g);
        }
    }
}