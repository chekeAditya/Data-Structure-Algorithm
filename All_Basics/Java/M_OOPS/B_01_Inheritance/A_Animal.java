package Java.M_OOPS.B_01_Inheritance;

public class A_Animal {

    public A_Animal() {
        System.out.println("Parent constructor");
    }

    //properties of animal
    private String color;
    private String type;

    //setter method
    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    //getter method
    protected String getColor() { // if i write it as protected then child class can access this
        return color;
    }

    public String getType() {
        return type;
    }
}

/**
 * Inheritance :- you took come features from your dad or from parent
 * Prtected :- subclass can access the feature i.e those features and methods
 */


/*
    *what is the difference between protected and private
 */