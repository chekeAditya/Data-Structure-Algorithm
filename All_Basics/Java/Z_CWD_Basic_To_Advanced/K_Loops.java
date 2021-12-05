package Java.Z_CWD_Basic_To_Advanced;

public class K_Loops {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Using while loops");
        while (a < 5) {
            System.out.println(a);
            a++;
        }
        System.out.println("Using do-while loops");
        int b = 0;
        do {

            b++;
            if (b == 2) {
                System.out.println("Ending this loops");
                continue;
            }
            System.out.println(b);
        } while (b < 5);

        System.out.println("Using for loops");
        int n = 5;
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
