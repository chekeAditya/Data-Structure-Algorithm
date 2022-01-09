package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_3_LinearSearch;

public class B_Search_In_String {
    public static void main(String[] args) {
        String str = "Aditya";
        char target = 'a';
        System.out.println(search(str, target));
    }

    private static boolean search(String str, char target) {
        if (str.length() == 0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                return true;
        }
        return false;
    }
}
