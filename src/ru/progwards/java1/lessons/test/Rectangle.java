package ru.progwards.java1.lessons.test;

public class Rectangle {
        private double a;
        private double b;

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double area() {

            return a*b;

        }
        public int compareTo(Rectangle anRectangle) {
            if (this.area() > anRectangle.area())
                return 1;
            if (this.area() == anRectangle.area())
                return 0;
            else
                return -1;
        }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1,3);
        Rectangle r2 = new Rectangle(5,4);
        System.out.println(r1.compareTo(r1));
    }


}
