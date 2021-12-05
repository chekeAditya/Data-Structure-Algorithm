package Java.M_OOPS.B_02_Polymorphism;

public class Animal {
    public Animal() {
//        System.out.println("Parent constructor");
    }

    private String color;
    private String type;

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void speak(){
        System.out.println("Animal Speak");
    }
}

