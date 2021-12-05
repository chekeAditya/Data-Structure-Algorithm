package Java.M_OOPS.B_03_Abstraction;

public class Cat extends Animal{
    @Override
    public void speak() {
//        super.speak();
        System.out.println("Meow Meow");
    }

//    @Override
//    public boolean areDogsLoyal() {
//        return super.areDogsLoyal();
//    } //not necessary as dog's are loyal then why should u need to write that inside the cat class
}
