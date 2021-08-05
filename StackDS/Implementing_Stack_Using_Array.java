package Basic_To_Advanced_DataStructure.StackDS;

import java.util.Stack;

public class Implementing_Stack_Using_Array {
    public static void main(String[] args) {
        Implementing_Stack_Using_Array stack = new Implementing_Stack_Using_Array();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + "Popped from stack");
    }

    static final int size = 100;
    int top;
    int arr[] = new int[size]; //this is the maximum size of the stack

    boolean isEmpty() {
        return (top < 0);
    }
    Implementing_Stack_Using_Array(){
        top = -1;
    }

    //pushing element into the stack
    boolean push(int x){
        if (top >= (size -1)){
            System.out.println("Stack Overflow");
            return false;
        }else {
            arr[++top] = x;
            System.out.println(x + "pushed into stack");
            return true;
        }
    }

    //removing element from the stack
    int pop(){
        if (top < 0){
            System.out.println("Stack underflow");
            return 0;
        }else {
            int x = arr[top--];
            return x;
        }
    }

    //looking into the stack
    int peek(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = arr[top];
            return x;
        }
    }
}
