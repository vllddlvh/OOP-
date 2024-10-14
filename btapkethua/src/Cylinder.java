public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 0;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return PI * this.getRadius() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[Circle[radius=" + this.getRadius() + ", height=" + this.getHeight() + "]]";
    }

    @Override
    public double getArea() {
        return 2 * PI * this.getRadius() * this.getRadius();
    }
}
