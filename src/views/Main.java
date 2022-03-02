package views;

import controller.MaterialManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MaterialManager materialManager = new MaterialManager();
//        materialManager.materials();
        MaterialManager material = new MaterialManager();
        material.materials();
        System.out.println("menu: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. thêm nguyên liệu. ");
        System.out.println("2. sửa nguyên liệu. ");
        System.out.println("3. xóa nguyên liệu. ");
        System.out.println("Enter the choice: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                material.addMaterial();
                break;
            case 2:
                material.editMaterial();
                break;
            case 3:
                material.deleteMaterial();
                break;
        }

    }
}
