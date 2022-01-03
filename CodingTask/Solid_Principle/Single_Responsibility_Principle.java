package Basic_To_Advanced_DataStructure.CodingTask.Solid_Principle;

public class Single_Responsibility_Principle {

}

class User {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class UserType extends User {

    private int selecting;

    public int getSelecting() {
        return selecting;
    }

    public void setSelecting(int selecting) {
        this.selecting = selecting;
    }

    public boolean isSpecialUser() {
        return selecting == 7;
    }
}
