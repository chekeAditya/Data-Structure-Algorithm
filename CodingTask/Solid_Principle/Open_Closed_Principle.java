package Basic_To_Advanced_DataStructure.CodingTask.Solid_Principle;

public class Open_Closed_Principle {
}
/**
 * Before Using this Principle
 *
class Triangle {
    public double base;
    public double height;
}

class Square {
    public double side;
}

public class AreaCalculate {
    public double getTriangleArea(Triangle triangle) {
        return area = (triangle.base * triangle.height) / 2;
    }

    public double getSquareArea(Square square) {
        return square.side * square.side;
    }
}*/


/**
 * After using this principle
 *
interface Shape{
    public double getArea();
}

class Triangle implements Shape{

    double base;
    double height;
    public double getArea(){
        return (base * height)/2;
    }

}
class Square implements Shape{
    public double side;
    public double getArea(){
        return side * side;
    }
}

class AreaCalculate{
    public double getShapeArea(Shape shape){
        return shape.getArea();
    }
}
 */