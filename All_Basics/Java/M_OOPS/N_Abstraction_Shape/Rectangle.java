package Java.M_OOPS.N_Abstraction_Shape;

public class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of the rectangle is " +area);
    }
}
