package Java.M_OOPS.B_02_Polymorphism;

public class J_Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    //second function
    public float add(float a, float b) {
        return a + b;
    } //also called as methods overloading
}
/*
    *now how does our compiler identify this is know as static Polymorphism or compile time polymorphism
    *is it identity the type of number which they are according to that it will call
    * You can not have two parameter and same return type
 */
