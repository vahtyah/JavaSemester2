package lab_3_oldDoc.shape;

public class Square extends Rectangle{
    protected double side;

    public Square(){
        this(1.0,"blue",false);
    }
    public Square(double side){
        this(side,"blue",false);
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return this.side * this.side;
    }
    @Override
    public double getPerimeter() {
        return this.side * 4;
    }
    @Override
    public String toString() {
        return "Shape: Square, side: " + this.side + ", color: "+this.color;
    }
}
