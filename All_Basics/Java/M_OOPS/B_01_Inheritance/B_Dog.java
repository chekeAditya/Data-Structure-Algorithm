package Java.M_OOPS.B_01_Inheritance;

//it mean you are inheriting all the properties and behaviour form that class
public class B_Dog extends A_Animal { //animal is the parent class n dog is a child class


    public B_Dog(String color, String type) {
       // super();            //if you do not write it will work fine but if you write it write it first
        System.out.println("Child class constructor"); //you are calling the constructor and it's bee called
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }


    @Override
    public void setType(String type) {
        super.setType(type);            //whenever their is a super it will represent to a parent class, it's not necessary to call super
    }

    //this method we do not provide in the Animal class it's specially for this only
    public void bark(){
        System.out.println("Bow Bow");
    }
}

/**
 * Whenever you extends one class with the another class then
    you will get all the public variable present inside that class
 * If i remove all this then still it has all these function
 * In a constructor super will be the first keyword if you write it after it will through an error coz first parent should ba called then child
 * Whereas super can be present anywhere in the method
 */
