package Java.M_OOPS.B_03_Abstraction;

public class Dog extends Animal implements DogFeature{
//if you declare it with abstract then you do not had to overwrite it if you don't want to make it abstract then made a method abstract

    @Override
    public void speak() {
        System.out.println("Bow bow");
    }
//    @Override
//    public void speak() {
////        super.speak();
//        System.out.println("Bow Bow");
//    }


    @Override
    public boolean areDogsLoyal() {
        System.out.println("Yes dogs are lion");
        return true;
    }
}
