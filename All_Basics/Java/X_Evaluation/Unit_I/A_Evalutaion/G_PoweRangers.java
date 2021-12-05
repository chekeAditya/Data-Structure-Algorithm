package Java.X_Evaluation.Unit_I.A_Evalutaion;

import java.util.Scanner;

public class G_PoweRangers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int red = scanner.nextInt();
        int blue = scanner.nextInt();
        int green = scanner.nextInt();
        int yellow= scanner.nextInt();
        int pink = scanner.nextInt();
        int maxpower = red*5 + blue*4 + green*3 + yellow*2 + pink;
        System.out.println(maxpower);
    }
}
