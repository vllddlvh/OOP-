public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14159265358979323846;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
