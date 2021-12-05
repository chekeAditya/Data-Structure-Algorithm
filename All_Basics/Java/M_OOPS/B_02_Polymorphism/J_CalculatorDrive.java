package Java.M_OOPS.B_02_Polymorphism;

public class J_CalculatorDrive {
    public static void main(String[] args) {
        J_Calculator calculator = new J_Calculator();
        int c = calculator.add(2,4);        //static polymorphism
        float d = calculator.add(2.4f,24.5f); //static polymorphism
        System.out.println(c);
        System.out.println(d);
    }
}
