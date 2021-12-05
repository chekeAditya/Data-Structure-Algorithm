package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.ArrayList;
import java.util.Scanner;

public class B_I_02_Tourist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter the size");
        Scanner scanner = new Scanner(System.in);

//        int t = scanner.nextInt();
//        for (int j=0;j<t;j++){
        int n = scanner.nextInt();
        System.out.println("Enter tourist names");
        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }
//        }

        //logic
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 5) {              //goa is not printing as it's size is less than 5
                System.out.println(list.get(i));
            }
        }

    }
}
