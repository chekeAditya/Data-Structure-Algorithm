package Java.M_OOPS.A_Encapsulation;

public class Person {


    //we can also let thing's be public but we are putting it as private as only you can access it using getters and setters methods
//member variable
    private String name;
    private int age;
    private char gender;


    /**
     * the first option to access the data is via constructor,
     * if in case you do not want constructor then you can use setter methods
     */
////constructor
//    public Person(String name, int age, char gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }


    /**
     *If you make setter and getters as private then you cannot access it coz it has a private access other then this class
     */
//setters method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//here u had created three method which will give the name age and gender this is about the person
//getter method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}

/**
 * Why Encapsulation?
 * Better control of class attributes and methods
 * Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
 * Flexible: the programmer can change one part of the code without affecting other parts
 * Increased security of data
 */
