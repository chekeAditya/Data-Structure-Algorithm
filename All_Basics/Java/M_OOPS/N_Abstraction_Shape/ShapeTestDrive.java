package Java.M_OOPS.N_Abstraction_Shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square(4);
        square.calculateArea();

        Rectangle rectangle = new Rectangle(4,6);
        rectangle.calculateArea();
    }
}
