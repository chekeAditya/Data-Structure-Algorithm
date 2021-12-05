package Java.M_OOPS.A_Encapsulation;

/**
 * Java Encapsulation:
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    declare class variables/attributes as private provide public get and set methods to access and update the value of a private variable.
 */


public class PerssonTestDrive {
    public static void main(String[] args) {
//        Person person = new Person("Aditya",19,'M');  //creating the object of person raj and passing all the parameter's (using constructor)
        Person person = new Person();                   //(using getters) :- here if run it will get default value's
        /**
         * if you don't use constructor then you had to set the data first
            then you had to access it by using getter method
         */
        person.setName("Aditya");
        person.setAge(32);
        person.setGender('M');
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
    }
}
/**
    * These are also called as Access Modifiers or Visiblity modifiers
    *It's not necessary true that execution should start's from main function, we can write a independent class without
      mani function and we can call it inside the main function, which is written in some other class
    *Capusule:- it's a eatable tablet, their is some outer covering which protect inner medicine, capsule basically hides
                the medicine from user or patient
 */



/*
Question's
    *While printing said sout(person.name); && sout(person.getName()); which give same o/p then what's the difference
        --> if that will be private then only you can access it and if it will be public then anyone can access it
 */