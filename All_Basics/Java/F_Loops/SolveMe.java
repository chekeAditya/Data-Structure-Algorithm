package Java.F_Loops;

public class SolveMe {
    public static void main(String[] args) {
        int i = 50;
        int count = 0;

        while (i <= 150) {

            if (i % 13 == 0) {
                count++;
                if (count == 1 || count == 3){
                    System.out.println(i);
                }
            }
            i++;
        }
    }
}
