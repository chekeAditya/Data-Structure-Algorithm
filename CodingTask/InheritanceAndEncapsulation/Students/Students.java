package Basic_To_Advanced_DataStructure.CodingTask.InheritanceAndEncapsulation.Students;

import java.util.Scanner;

public class Students {
    protected String name;
    protected int age;
    protected String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Students students = new Students();
        int n = scanner.nextInt();
        while (n-- > 0) {
            students.setName(scanner.next());
            students.setAge(scanner.nextInt());
            scanner.nextLine();
            students.setAddress(scanner.nextLine());
            printDetails(students);
        }
    }

    static void printDetails(Students students) {
        System.out.println(students.getName());
        System.out.println(students.getAge());
        System.out.println(students.getAddress());
    }
}
