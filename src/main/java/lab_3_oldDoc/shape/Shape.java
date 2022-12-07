package lab_3_oldDoc.shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){}
    public Shape(String color, boolean filler){
        this.color = color;
        this.filled = filler;
    }
    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFiller(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filler=" + filled +
                '}';
    }
}
