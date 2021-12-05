package Java.M_OOPS.M_Abstraction_Calculator;

public class CalculatorTestDrive {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int length = calculator.add(1,2);
        double breadth = calculator.add(5.2,2.1f);
        calculator.area(length,breadth);
    }
}
