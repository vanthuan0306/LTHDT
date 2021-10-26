package com.thuanpv1731103117.tuan07.inheritance;
import java.util.Scanner;

public class Square extends Shape{

    Scanner scanner = new Scanner(System.in);
    int canh;

    public void draw(){
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
    
}
