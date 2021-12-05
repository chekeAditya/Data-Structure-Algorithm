package Java.K_ObjectsAndConstructor;

public class D_ClassRoom {
    String name;
    int age;
    String address;

    public D_ClassRoom(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        D_ClassRoom aditya = new D_ClassRoom("Aditya", 5,"Aurangabad");
        aditya.printDetails();
        aditya.printCategory();
        System.out.println("----------------------------------------");
        D_ClassRoom sid = new D_ClassRoom("Sid", 15,"Bangalore");
        sid.printDetails();
        sid.printCategory();
    }

    //Method
    public void printCategory(){
        if (age>=5 && age<=12){
            System.out.println("Primary School");
        }else if (age>=13 && age<=15){
            System.out.println("High School");
        }
    }

    //Method
    public void printDetails(){
        System.out.println(name);
        System.out.println(address);
    }
}
