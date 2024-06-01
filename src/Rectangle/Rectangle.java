package Rectangle;

public class Rectangle {
    double length;
    double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void getLength() {
        System.out.println("Length is: " + this.length);
    }

    public void getWidth() {
        System.out.println("Width is: " + this.width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public double calculatePerimeter() {
        return (this.length + this.width) * 2;
    }

}
