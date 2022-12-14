public class Circle implements Ishape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * this.radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }

    public String toString() {
        return "Circle: \nArea = " + this.getArea() + "\nPerimeter = " + getPerimeter();
    }

}
