package Java.X_Evaluation.Unit_I.E_EvalutaionCoding.AssignmentTrackingSystem;

public class Assignment {
    String assignmentName;
    String assignmentLink;
    String assignmentPassword;
    int noOfQuestions;

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public void setAssignmentLink(String assignmentLink) {
        this.assignmentLink = assignmentLink;
    }

    public void setAssignmentPassword(String assignmentPassword) {
        this.assignmentPassword = assignmentPassword;
    }

    public void setNoOfQuestions(int noOfQuestions) {
        this.noOfQuestions = noOfQuestions;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public String getAssignmentLink() {
        return assignmentLink;
    }

    public String getAssignmentPassword() {
        return assignmentPassword;
    }

    public int getNoOfQuestions() {
        return noOfQuestions;
    }
}
