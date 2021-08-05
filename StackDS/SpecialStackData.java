package Basic_To_Advanced_DataStructure.StackDS;

public class SpecialStackData {
    public static void main(String[] args) {
        SpecialStackData stackData = new SpecialStackData();
        stackData.push(10);
        stackData.push(20);
        stackData.push(30);
        System.out.println(stackData.getMin(stackData));
        stackData.push(30);
        System.out.println(stackData.getMin(stackData));
    }

    static final int MaxSize = 100;
    int arr[] = new int[MaxSize];
    int top;

    private int getMin(SpecialStackData specialStackData) {
        int x = specialStackData.pop();
        specialStackData.push(x);
        return x;
    }

    boolean push(int x) {
        top = -1;
        if (isFull()) {
            System.out.println("Stack overflow");
            return false;
        } else {
            arr[++top] = x;
            System.out.println(x + "pushed into the stack");
            return true;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
        } else {
            return arr[top--];
        }
        return 0;
    }

    boolean isEmpty() {
        if (top < 0) {
            return true;
        } else return false;
    }

    boolean isFull() {
        return top == MaxSize - 1;
    }
}
