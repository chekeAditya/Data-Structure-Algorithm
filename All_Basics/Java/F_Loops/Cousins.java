package Java.F_Loops;

public class Cousins {
    public static void main(String[] args) {
        for (int i = 50; i <= 150; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Using while loops");

        int age = 50;
        while (age <= 150) {

            if (age % 7 == 0) {
                System.out.println(age);
            }
                age++;
        }
    }
}
