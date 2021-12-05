package Java.X_Evaluation.Unit_I.E_EvalutaionCoding.AssignmentTrackingSystem;

public class FTAND extends Assignment {

    String batchName;

    public void display() {
        System.out.println("The Assignment Name is " + getAssignmentName());
        System.out.println("The Assignment Link is " + getAssignmentLink());
        System.out.println("The Assignment Password is " + getAssignmentPassword());
        System.out.println("Total number of questions are  " + getNoOfQuestions());
        System.out.println("Batch name is " + getBatchName());
    }

    @Override
    public String getAssignmentName() {
        return super.getAssignmentName();
    }

    @Override
    public int getNoOfQuestions() {
        return super.getNoOfQuestions();
    }

    @Override
    public String getAssignmentLink() {
        return super.getAssignmentLink();
    }

    @Override
    public String getAssignmentPassword() {
        return super.getAssignmentPassword();
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchName() {
        return batchName;
    }
}