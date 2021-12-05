package Java.Comparision_Logical_Operator;

public class Game_Of_Boolean {
    public static void main(String[] args) {

        boolean game_one = true || true || false && false;
        if (game_one == true) {
            System.out.println("Not Possible");
        }

        boolean game_two = true || true && false || true;
        if (game_two != true) {
            System.out.println("Not possible");
        }else
            System.out.println(game_two);

        boolean game_three = false || true || false || false && true;
        if(game_three != false){
            System.out.println("Not Possible");
        }else {
        System.out.println("game_three");
        }

        boolean game_four = false && true || true || true && false;
        if (game_four != true){
            System.out.println("Not Possible");
        }else{
        System.out.println(game_four);
        }

        boolean game_five = false || false || false && true || false;
        if (game_five != false){
            System.out.println("Not Possible");
        }else{
        System.out.println(game_five);
        }

    }
}
