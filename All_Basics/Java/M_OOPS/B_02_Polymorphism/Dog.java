package Java.M_OOPS.B_02_Polymorphism;

public class Dog extends Animal {
    public Dog() {
//        System.out.println("Child class constructor");
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }


    @Override
    public void setType(String type) {
        super.setType(type);
    }

    public void bark() {
        System.out.println("Bow Bow");
    }

    @Override
    public void speak() {
//        super.speak();
        System.out.println("Dog barks as Bow bow");
    }
}

