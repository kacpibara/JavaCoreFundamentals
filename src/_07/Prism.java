package _07;

public class Prism {
    private Shape base; // polimorphism
    double height;

    public Prism(Shape base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString()
    {
        return "Prism Area: " + base.getArea() + " height: " + height;
    }
}
