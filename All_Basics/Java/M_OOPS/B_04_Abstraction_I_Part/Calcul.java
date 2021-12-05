package Java.M_OOPS.B_04_Abstraction_I_Part;

public class Calcul {
    public int add(int a, int b) {
        return a + b;
    }

    //static polymorphism or compile time polymorphism
    public int add(int a, int b, int c) {   //method name is same but parameter are different
        return a + b + c;
    }
//function overloading or method overloading are sam

}
