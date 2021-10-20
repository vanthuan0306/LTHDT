package com.thuanpv1731103117.tuan06;

import java.util.Scanner;

public class Triangle {
    int canhTamGiac;
    boolean nhapChuot;
    String amThanh;
    Scanner scanner = new Scanner(System.in);

    void veHinhTamGiac(){
        System.out.print("Nhập cạnh hình tam giác: ");
        canhTamGiac = scanner.nextInt();
        System.out.println("Vẽ hình tam giác có canh là: " +canhTamGiac);
    }

    void xoay360Do(){
        System.out.println("Xoay hình tam giác");
    }

    void phatAmThanh(){
        System.out.println("Đang phát âm thanh hình tam giác.");
    }
}
