/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De02;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main (String[] args){
       
        menu();
    }
    private static void menu(){
        int chon = 6;
        Scanner  sc = new Scanner (System.in);
        do {
            System.out.println("==========================");
            System.out.println("1 Khoi tao danh sach cau thu can quan ly");
            System.out.println("2 Them moi cau thu");
            System.out.println("3 Xuat tong tin danh sach cau thu");
            System.out.println("4 Tim kiem cau thu có luong thuc lanh thap nhat");
            System.out.println("5 Sap xep cau thu theo thuc luong giam dan");
            System.out.println("---------------------------------------");
            System.out.println("6.Tinh luong(1->6):");
            chon = sc.nextInt();
        }
    }
}
