public class Rectangle implements Ishape {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {

    }

    public Rectangle(double lenght, double width) {
        this.length = lenght;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public String toString() {
        return "Rectangle: \nArea = " + this.getArea() + "\nPerimeter = " + this.getPerimeter();
    }
}
