package Java.M_OOPS.B_03_Abstraction;

public class AbstractionTesstDirve {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.speak();
        dog.category();
//        dog.areDogsLoyal();  //we cannot write it like this as it will check firsly if it's present in dog then animal , as it's not present in the animal so it will fails to explain
        Dog dog1 = new Dog();
        dog1.areDogsLoyal();


        Animal cat = new Cat();
        cat.speak();
    }

}
/*
 *You hide the implementation details from the user called abstraction
 */
/**
 * can you create an object of an abstract class:- No you cannot create object class directly
 * if you want which are not for all the classes but applicable for few class then write an interface
 */