package Java.Comparision_Logical_Operator;

public class A_Game_WE {
    public static void main(String[] args) {
        boolean game_One = true && false && !(true) || false;
        //t && f && f || f -> f && f -> f -> F
        System.out.println("Game 1 output is " + game_One);

        boolean game_two = true || !(false) && (true || false);
        // t || t && t -> t && t -> t
        System.out.println("Game 2 output is " + game_two);

        boolean game_three = false || (true && false) || true;
        //f || f || t -> t
        System.out.println("Game 3 output is " +game_three);

        boolean game_four = true || (false && true || true);
        // t ||( f || t) -> t || t -> t
        System.out.println("Game 4 output is " +game_four);


    }
}
