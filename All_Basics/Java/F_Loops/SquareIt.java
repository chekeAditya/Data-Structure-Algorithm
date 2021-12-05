package Java.F_Loops;

public class SquareIt {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("The Square of " + i + " is " +(i*i));
        }
        System.out.println();
        System.out.println("------Using while loop-------");
        System.out.println();

        int i = 1;
        while (i<=10){
            System.out.println("The Square of " + i + " is " +(i*i));
            i++;
        }

    }
}
