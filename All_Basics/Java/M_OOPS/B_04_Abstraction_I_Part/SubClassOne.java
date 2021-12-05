package Java.M_OOPS.B_04_Abstraction_I_Part;

public class SubClassOne extends Parent{

    public SubClassOne() {
        System.out.println("Child constructor");
    }

    @Override
    protected void print() {
//        super.print();
        System.out.println("subclass one");
    }
}
