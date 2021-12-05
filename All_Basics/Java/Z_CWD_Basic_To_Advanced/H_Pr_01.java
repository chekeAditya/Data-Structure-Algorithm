package Java.Z_CWD_Basic_To_Advanced;

public class H_Pr_01 {
    public static void main(String[] args) {
        String name = "HOW ARE U MY BROTHER";
//Problem 1
        name = name.toLowerCase();
        System.out.println(name);  //convert it using lowercase
//Problem 2
        System.out.println(name.replace(" ", "_"));//here we are replacing space with underscore
//Problem 3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","aditya");
        System.out.println(letter);
//Problem 4
        String words = "This  string   contains  double and triple   spaces";
        System.out.println(words.indexOf(" ")); //single space
        System.out.println(words.indexOf("  "));//double space
        System.out.println(words.indexOf("   ")); //triple space
        //here it will count the index after how many index space will be available and if index space are not present then it will show -1
//Problem 5
        String myLetter = "Dear Harry, \n \tThis java course is nice. \nThanks!";
        System.out.println(myLetter);
    }
}
