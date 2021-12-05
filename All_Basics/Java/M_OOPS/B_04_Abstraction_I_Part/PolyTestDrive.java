package Java.M_OOPS.B_04_Abstraction_I_Part;

public class PolyTestDrive {
    public static void main(String[] args) {
//        Calcul calculator = new Calcul();
////        Calcul calculator = null; // you had not create a new object(null pointer exception)
//        int sum = calculator.add(1,2);
//        System.out.println(sum);
//        int sum1 = calculator.add(1,3,6);
//        System.out.println(sum1);


//        SubClassOne subClassOne = new SubClassOne();
//        subClassOne.print();

        Parent obj = new SubClassOne();//parent==chile
        obj.print();
    }
}

/*
 *poly means many and morphism means forms
 */
