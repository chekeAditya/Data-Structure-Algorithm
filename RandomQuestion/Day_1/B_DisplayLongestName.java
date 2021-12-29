package Basic_To_Advanced_DataStructure.RandomQuestion.Day_1;

public class B_DisplayLongestName {

    /**
     * Input:
     * N = 5
     * names[] = { "Geek", "Geeks", "Geeksfor",
     *   "GeeksforGeek", "GeeksforGeeks" }
     *
     * Output:
     * GeeksforGeeks
     */

    String longest(String[] names, int n) {
        String str = names[0];
        for (String name : names) {
            if (str.length() < name.length())
                str = name;
        }
        return str;
    }

}
