package Java.M_OOPS.C_Person;

import java.util.Scanner;

public class PersonTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person");
        String name = scanner.nextLine();
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println("Enter the gender");
        char gender = scanner.next().charAt(0);
        Person_01 person01 = new Person_01(name,age,gender);
        System.out.println("The name of the person is "+ person01.getName());
        System.out.println("The age of the person is "+ person01.getAge());
        System.out.println("The Gender of the person is "+ person01.getGender());
    }
}
