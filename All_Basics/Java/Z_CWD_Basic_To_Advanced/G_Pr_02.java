package Java.Z_CWD_Basic_To_Advanced;

public class G_Pr_02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //Decrypt code by 8
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
