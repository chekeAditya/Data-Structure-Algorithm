package Z_Rivision;

public class R3 {
    public static void main(String[] args) {
        int[] my_array1 = {
                1, 2, 3, 4, 5, 6, 7, 8
        };
//                1789, 2035, 1899, 1456, 2013,
//                1458, 2458, 1254, 1472, 2365,
//                1456, 2165, 1457, 2456};

        String sorting = "";
        int number = my_array1[0];

        for (int i = 0; i < my_array1.length; i++) {
            if (my_array1[i] < number) {
                sorting += my_array1[i];
            }
        }
        System.out.println(sorting);
    }
}

