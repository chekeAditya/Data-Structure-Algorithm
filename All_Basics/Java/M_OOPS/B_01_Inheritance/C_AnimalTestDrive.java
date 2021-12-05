package Java.M_OOPS.B_01_Inheritance;

public class C_AnimalTestDrive {
    public static void main(String[] args) {
        B_Dog dog = new B_Dog("Brown", "Mammels"); //create an object
        dog.setColor("Brown");
        dog.setType("Mammals");
        System.out.println(dog.getColor());
        System.out.println(dog.getType());
        dog.bark();
    }
}
/**
 * Without writing anything inside the Dog class we are able to access all the character's called Inheritance
 * when you create an object of a child class by default parent class is called no matter what.(it will be called)
 * i.e First it will call parent constructor and then child constructor
 *
 */
