package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_1;

public class C_Shadowing {

    /**
     * Shadowing is basically a practice of using 2 variable with the same name within the scope that overlaps
     */
    static int x = 100; // this scope will be available to everything that is inside the block and this will br shadowed by line 8

    public static void main(String[] args) {
        System.out.println(x); //90
        int x;
//        System.out.println(x); //scope will begin when value is initialised
        x = 40; //class variable at line 4 is showed by this
        System.out.println(x); //40
        fun();
    }

    static void fun() {
        System.out.println(x); //it will not give any error
    }
}
