package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.*;

public class K_UserSkillFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of element");
//        int n = scanner.nextInt();
//        System.out.println("Enter the element");
        HashMap<String, List<String>> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();


        //ListOne
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("cmd");
        listOne.add("Python");
        listOne.add("sql");

        //ListTwo
        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("js");
        listTwo.add("html");

        //ListThree
        ArrayList<String> listThree = new ArrayList<>();
        listThree.add("ds");
        listThree.add("Algo");

        //ListFour
        ArrayList<String> listFour = new ArrayList<>();
        listFour.add("js");
        listFour.add("react");

        hashMap.put("Nrupul", listOne);
        hashMap.put("Prateek", listTwo);
        hashMap.put("Aman", listThree);
        hashMap.put("Albert", listFour);

        for (Map.Entry<String, List<String>> map : hashMap.entrySet()) {
            if (map.getValue().contains("ds")){
                System.out.println(map.getKey());
            }
//            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }
}
/*
nrupul - 3
prateek - 2
aman - 2
albert - 2
 */


/*
logic

        *firstly go through each and every key and store it in Hashmap
        *run a loop and check if that key is already present or not if yes then make a list if that key
        *taking input from the keyboard about the skll and then check weather is it present of not
        *those hey who had that value print the key
 */