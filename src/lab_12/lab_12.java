package src.lab_12;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class lab_12 extends JFrame {
    Shape shape = new Rectangle(20, 30);
    private CustomShape renderShape;


    public lab_12(){
        super("Task_12");
        setSize(1000,1000);
        setLayout(new BorderLayout());
        renderShape.setShape(shape);
    }

    public static void main(String[] args) {
        new lab_12().setVisible(true);
    }
}
