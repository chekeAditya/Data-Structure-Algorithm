package Java.M_OOPS.K_Student;

import java.util.Scanner;

public class StudentTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of testcases");
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
//            System.out.println("Name");
            String name = scanner.next();

//            System.out.println("Age");
            int age = scanner.nextInt();
            scanner.nextLine();

//            System.out.println("Address");
            String address = scanner.nextLine();

            Student student = new Student(name, age, address);
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getAddress());
            System.out.println();
        }
    }
}

