package Java.M_OOPS.I_Restaurant;

public class RestaurantTestDrive {
    public static void main(String[] args) {
        KFC kfc = new KFC();
        kfc.friedChickenRecipe();
        kfc.display();
        System.out.println();
        FiveStarChicken fiveStarChicken = new FiveStarChicken();
        fiveStarChicken.display();
    }
}
