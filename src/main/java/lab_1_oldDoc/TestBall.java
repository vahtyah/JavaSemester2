package lab_1_oldDoc;

import static java.lang.System.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 200);
        Ball b2 = new Ball(300);
        Ball b3 = new Ball();
        b2.setPrice(500);
        out.println(b2);
        b1.profit(6);
        b2.profit(10);
        b3.profit(20);
    }
}

class Ball {
    private String color;
    private int price;

    public Ball(String color, int price){
        this.color = color;
        this.price = price;
    }
    public Ball(int price){
        this("Blue",price);
    }
    public Ball(){
        this("Blue",100);
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getColor(){
        return this.color;
    }
    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void profit(int amount){
        out.println("Profit: " + (this.price * amount));
    }
}
