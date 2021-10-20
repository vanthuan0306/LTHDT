package com.thuanpv1731103117.tuan06;

import java.util.Scanner;

public class Square {

    Scanner scanner = new Scanner(System.in);
    int canh;
    boolean nhapChuot;
    String amThanh;
    
    void veHinh(){

        //nhập cạnh
        System.out.print("Cạnh hình vuông là: ");
        canh = scanner.nextInt();
        
        //vẽ hình
        for(int i = 0; i < canh; i++) {
            for(int j = 0; j < canh; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("Đã vẽ xong hình vuông.");
    }
    void xoay360Do(){
        
        System.out.println("Xoay hình vuông");

    }

    void phatAmThanh(){
        System.out.println("Đang phát âm thanh hình vuông");

    }


    


    
}
