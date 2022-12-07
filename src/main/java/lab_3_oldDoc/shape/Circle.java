package lab_3_oldDoc.shape;
import java.math.*;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this(1,"blue",false);
    }
    public Circle(double radius){
        this(radius,"blue",false);
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
