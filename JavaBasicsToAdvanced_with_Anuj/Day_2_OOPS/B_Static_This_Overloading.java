package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_2_OOPS;

public class B_Static_This_Overloading {
    public static void main(String[] args) {
        System.out.println(Person.count);
        Person p3 = new Person("Aditya", 18); // this line is initializing and also declaring
//        System.out.println(p3.age);
        System.out.println(Person.count);
        System.out.println(p3.name + " " + p3.age);

    }
}

class Person {
    String name;
    int age;

    static int count;

    public Person() {
        this("Aditya", 20);
        count++;
        System.out.println("Person is being created");
    }

    /*public Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }*/

    public Person(String name, int age) {
//        this(); // used to catch the current constructor first
        this.name = name;
        this.age = age;
        walking(this);
    }

    void walking(Person obj) {
        System.out.println(name + " is walking");
        age += 10;
    }
}

/*
 * This is used for referring to the parent
 */