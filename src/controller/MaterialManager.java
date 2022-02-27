package controller;

import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MaterialManager {
    public static ArrayList<Material> materials = new ArrayList<>();

    public void materials(){
        LocalDate time = LocalDate.now();
        Material crispy1 = new CrispyFlour("1", "Bột mì", time, 4, 5);
        Material crispy2 = new CrispyFlour("2", "Bột mì 2", time ,7, 2);
        Material crispy3 = new CrispyFlour("3", "Bột mì 3", time ,9, 6);
        Material crispy4 = new CrispyFlour("4", "Bột mì 4", time ,10, 7);
        Material crispy5 = new CrispyFlour("4", "Bột mì 4", time ,10, 7);
        Material meat1 = new Meat("6", "Thit bò",time, 6,9);
        Material meat2 = new Meat("7", "Thit lợn",time, 4,6);
        Material meat3 = new Meat("8", "Thit gà",time, 8,3);
        Material meat4 = new Meat("9", "Thit dê",time, 1,7);
        Material meat5 = new Meat("10", "Thit chó",time, 3,9);
        materials.add(crispy1);
        materials.add(crispy2);
        materials.add(crispy3);
        materials.add(crispy4);
        materials.add(crispy5);
        materials.add(meat1);
        materials.add(meat2);
        materials.add(meat3);
        materials.add(meat4);
        materials.add(meat5);
        System.out.println("List Materials: ");
        for (Material e: materials) {
            System.out.println(e.toString());
        }
    }

    public void addMaterial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Thêm nguyên liệu bột.");
        System.out.println("1. Thêm nguyên liệu thịt.");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                Scanner addid = new Scanner(System.in);
                System.out.print("Mời bạn nhập id: ");
                String id = addid.nextLine();
                Scanner addname = new Scanner(System.in);
                System.out.print("Mời bạn nhập name Crispy: ");
                String name = addname.nextLine();
                Scanner adddate = new Scanner(System.in);
                System.out.print("Mời bạn nhập date of Crispy: ");
                int date = adddate.nextInt();
                Scanner addmonth = new Scanner(System.in);
                System.out.print("Mời bạn nhập month of Crispy: ");
                int month = addmonth.nextInt();
                Scanner addyear = new Scanner(System.in);
                System.out.print("Mời bạn nhập year of Crispy: ");
                int year = addmonth.nextInt();
                Scanner addcost = new Scanner(System.in);
                System.out.print("Mời bạn nhập cost Crispy: ");
                int cost = addcost.nextInt();
                Scanner addquantity = new Scanner(System.in);
                System.out.print("Mời bạn nhập quantity Crispy: ");
                int quantity = addquantity.nextInt();
                LocalDate localDate = LocalDate.of(year,month, date);
                CrispyFlour newCrispy = new CrispyFlour();
                newCrispy.setId(id);
                newCrispy.setName(name);
                newCrispy.setManufacturingDate(localDate);
                newCrispy.setCost(cost);
                newCrispy.setQuantity(quantity);
                materials.add(newCrispy);
                break;
            case 2:
                Scanner addid2 = new Scanner(System.in);
                System.out.print("Mời bạn nhập id: ");
                String id2 = addid2.nextLine();
                Scanner addname2 = new Scanner(System.in);
                System.out.print("Mời bạn nhập name Crispy: ");
                String name2 = addname2.nextLine();
                Scanner adddate2 = new Scanner(System.in);
                System.out.print("Mời bạn nhập date of Crispy: ");
                int date2 = adddate2.nextInt();
                Scanner addmonth2 = new Scanner(System.in);
                System.out.print("Mời bạn nhập month of Crispy: ");
                int month2 = addmonth2.nextInt();
                Scanner addyear2 = new Scanner(System.in);
                System.out.print("Mời bạn nhập year of Crispy: ");
                int year2 = addyear2.nextInt();
                Scanner addcost2 = new Scanner(System.in);
                System.out.print("Mời bạn nhập cost Crispy: ");
                int cost2 = addcost2.nextInt();
                Scanner addweight = new Scanner(System.in);
                System.out.print("Mời bạn nhập quantity Crispy: ");
                double weight = addweight.nextDouble();
                LocalDate localDate2 = LocalDate.of(year2,month2, date2);
                Meat newMeat = new Meat();
                newMeat.setId(id2);
                newMeat.setName(name2);
                newMeat.setManufacturingDate(localDate2);
                newMeat.setCost(cost2);
                newMeat.setWeight(weight);
                materials.add(newMeat);
                break;
        }
        System.out.println("List Material: ");
        for (Material e: materials) {
            System.out.println(e.toString());
        }
    }
}
