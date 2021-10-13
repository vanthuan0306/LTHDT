package com.thuanpv1731103117.tuan05;

public class TaiKhoan {
    String tenTK;
    int soTK;
    int soDu;

    //methood - function
    //hàm tạo mặc định
    TaiKhoan(){
        tenTK = "Phạm Văn Thuận";
        soTK = 78981981;
        soDu = 1500000;
    }
    //hàm tạo 1 tham số
    TaiKhoan(int g){
        tenTK = "Thuận";
        soTK = 78981981;
        soDu = g;
    }
    // hàm tạo 2 tham số
    TaiKhoan(int b, int c){
        tenTK = "Văn Thuận";
        soTK = b;
        soDu = c;
    }

    void xuatThongTin(){
        System.out.println("Tên chủ tài khoản: "+tenTK);
        System.out.println("Số tài khoản: "+soTK);
        System.out.println("Số dư trong tài khoản: "+soDu);
    }

    int guiTien(int gui){
        soDu = soDu + gui;
        return soDu;
    }
    int rutTien(int rut){
        soDu = soDu - rut;
        return soDu;
    }
}
