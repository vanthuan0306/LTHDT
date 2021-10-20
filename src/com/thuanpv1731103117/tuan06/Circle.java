package com.thuanpv1731103117.tuan06;

import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);
    int banKinh;
    double pi = 3.14;
    boolean nhapChuot;
    String amThanh;

    void veHinhTron(){
        System.out.print("Nhập bán kính hình tròn: ");
        banKinh = scanner.nextInt();
        System.out.println("Hình tròn có bán kính là: " +banKinh);
        
        System.out.println("Vẽ hình tròn");
    }

    void xoay(){
        System.out.println("Xoay hình tròn");
    }

    void phatAmThanh(){
        System.out.println("Phát âm thanh hình tròn");
    }
    
}
