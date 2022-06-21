package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_2_OOPS;

public class C_Inheritance {
    public static void main(String[] args) {
        Samsung s10 = new Samsung();
        s10.os = "Android";
         /* here it will check fir in the samsung weather playGame function is available or not if yes then it will
            call then else it will go to its parent class and their it will find that.
         */
        s10.playGames();

        Apple apple = new Apple();
        apple.playGames();
    }
}

class Samsung extends MobilePhone {
    void playGames(){
        System.out.println("Samsung is playing games");
    }
}

class Apple extends MobilePhone {

}

class MobilePhone {
    String os;
    boolean hasHeadPhoneJack;
    int price;
    int dimen;

    void playGames(){
        System.out.println("Mobile phone playing games");
    }
}