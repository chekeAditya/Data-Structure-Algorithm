package Java.E_ConditionalOperator;

public class NumberSandwich {
    public static void main(String[] args) {
        int myNum = 15   ;
        if (myNum >= 6 && myNum<=10)
            System.out.println("The number is between 6 and 10");
        if (myNum > 5)
            System.out.println("The number is greater than 5");
        if (myNum <= 12)
            System.out.println("The number is less than or equal to 12");
        if (myNum % 7 == 0)
            System.out.println("The number is divisible by 7");

    }
}
