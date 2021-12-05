package Java.M_OOPS.B_02_Polymorphism;

public class AnimalDrive {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setColor("Brown");
//        dog.setType("Mammals");
//        System.out.println(dog.getColor());
//        System.out.println(dog.getType());
//        dog.speak();

        Cat cat = new Cat();
        cat.speak();

        //
        Animal dog = new Dog(); // when you can parent class == new class it's fine but u can't say it's reverse
        dog.speak();
    }
}

/**
 * There is only one class,one method taking different forms at different places
 * Like one method taking multiple forms
 * There are two types of polymorphism i.e Static polymorphism(compile time polymorphism)  or dynamic polymorphism
 */
