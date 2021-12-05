package Java.M_OOPS.P_Abstraction_Calculator;

public class SquareRootClass extends Calculator {

    double x;

    @Override
    public void calculate(double x) {
        double sqRoot = Math.sqrt(x);
        System.out.println("Square root of " + x + " is " + sqRoot);
    }
}
