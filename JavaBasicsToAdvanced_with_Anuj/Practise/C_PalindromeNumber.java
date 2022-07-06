package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Practise;

public class C_PalindromeNumber {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        int start = 0;
        int end = a.length()-1;
        while(start<end){
            if(a.charAt(start) != a.charAt(end)) return false;
            else{   
                start++;
                end--;
            }
        }
        return true;
    }
}
