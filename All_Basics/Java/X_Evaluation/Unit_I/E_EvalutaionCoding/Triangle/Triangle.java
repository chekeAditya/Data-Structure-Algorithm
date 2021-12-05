package Java.X_Evaluation.Unit_I.E_EvalutaionCoding.Triangle;

public class Triangle {
    int Side;
    int Side2;
    int Base;

    public Triangle(int side, int side2, int base) {
        Side = side;
        Side2 = side2;
        Base = base;
    }

    public void calculatePerimeter(int side,int side2,int base) {
        int Perimeter = side + side2 + base;
        System.out.println(Perimeter);
    }
}
