package Java.M_OOPS.B_03_Abstraction;

public abstract class Animal{

    //if you don't know what to write inside a function then at that time create an abstract method

//    public void speak() { //it's a method
//        //don't know what is the implementation
//    }

    //here u are skipping the body
    public abstract void speak(); //if you had to make abstract method then you had to write an abstract class

    //    can a abstract class have method with had a body :- Yes ( you can have non abstract method inside a abstract class
    public void category() {
        System.out.println("Mammals");
    }
}
