package Java.M_OOPS.P_Abstraction_Calculator;

public class SquareClass extends Calculator {
    double x;

    @Override
    public void calculate(double x) {

        double square = x * x;
        System.out.println("Square of " + x + " is " + square);

    }
}
