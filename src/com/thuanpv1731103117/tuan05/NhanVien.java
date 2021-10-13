package com.thuanpv1731103117.tuan05;

public class NhanVien {
    
    String tenNV;
    double luong;
    String ngaySinh;
    String diaChi;
    String boPhan;

    //methood - function
    //hàm tạo mặc định
    NhanVien(){
        tenNV = "Phạm Văn Thuận";
        ngaySinh = "03/06/1999";
        diaChi = "Q.Ngãi";
        boPhan = "Lao Công";
        luong = 150000;
    }

    //hàm tạo 1 tham số
    NhanVien(Double a){
        tenNV = "Phạm Văn Thuận";
        ngaySinh = "03/06/1999";
        diaChi = "Q.Ngãi";
        boPhan = "Bảo vệ";
        luong = a;
    }

    void xuatThongTin(){
        System.out.println("Tên nhân viên: "+tenNV);
        System.out.println("Ngày sinh: "+ngaySinh);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Bộ phận làm việc: "+boPhan);
        System.out.println("Lương: "+luong);
    }

    double tinhLuong(int thang){
        double tien;
        tien = thang*luong;
        return tien;
    } 
}
