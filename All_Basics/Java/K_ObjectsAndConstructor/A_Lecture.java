package Java.K_ObjectsAndConstructor;

public class A_Lecture {
    // these all are the member variable or class variable and these have some default variable
    String name;        //default value:- null
    int speed = 100;    //default value:- 100
    int gears;          //default value:- 0
    String color;       //default value:- null
    Boolean bool;       //default value:- false

//    constructor , if you haven't write this then it had a inbuild constructor
    public A_Lecture(){
        System.out.println("Constructor is called");
    }

    //Main function
    public static void main(String[] args) {
        A_Lecture passionPro = new A_Lecture(); //here created an object
        passionPro.name = "Passion Pro";
//        passionPro.speed ; //if we didn't assign any value to it then it will take input from the default one which is 100
//        passionPro.gears = 4;
//        passionPro.color = "Blue";

//  if we didn't assign any value it will throw an error java: variable a might not have been initialized as we didn't initialzed any value to it
//        int a;
//        System.out.println(a);
        passionPro.sound(passionPro.name);
        System.out.println("Name is :" + passionPro.name);
        System.out.println("Speed is :" + passionPro.speed);
//  here we didn't assign any value then it's default value will be printed
        System.out.println("Gears is :" + passionPro.gears);
        System.out.println("Color is :" + passionPro.color);

        A_Lecture royalEnfield = new A_Lecture(); //here created an object
        royalEnfield.name = "Royal Enfield Stealth Black ";
        royalEnfield.speed = 200;
        royalEnfield.gears = 5;
        royalEnfield.color = "Black";
        royalEnfield.sound(royalEnfield.name);
        System.out.println("Name is :" + royalEnfield.name);
        System.out.println("Speed is :" + royalEnfield.speed);
        System.out.println("Gears is :" + royalEnfield.gears);
        System.out.println("Color is :" + royalEnfield.color);
    }

//this behaviour belongs to the member variable class and these are methods
    public void sound(String name){
        if (name.equals("Royal Enfield Stealth Black"))
            System.out.println("Make's more sound");
        else if (name.equals("Passion Pro"))
            System.out.println("Make's less sound");
    }
}

/*

String s = new String("Aditya"); //object will be created on heap memory
String s = "Aditya";             //string pool (pool is the collection of many string)
 */
