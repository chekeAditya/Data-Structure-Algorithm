package Basic_To_Advanced_DataStructure.CodingTask.InheritanceAndEncapsulation.KFC;

public class Drive {
    public static void main(String[] args) {
        KFC kfc = new KFC();
        kfc.friedChickenRecipe("Take 200gms boneless chicken  and marinate it with lemon, salt and flour");
        kfc.display(102);

        System.out.println();

        FIveStarChicken fIveStarChicken = new FIveStarChicken();
        fIveStarChicken.display(345);
    }
}
