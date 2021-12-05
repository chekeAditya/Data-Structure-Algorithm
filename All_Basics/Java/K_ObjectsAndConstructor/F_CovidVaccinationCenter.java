//package Java.K_ObjectsAndConstructor;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class F_CovidVaccinationCenter {
//    //member Variable
//    Date slot_date;
//    String center_name;
//    int age_group;
//
//    //constructor
//    public F_CovidVaccinationCenter(Date slot_date, String center_name, int age_group) {
//        this.slot_date = slot_date;
//        this.center_name = center_name;
//        this.age_group = age_group;
//    }
//
//    //main function
//    public static void main(String[] args) {
//        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
//        Date d1 = sdformat.parse("2019-04-15");
//        Date d2 = sdformat.parse("2019-04-15");
//        Date d3 = sdformat.parse("2019-04-15");
//        Date d4 = sdformat.parse("2019-04-15");
//
//        F_CovidVaccinationCenter name = new F_CovidVaccinationCenter(d1, "Aurangabad", 47);
//        name.getVaccine();
//    }
//
//    public void getVaccine() {
//        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date1 = sdformat.parse("01-06-2021");
//        Date date2 = sdformat.parse("05-06-2021");
//        Date date3 = sdformat.parse("05-06-2021");
//        Date date4 = sdformat.parse("05-06-2021");
//        if (age_group >= 18 && age_group <= 44) {
//            if (slot_date.compareTo(date1) >= 0 && slot_date.compareTo(date2) >= 0){
//                System.out.println("Vaccine Available");
//            }else{
//                System.out.println("Vaccine is not Available");
//            }
//            System.out.println("Center Name is : " + center_name);
//        } else if (age_group >= 45 && age_group <= 75) {
//            if (slot_date.compareTo(date1) >= 0 && slot_date.compareTo(date2) >= 0)
//            System.out.println("Vaccine Available");
//            System.out.println("Vaccine Available between 21-05-2021 to 30-05-2021 ");
//            System.out.println("Center Name is : " + center_name);
//        } else {
//            System.out.println("Vaccine not available");
//        }
//    }
//}
