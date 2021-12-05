package Java.M_OOPS.Q_Car;

public class KiaSheltos extends Car {

    public KiaSheltos(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public void numberOfHeadLights() {
        super.numberOfHeadLights();
    }

    @Override
    public void braking(int power) {
        System.out.println("KiaSheltos has ordinary steering and has brake power "+ power + " units");
    }

    @Override
    public void steering() {
        super.steering();
    }

}
