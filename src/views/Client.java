//package views;
//
//import controller.MaterialManager;
//import model.Material;
//import model.Meat;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Client {
//    private List<Material> materialList = new ArrayList<>();
//
//    public static void main(String[] args) {
//
//    }
//
//    public static void addNewMaterial(){
//        Meat meat = creatNewMeat();
//
//    }
//
//    public static Meat creatNewMeat(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào ID:");
//        String id = scanner.nextLine();
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào name:");
//        String name = scanner1.nextLine();
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào ngày:");
//        int day = scanner2.nextInt();
//
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào tháng:");
//        int month = scanner3.nextInt();
//
//        Scanner scanner4 = new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào năm:");
//        int year = scanner4.nextInt();
//        LocalDate localDate = LocalDate.of(year,month,day);
//
//        Scanner scanner5 = new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào giá:");
//        int cost = scanner5.nextInt();
//
//        Scanner scanner6 = new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào khối lượng:");
//        int weight = scanner6.nextInt();
//
//
//    }
//}
