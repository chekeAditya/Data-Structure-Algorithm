package Java.M_OOPS.B_01_Inheritance;

public class D_KFC {
//haven't write final
//    public void recipe(){
//        System.out.println("KFC recipe");
//    }


    public final int value = 1; //assign value as 1 in final
//if we donot want to overwrite this method
    public final void recipe(){

        //value = 2;    //not able to access it later
        System.out.println("KFC recipe");
    }
}
/**
 * If u something final that means you cannot overwrite it
 * IF you make class itself as final then no-one can extends it
 * or it means you are not allowing anyone to change anything or extends it (it's called as immutable class)

 * Final means you can assign it only once and you cannot assign it later
 * If class is final then we cannot extend it
 */