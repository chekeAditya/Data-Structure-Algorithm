package Java.M_OOPS.E_Shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Square square = new Square(4);
        square.calculateArea();
        square.calculatePerimeter();

    }
}
