package Java.K_ObjectsAndConstructor;

public class C_Student_I {
    String name;
    String DOB;
    String BloodGroup;

    //constructor
    public C_Student_I(String StudentName, String StudentDOB, String StudentBloodGroup) {
        this.name = StudentName;
        this.DOB = StudentDOB;
        this.BloodGroup = StudentBloodGroup;
    }

    public static void main(String[] args) {
        C_Student_I aditya = new C_Student_I("Aditya", "17-07-2002", "A+");
        aditya.calculateAge(aditya.DOB);
        System.out.println("Student age is :- ");
        aditya.printDetails(aditya);
    }

    //method
    public int calculateAge(String DOB) {
        int currentYear = 2021;
        String[] splitDOB = DOB.split("-"); //[17,07,2002]
        String yearString = splitDOB[2];
        int year = Integer.parseInt(yearString);
        int age = currentYear - year;
        return age;
    }

    //method
    public void printDetails(C_Student_I student) {
        System.out.println("Student Name is :- " + student.name);
        System.out.println("Student BloodGroup is :- " + student.BloodGroup);
    }
}
