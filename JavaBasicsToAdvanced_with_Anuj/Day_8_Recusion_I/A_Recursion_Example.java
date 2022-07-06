package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_8_Recusion_I;

public class A_Recursion_Example {
    public static void main(String[] args) {
        dummyFunction();
    }


    static int i = 0;
    private static void dummyFunction() {
        System.out.println(i++);
        dummyFunction(); //when a function called itself it's called recursion
    }
}
