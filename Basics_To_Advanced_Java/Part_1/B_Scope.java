package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_1;

public class B_Scope {
    public static void main(String[] args) {
        /*
         * It means where we can access our variables
         * We can only access the variable inside the same function only
         */
        int a = 10;
        int b = 20;
        String name = "Aditya";
        /** Block Scope -> Value init in this block will remain in this block only
         *  Already initialised outside the block in the same method, can be changed but cannot be reinitialized again
         */
        {
            name = "Aditya Cheke"; //changing name inside the block
//            int a = 90; //It will throw an error as it's been already assigned
            a = 90; //we can change its value as we are changing the original one
            int c = 5;

            //scoping in for loops
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
//        System.out.println(c); //we can't print as if we created something of specifically for that block then it will only be valid till that block
//        System.out.println(i); // we cannot initialized here
        System.out.println(name);
    }

    static void random() {
        int num = 67;
        System.out.println(num);
    }
}
/** IMP
 * Anything initialized in a method can not be reinitialized inside the block but can be change its value
 * Anything initialized in a block can not be accessible outside the block but can be reinitialised outside the block
 */
