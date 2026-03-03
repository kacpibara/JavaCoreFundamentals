package _7;

public class Rectangle implements Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle: " + a + " x " + b;
    }
}
