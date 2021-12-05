package Java.W_ExtraQuestion;

public class Non_Repeating_Element {
//    //  using loops
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(nonRepeatingNumber(n, arr));
//    }
//
//    static int nonRepeatingNumber(int n, int[] arr) {
//        int num = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] != arr[j]) {
//                    num = arr[i];
//                } else {
//                    break;
//                }
//            }
//        }
//        return num;
//    }
//}
////    using ArrayList
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            arrayList.add(scanner.nextInt());
//        }
//        nonRepeatingNumber(n,arrayList);
//    }
//
//    static void nonRepeatingNumber(int n, ArrayList<Integer> arrayList) {
//        int num = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            for (int j = 0; j < arrayList.size(); j++) {
//                if (arrayList.get(i) != arrayList.get(j){
//                    num = arrayList.get(i);
//                }
//            }
//        }
//        System.out.println(num);
//    }
//}


    ////    using HashMap
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(Systemx.in);
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextInt();
//        }
//        nonRepeatingNumber(n, array);
//    }
//
//    static void nonRepeatingNumber(int n, int[] array) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            if (hashMap.containsKey(array[i])) {
//                hashMap.put(array[i], hashMap.get(array[i]) + 1);
//            } else {
//                hashMap.put(array[i], 1);
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
//            if (map.getValue() == 1) {
//                System.out.println(map.getKey());
//                return;
//            }
//        }
//    }
//}
    public static void main(String[] args) {
        System.out.println((2 - '1'));
    }
}