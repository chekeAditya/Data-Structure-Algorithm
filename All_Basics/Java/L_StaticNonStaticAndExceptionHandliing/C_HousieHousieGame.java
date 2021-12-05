package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.HashMap;

public class C_HousieHousieGame {
    public static void main(String[] args) {
        HashMap<String, String[]> hashMap = new HashMap<>();

        String topRom = "top_row";
        String[] topRowWinners = {"ram", "ayush", "nrupul"};
        hashMap.put(topRom, topRowWinners);

        String middleRow = "middle_row";
        String[] middleRowWinners = {"sita", "laxman", "jaydev", "surya"};
        hashMap.put(middleRow, middleRowWinners);

        String bottomRom = "bottom_row";
        String[] bottomRowWinners = {"floyd", "leo"};
        hashMap.put(bottomRom, bottomRowWinners);

        String[] topRowElements = hashMap.get("top_row");
        for (int i = 0; i < topRowElements.length; i++) {
            if (topRowElements[i].length() > 4) {
                System.out.println(topRowElements[i]);
            }
        }

//        //for everyone
//        for (Map.Entry<String, String[]> map : hashMap.entrySet()) {
//            String key = map.getKey();
//            String[] value = map.getValue();
//            for (int i = 0; i < value.length; i++) {
//                if (value[i].length() > 4) {
//                    System.out.println(value[i]);
//                }
//            }
//
//        }

//        String[] middleRowElements = hashMap.get("middle_row");
//        String[] bottomRowElements = hashMap.get("bottom_row");
    }
}
