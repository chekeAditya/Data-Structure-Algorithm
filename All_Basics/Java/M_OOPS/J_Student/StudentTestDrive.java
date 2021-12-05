package Java.M_OOPS.J_Student;

import java.text.ParseException;
import java.util.Scanner;

public class StudentTestDrive {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String dob = scanner.nextLine();
        String bloodgroup = scanner.nextLine();
        scanner.nextLine();
        String name2 = scanner.nextLine();
        String dob2 = scanner.nextLine();
        String bloodgroup2 = scanner.nextLine();

        Student1 student1 = new Student1(name, dob, bloodgroup);
        System.out.println("Student 1 name is " + student1.name);
        System.out.print("Student 1 age is ");
        student1.calculateAge();
        System.out.println("Student 1 blood group is " + student1.bloodGroup);
        System.out.println();


        Student2 student2 = new Student2(name2,dob2,bloodgroup2);
        System.out.println("Student 2 name is " + student2.name);
        System.out.print("Student 2 age is ");
        student1.calculateAge();
        System.out.println("Student 2 blood group is " + student2.bloodGroup);

    }
}
