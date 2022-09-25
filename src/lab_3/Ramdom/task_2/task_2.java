package src.lab_3.task_2;

import java.util.ArrayList;
import java.util.Random;

public class task_2 {
    public static class Point{
        private int x;
        private int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static class Circle{
        private Point center;
        private int radius;
        private double perimeter;
        public Circle(int x, int y){
            this.center = new Point(x,y);
            this.radius = (int)(Math.random()*10) + 1;
            this.perimeter = this.radius * 2 * Math.PI;
        }
        public double getPerimeter(){
            return this.perimeter;
        }
        @Override
        public String toString() {
            return "Circle{" +
                    "center=" + center +
                    ", radius=" + radius +
                    ", perimeter=" + perimeter +
                    '}';
        }
    }
    public static class Tester{
        private Circle[] circles;
        private int n;
        public Tester(int n){
            this.n = n;
            this.circles = new Circle[n];
        }
        public void Add(){
            for (int i = 0; i < this.n; i++)
                this.circles[i] = new Circle((int)(Math.random()*10),(int)(Math.random()*10));
        }
        public Circle SearchBiggest(){
            Circle maxPerimeter = this.circles[0];
            for (int i = 1; i < this.n; i++)
                if(this.circles[i].getPerimeter() > maxPerimeter.getPerimeter())
                    maxPerimeter = this.circles[i];
            return maxPerimeter;
        }
        public Circle SearchSmallest(){
            Circle minPerimeter = this.circles[0];
            for (int i = 1; i < this.n; i++)
                if(this.circles[i].getPerimeter() < minPerimeter.getPerimeter())
                    minPerimeter = this.circles[i];
            return minPerimeter;
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(10);
        tester.Add();
        System.out.println("The circle with the biggest radius: " + tester.SearchBiggest());
        System.out.println("The circle with the smallest radius: " + tester.SearchSmallest());
    }
}
