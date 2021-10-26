package com.thuanpv1731103117.tuan07.inheritance;

import java.util.Scanner;

public class Circle extends Shape{
    Scanner scanner = new Scanner(System.in);
    int banKinh;
    double pi = 3.14;

    protected void draw(){
        System.out.print("Nhập bán kính hình tròn: ");
        banKinh = scanner.nextInt();
        System.out.println("Hình tròn có bán kính là: " +banKinh);
        
        System.out.println("Vẽ hình tròn");
    }
    
}
