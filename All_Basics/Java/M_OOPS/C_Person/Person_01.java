package Java.M_OOPS.C_Person;

public class Person_01 {
    private String name;
    private int age;
    private char gender;

    public Person_01(String name, int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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
