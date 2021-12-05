package Java.M_OOPS.B_02_Polymorphism;

public class Cat extends Animal{
    @Override
    public void speak() {
//        super.speak();
        System.out.println("Cat says Meow Meow");
    }
}
