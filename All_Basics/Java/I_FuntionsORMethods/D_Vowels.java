package Java.I_FuntionsORMethods;

public class D_Vowels {
    public static void main(String[] args) {
        String word = "aditya Aditya";
        removeVowels(word);
    }

    public static void removeVowels(String word) {
        String output = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A' ||
                    word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'I' ||
                    word.charAt(i) == 'o' || word.charAt(i) == 'O' ||
                    word.charAt(i) == 'u' || word.charAt(i) == 'U') {
                output = output + word.charAt(i);
            }
        }
        System.out.println(output);
    }
}