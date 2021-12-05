package Java.I_FuntionsORMethods;

public class I_RemoveChar {
    public static void main(String[] args) {
        removeChar();
    }

    public static void removeChar() {
        String name = "Aditya Cheke";
        char removeThis = 'e';
        String output = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != removeThis) {
                output = output + name.charAt(i);
            }
        }
        System.out.println(output);
    }
}
