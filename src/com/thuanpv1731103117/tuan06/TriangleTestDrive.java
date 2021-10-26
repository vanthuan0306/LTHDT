package com.thuanpv1731103117.tuan06;

public class TriangleTestDrive {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        if(triangle.nhapChuot==true){
            triangle.veHinhTamGiac();
            triangle.xoay360Do();
            triangle.phatAmThanh();    
        } else System.out.println("Chưa nhấp chuột vào hình tam giác");
    }
}
