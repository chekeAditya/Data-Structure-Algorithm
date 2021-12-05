package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class T_IdentifyPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
        isPrime2(n);
    }

    static String isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && n != 1) {
            return "Yes";
        } else
            return "No";
    }

    static void isPrime2(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
/*
1 2 3 4 5 6 7 8 9 10

n = 10
for(int i=2;i<n;i++)
    if(n%i==0){
        count++;

if(count > 1){
    print("Yes")
}else{
    print("No")
}
 */