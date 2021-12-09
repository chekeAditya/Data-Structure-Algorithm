package Basic_To_Advanced_DataStructure.CodingTask.Singleton;

public class Singleton {

    private static Singleton single_instance = null;

    public String s;

    private Singleton() {
        s = "Hello, String in Singleton Class";
    }

    public static Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}


class mainRunningClass {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
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
