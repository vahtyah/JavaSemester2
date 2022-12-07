public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.2,2.5);
        Ball b2 = new Ball();
        b1.setXY(4.5,10.5);
        System.out.println(b1);
        b2.move(5,6.1);
        System.out.println(b2);
    }
}
