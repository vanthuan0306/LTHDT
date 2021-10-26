package com.thuanpv1731103117.tuan06;

public class CircleTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        if(circle.nhapChuot==true){
            circle.veHinhTron();
            circle.xoay();
            circle.phatAmThanh();  
        } else 
        System.out.println("Chưa nhấp chuột vào hình Circle");
        
    }
}
