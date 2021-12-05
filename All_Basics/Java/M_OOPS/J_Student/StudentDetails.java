package Java.M_OOPS.J_Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class StudentDetails {
    protected String name;
    protected String dob;
    protected String bloodGroup;

    public StudentDetails(String name, String dob, String bloodGroup) {
        this.name = name;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
    }

    public void calculateAge() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = simpleDateFormat.parse(dob);
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
        Period period = Period.between(givenDate, LocalDate.now());
        System.out.println(period.getYears());
    }
}
