package com.thuanpv1731103117.tuan07.inheritance;

import java.util.Scanner;

public class Triangle extends Shape{
    Scanner scanner = new Scanner(System.in);
    int canhTamGiac;

    protected void draw(){
        System.out.print("Nhập cạnh hình tam giác: ");
        canhTamGiac = scanner.nextInt();
        System.out.println("Vẽ hình tam giác có canh là: " +canhTamGiac);
    }
    
}
