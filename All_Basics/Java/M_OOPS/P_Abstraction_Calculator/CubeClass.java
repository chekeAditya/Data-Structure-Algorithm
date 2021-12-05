package Java.M_OOPS.P_Abstraction_Calculator;

public class CubeClass extends Calculator {

    double x;

    @Override
    public void calculate(double x) {
        double cube = x * x * x;
        System.out.println("Square root of " + x + " is " + cube);
    }
}
