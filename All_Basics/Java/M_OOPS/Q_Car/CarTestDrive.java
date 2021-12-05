package Java.M_OOPS.Q_Car;

public class CarTestDrive {
    public static void main(String[] args) {
        Car alto = new Alto("KA-05-EJ-4469");
        System.out.println("The Registration number of Alto is " + alto.registrationNumber);
        alto.braking(1500);

        System.out.println();

        Car kiaSheltos = new KiaSheltos("TN-12-RN-4567");
        System.out.println("The Registration number of Alto is " + kiaSheltos.registrationNumber);
        kiaSheltos.braking(2000);
    }
}
