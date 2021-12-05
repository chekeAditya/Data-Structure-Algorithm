package Java.M_OOPS.J_Student;

import java.text.ParseException;

public class Student1 extends StudentDetails{

    public Student1(String name, String dob, String bloodGroup) {
        super(name, dob, bloodGroup);
    }

    @Override
    public void calculateAge() throws ParseException {
        super.calculateAge();
    }
}
