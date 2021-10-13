package com.thuanpv1731103117.tuan05;

public class MayTinh {
    String nhaSX;
    double namSX;
    String heDieuHanh;
    double ram;
    String cPU;
    double gia;
    double namBH;

    //methood - function
    //hàm tạo mặc định
    MayTinh(){
        nhaSX = "Lenovo";
        namSX = 2021;
        heDieuHanh = "Windows 10";
        ram = 8;
        cPU = "Intel Core i7 11600";
        gia = 16;
        namBH = 2021;
    }
    //hàm tạo 1 tham số
    MayTinh(double a){
        nhaSX = "HP";
        namSX = 2019;
        heDieuHanh = "Windows 10";
        ram = 8;
        cPU = "Intel Core i3 9700";
        gia = a;
        namBH = 2020;
    }

    //hàm tạo 2 tham số
    MayTinh(double h, double k){
        nhaSX = "Dell";
        namSX = 2021;
        heDieuHanh = "Windows 10";
        ram = h;
        cPU = "Intel Core i7 11700K";
        gia = k;
        namBH = 2021;
    }

    void xuatThongTin(){
        System.out.println("Nhà sản xuất: "+nhaSX);
        System.out.println("Năm sản xuất: "+namSX);
        System.out.println("Hệ điều hành: "+heDieuHanh);
        System.out.print("Ram: "+ram);
        System.out.println("GB");
        System.out.println("CPU: "+cPU);
        System.out.print("Giá bán: "+gia);
        System.out.println(" triệu đồng");
        System.out.println("Năm bảo hành: "+namBH);
    }
    double tinhTien(int soLuong){
        double tien;
        tien = soLuong*gia;
        return tien;
    }
}
