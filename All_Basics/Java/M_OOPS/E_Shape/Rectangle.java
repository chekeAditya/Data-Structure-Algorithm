package Java.M_OOPS.E_Shape;

public class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of the rectangle is " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 2 * length + 2 * breadth;
        System.out.println("Perimeter of the rectangle is " + perimeter);
    }
}
