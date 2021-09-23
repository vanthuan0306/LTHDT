package com.thuanpv1731103117.lab2;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("1. Giải phương trình bậc 1.");
        System.out.println("2. Giải phương trình bậc 2.");
        System.out.println("3. Tính tiền điện sử dụng.");
        System.out.println("4. Thoát ứng dụng.");
        
        //chọn chức năng
        System.out.print("Chọn chức năng [1- 4]: ");
			int chon = scanner.nextInt();
            
			switch (chon) {
                case 1: 
                    System.out.println("Giải phương trình bậc 1.");
                    com.thuanpv1731103117.lab2.Bai1.main(args);;
                    break;
                case 2:
                    System.out.println("Giải phương trình bậc 2.");
                    com.thuanpv1731103117.lab2.Bai2.main(args);
                    break;
                case 3:
                    System.out.println("\tính tiền điện.");
                    com.thuanpv1731103117.lab2.Bai3.main(args);
                    break;
                default:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
        }
    
    }
}



