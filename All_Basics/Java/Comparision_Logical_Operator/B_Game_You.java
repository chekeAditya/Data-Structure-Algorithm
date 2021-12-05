package Java.Comparision_Logical_Operator;

public class B_Game_You {
    public static void main(String[] args) {
        boolean game_one = true && false && !(true) || false;
        // t-> f && f || f ->
        System.out.println("Game one is " + game_one);

        boolean game_two = true || !(false) && (true || false);
        //t || t && t -> t
        System.out.println("Game two is " + game_two);

        boolean game_three = false || (true && false) || true ;
        // f || f ||t ->t
        System.out.println("Game three is " + game_three);

        boolean game_four = true || (false && true || true);
        //t || f -> t
        System.out.println("Game four is " + game_four);

    }
}
