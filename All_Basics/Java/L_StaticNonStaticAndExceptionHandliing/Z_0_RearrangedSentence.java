package Java.L_StaticNonStaticAndExceptionHandliing;

public class Z_0_RearrangedSentence {
    public static void main(String[] args) {
        String name = "is2 sentence4 This1 a3";
        String[] str = name.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                for (int k = 1; k < str.length; k++) {
                    if (str[i].charAt(i) == k){
                        System.out.println(str[i]);
                        break;
                    }
                }
            }
        }
    }
}
