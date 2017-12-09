package oop.figure;

import stack.Stack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MFrame extends JFrame implements MouseListener {

    Circle circle = new Circle(100, 100, 300);
    Stack circles;
    boolean repaintAll = true;

    public MFrame() throws HeadlessException {
        circles = new Stack();
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        if (repaintAll) {
            repaintAll = false;
            g.setColor(Color.RED);
            g.fillOval(circle.getX(), circle.getY(), 2 * circle.radius, 2 * circle.radius);
        }
        circles.printSackElements(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (circle.isBelong(e.getX(), e.getY())) {
            circles.push(new Circle(e.getX(), e.getY(), 10));
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
