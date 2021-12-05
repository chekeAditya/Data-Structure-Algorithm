package Java.M_OOPS.E_Shape;

public class Square extends Shape {
    private int side;
    public Square(int side){
        this.side = side;
    }

    @Override
    public void calculateArea() {
        int area = side * side;
        System.out.println("Area of the square is " + area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 4 * side;
        System.out.println("Perimeter of the square is " + perimeter);
    }
}
