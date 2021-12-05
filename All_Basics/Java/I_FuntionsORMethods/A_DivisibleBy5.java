package Java.I_FuntionsORMethods;

public class A_DivisibleBy5 {
    public static void main(String[] args) {
        int n = 10;
        divisible(n);

    }
    public static void divisible(int n){
        if (n % 5 ==0){
            System.out.println("Divisible");
        }else {
            System.out.println("Not divisible");
        }
    }
}
