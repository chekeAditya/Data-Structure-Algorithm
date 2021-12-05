package Java.L_StaticNonStaticAndExceptionHandliing;

public class D_Scores {

    int[] scores = {10, 20, 30, 40};


    public static void main(String[] args) {
        D_Scores scores = new D_Scores();
        scores.findScore(1, scores.scores);
        scores.findScore(3, scores.scores);
        scores.findScore(6, scores.scores); //here exception occured
    }

    public void findScore(int index, int[] scores) {
        try {
            System.out.println(scores[index]);
        } catch (Exception e) {
            System.out.println("Exception occurred " + e.getMessage());
        }
    }
}
