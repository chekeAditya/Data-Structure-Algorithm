package Basic_To_Advanced_DataStructure.Java_Apna_College;


class FirstClass {
    public static void main(String[] args) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        char a  = 'a';
        boolean b = true;
        for (char c : arr) {
            if (a == c) b = true;
            else b = false;
        }
        if (b) System.out.println('v');
        else System.out.println("c");
    }
}