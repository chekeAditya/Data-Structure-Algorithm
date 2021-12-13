package Basic_To_Advanced_DataStructure.CodingTask.Singleton;

public class SingletonClass {

    private static SingletonClass single_instance = null;

    public String s;

    private SingletonClass() {
        s = "Hello, String in Singleton Class";
    }

    public static SingletonClass getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonClass();
        }
        return single_instance;
    }
}


class mainRunningClass {
    public static void main(String[] args) {
        SingletonClass x = SingletonClass.getInstance();
        SingletonClass y = SingletonClass.getInstance();
        SingletonClass z = SingletonClass.getInstance();
        System.out.println("Hashcode of x :- " + x);
        System.out.println("Hashcode of y :- " + y);
        System.out.println("Hashcode of z :- " + z);

        if (x == y && y == z)
            System.out.println("Three object point to the same memory location on the heap.");
        else
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
    }
}
