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
                String name = addid.nextLine();
        }
    }
}
