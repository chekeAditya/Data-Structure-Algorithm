package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_2_OOPS;

public class A_Class {
    public static void main(String[] args) {
        Animal a1 = new Animal(); //object creation
        Animal a2 = new Animal(); //object creation

        a1.name = "Lion";
        a1.legs = 4;
        a2.name = "Kangaroo";
        a2.legs = 2;

        System.out.println(a1.name + " " + a1.legs);
        a1.walk();
        System.out.println();
        a2.walk(4);
    }
}

class Animal {
    //properties
    int legs;
    String name;

    //method overloading
    void walk() {
        System.out.println(name + " is walking");
    }

    void walk(int steps) {
        System.out.println("Animal Walked " + steps + " steps");
    }

    //Default Constructor
    public Animal(){
        System.out.println("calling the constructor");
    }
}