package com.thuanpv1731103117.tuan05;

public class Cow {
    //attribute - thuộc tính
    double weight;
    double age;

    //methood - function
    //hàm tạo mặc định
    Cow(){
        weight = 15;
        age = 1;
    }
    //hàm tạo 1 tham số
    Cow(double x){
        weight = x;
        age = 2;
    }
    //hàm tạo 2 tham số
    Cow(double y, double z){
        weight = y;
        age = z;
    }
    void xuatThongTin(){
        System.out.print("Cân nặng: "+weight);
        System.out.println(" kg");

        System.out.print("Tuổi: "+age);
        System.out.println(" tuổi");
    }
}
