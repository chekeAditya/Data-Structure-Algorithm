package Basic_To_Advanced_DataStructure.Recursion.OJ;//package Basic_To_Advanced_DataStructure.Recursion;
//
//import java.util.Stack;
//
//public class C_ReverseAStackUsingRecursion {
//
//
//    public static void main(String[] args) {
//
//    }
//
//    static void generateAllSubstring(char x) {
//        Stack<Character> stack = new Stack<>();
//        if (stack.isEmpty())
//            stack.push(x);
//
//        else {
//            char a = stack.peek();
//            stack.pop();
//            generateAllSubstring(x);
//
//            stack.push(a);
//        }
//    }
//
//    static void reverse() {
//        if (stack.size() > 0) {
//            char x = stack.peek();
//            stack.pop();
//            reverse();
//            generateAllSubstring(x);
//        }
//    }
//}
