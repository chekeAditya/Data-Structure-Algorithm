package Java.M_OOPS.N_Abstraction_Shape;

public  class Square extends Shape{

    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        int area = side * side;
        System.out.println("Area of the square is "+ area);
    }
}
