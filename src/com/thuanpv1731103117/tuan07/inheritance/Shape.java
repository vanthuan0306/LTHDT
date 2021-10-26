package com.thuanpv1731103117.tuan07.inheritance;

public class Shape {
    boolean nhapChuot;
    String amThanh;

    protected void draw(){
        System.out.println("Vẽ hình");
       
    }

    protected void  rotate(){
        System.out.println("Xoay hình 360 độ");
        
    }
    protected void playSound(){
        System.out.println("Phát âm thanh");
        
    }
}
