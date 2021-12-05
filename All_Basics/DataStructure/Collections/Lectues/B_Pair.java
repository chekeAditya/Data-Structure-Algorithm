package DataStructure.Collections.Lectues;

public class B_Pair<X, Y> {
    X x;
    Y y;

    public B_Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public void getDescription() {
        System.out.println(x + " " + y);
    }
}
