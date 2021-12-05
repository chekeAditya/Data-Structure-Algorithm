package Java.K_ObjectsAndConstructor;

public class B_Car_I_Problem {
    //properties = member variable
    String name;
    String color;
    float maxSpeed;
    int noOfGears;

    //constructor
    public B_Car_I_Problem(String name, String color, float maxSpeed, int noOfGears) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.noOfGears = noOfGears;
    }

    //function
    public static void main(String[] args) {
        B_Car_I_Problem bmw = new B_Car_I_Problem("X5","Black",400.67f,5);
        bmw.getVehicleDetails(bmw);
        B_Car_I_Problem tata = new B_Car_I_Problem("nexon","white",200.44f,6);
        tata.getVehicleDetails(tata);
    }

    //behaviour
    public void getVehicleDetails(B_Car_I_Problem car){
        System.out.println("Name of the car :- " + car.name);
        System.out.println("Color of the car :- " + car.color);
        System.out.println("Speed of the car :- " + car.maxSpeed);
        System.out.println("No of Gears of the car :- " + car.noOfGears);
        System.out.println("---------------------------------------------");

    }
}
