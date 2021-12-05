package Java.M_OOPS.P_Abstraction_Calculator;

public class CalculateTestDrive {
    public static void main(String[] args) {
        Calculator square = new SquareClass();
        square.calculate(2);

        Calculator cube = new CubeClass();
        cube.calculate(2);

        Calculator sqRoot = new SquareRootClass();
        sqRoot.calculate(4);
    }
}
