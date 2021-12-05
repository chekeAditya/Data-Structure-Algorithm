package Java.K_ObjectsAndConstructor;

public class E_Square {

    int side;

    public E_Square(int side) {
        this.side = side;
    }

    public static void main(String[] args) {
        E_Square square = new E_Square(5);
        square.calculatePerimeter();
        square.calculateArea();
    }

    public void calculateArea() {
        int area = side * side;
        System.out.println("Area of the square is " + area);
    }

    public void calculatePerimeter() {
        int perimeter = 4 * side;
        System.out.println("Perimeter of the square is " + perimeter);
    }

}
