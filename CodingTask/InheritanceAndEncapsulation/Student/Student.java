package Basic_To_Advanced_DataStructure.CodingTask.InheritanceAndEncapsulation.Student;

public class Student {

    protected String name;
    protected String DOB;
    protected String bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int calculateAge() {
        char n = getDOB().charAt(3);
        System.out.println(n);
        return 1;
    }
}

class drive{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Aman");
        student1.setDOB("19-05-1995");
        student1.setBloodGroup("O+ve");
        System.out.println("Student 1 name is " + student1.getName());
        System.out.println("Student 1 age is " + student1.calculateAge());
        System.out.println("Student 1 blood group is " + student1.getBloodGroup());

        System.out.println();
        Student student2 = new Student();
        student2.setName("Rahul Vats");
        student2.setDOB("19-05-1998");
        student2.setBloodGroup("AB -ve");
        System.out.println("Student 2 name is " + student2.getName());
        System.out.println("Student 2 age is " + student2.calculateAge());
        System.out.println("Student 2 blood group is " + student2.getBloodGroup());

    }
}
