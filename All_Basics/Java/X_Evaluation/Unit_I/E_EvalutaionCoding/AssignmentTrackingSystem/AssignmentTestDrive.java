package Java.X_Evaluation.Unit_I.E_EvalutaionCoding.AssignmentTrackingSystem;

import java.util.Scanner;

public class AssignmentTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String link = scanner.next();
        String password = scanner.next();
        int noQuestion = scanner.nextInt();
        String batchName = scanner.next();
        System.out.println();
        FTAND ftand = new FTAND();
        ftand.setAssignmentName(name);
        ftand.setAssignmentLink(link);
        ftand.setAssignmentPassword(password);
        ftand.setNoOfQuestions(noQuestion);
        ftand.setBatchName(batchName);
        ftand.display();

    }
}
