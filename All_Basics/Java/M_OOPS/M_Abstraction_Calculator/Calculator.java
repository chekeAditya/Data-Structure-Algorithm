package Java.M_OOPS.M_Abstraction_Calculator;

public  class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, float b) {
        return a + b;
    }

    public void area(int length, double breath) {
        double area = length * breath;
        System.out.println("Are of the rectangle is " + area);
    }

}
