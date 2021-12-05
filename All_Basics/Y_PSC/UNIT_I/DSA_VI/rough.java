package Y_PSC.UNIT_I.DSA_VI;

import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int k = 0; k < t; k++) {
        int n = sc.nextInt();
        String name = sc.nextLine();
        String vowels = "";
        String consonents = "";
        for (int i = 0; i < n; i++) {
            if (name.charAt(i) != 'a' && name.charAt(i) != 'A' &&
                    name.charAt(i) != 'e' && name.charAt(i) != 'E' &&
                    name.charAt(i) != 'i' && name.charAt(i) != 'I' &&
                    name.charAt(i) != 'o' && name.charAt(i) != 'O' &&
                    name.charAt(i) != 'u' && name.charAt(i) != 'U') {
                consonents += name.charAt(i);
            } else {
                vowels += name.charAt(i);
            }
        }
        System.out.println(consonents);
        System.out.println(vowels);
    }
}
//}
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        Scanner in = new Scanner(System.in);
//        for (int k = 0; k < t; k++) {
////        while (t > 0) {
//            int n = sc.nextInt();
//            String name = sc.nextLine();
//            String output = "";
//
//            for (int i = 0; i < n; i++) {
//                if (name.charAt(i) != 'a' && name.charAt(i) != 'A' &&
//                        name.charAt(i) != 'e' && name.charAt(i) != 'E' &&
//                        name.charAt(i) != 'i' && name.charAt(i) != 'I' &&
//                        name.charAt(i) != 'o' && name.charAt(i) != 'O' &&
//                        name.charAt(i) != 'u' && name.charAt(i) != 'U') {
//                    output = output + name.charAt(i);
//                }
//            }
//            System.out.println(output);
////            t--;
//        }
//    }
//}