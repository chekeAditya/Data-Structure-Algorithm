package Java.X_Evaluation.Unit_I.E_EvalutaionCoding.RuleKeyRuleValues;

import java.util.*;

public class CountTestDrive {
    public static void main(String[] args) {
        HashMap<List<List<String>>, String> hashMap = new HashMap<>();
        List<List<String>> arraylist = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        arraylist.add(Collections.singletonList("phone"));
        arraylist.add(Collections.singletonList("blue"));
        arraylist.add(Collections.singletonList("pixel"));
        ArrayList<String> list2 = new ArrayList<>();
        arraylist.add(Collections.singletonList("computer"));
        arraylist.add(Collections.singletonList("silver"));
        arraylist.add(Collections.singletonList("phone"));
        List<String> list3 = new ArrayList<>();
        arraylist.add(Collections.singletonList("phone"));
        arraylist.add(Collections.singletonList("gold"));
        arraylist.add(Collections.singletonList("iphone"));

        int count = 0;
        String ruleValue = "silver";
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.contains(ruleValue)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
