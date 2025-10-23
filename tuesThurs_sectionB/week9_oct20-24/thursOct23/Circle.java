public class Circle {
    //fields
    private double radius;

    public static final double PI = 3.14;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;      
    }

    public double getRadius() {
        return radius;
    }

    //operations (circumference, area)

    public double circumference() {
        return 2*PI*radius;
    }

    public double area() {
        return PI*radius*radius;
    }

    public String toString() {
        return String.format("Radius %.2f, area %.2f", radius, area());
    }
}