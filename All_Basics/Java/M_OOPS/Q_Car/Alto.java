package Java.M_OOPS.Q_Car;

public class Alto extends Car {

    int numberOfHeadLight;

    public Alto(String registrationNumber) {
        super(registrationNumber);
    }



    @Override
    public void numberOfHeadLights() {
        int numberOfHeadLights = 2;
    }

    @Override
    public void braking(int power) {
        System.out.println("Alto has ordinary steering and has brake power "+ power + " units");
    }

    @Override
    public void steering() {
    }
}
