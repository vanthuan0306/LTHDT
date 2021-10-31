package com.thuanpv1731103117.tuan08.homework;

import java.util.Scanner;

public class SanPhamTestDrive {
    //cách 1
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        SanPham sp1 = new SanPham();
        System.out.print("Nhập mã sản phẩm 1: ");
        sp1.setMaSp(scanner.nextInt());scanner.nextLine();
        System.out.print("Nhập tên sản phẩm 1: ");
        sp1.setTenSp(scanner.nextLine());
        System.out.print("Đơn giá sản phẩm 1: ");
        sp1.setDonGia(scanner.nextDouble());
        System.out.print("Giá giảm: ");
        sp1.setGiamGia(scanner.nextDouble());

        SanPham sp2 = new SanPham();
        System.out.print("Nhập mã sản phẩm 2: ");
        sp2.setMaSp(scanner.nextInt());scanner.nextLine();
        System.out.print("Nhập tên sản phẩm 2: ");
        sp2.setTenSp(scanner.nextLine());
        System.out.print("Đơn giá sản phẩm 2: ");
        sp2.setDonGia(scanner.nextDouble());
        System.out.print("Giá giảm: ");
        sp2.setGiamGia(scanner.nextDouble());


        System.out.println("---Danh sách sản phẩm---");
        System.out.println("Sản phẩm 1");
        sp1.xuatThongTin();
        System.out.println("");
        System.out.println("Sản phẩm 2");
        sp2.xuatThongTin();
        System.out.println("---End---");
    }
    //c2
    // public static void main(String[] args) {
        
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Nhập số lượng sản phẩm: ");
    //     int slsp= scanner.nextInt();
    //     SanPham sp = new SanPham();

    //     for(int i=1; i<=slsp; i++ ){
    //         //SanPham sp = new SanPham();
    //         System.out.print("Nhập mã sản phẩm " +i+ ": ");
    //         sp.setMaSp(scanner.nextInt());scanner.nextLine();
    //         System.out.print("Nhập tên sản phẩm " +i+ ": ");
    //         sp.setTenSp(scanner.nextLine());
    //         System.out.print("Đơn giá sản phẩm " +i+ ": ");
    //         sp.setDonGia(scanner.nextDouble());
    //         System.out.print("Giá giảm: ");
    //         sp.setGiamGia(scanner.nextDouble());
            
            
    //         System.out.println("Thông tin sản phẩm " +i+ ". ");
    //         sp.xuatThongTin();
    //         System.out.println("");
    //     }
        
        
    //}
    
}
