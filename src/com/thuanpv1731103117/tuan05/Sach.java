package com.thuanpv1731103117.tuan05;

public class Sach {
    
    //attribute - thuộc tính
    String nhaXuatBan;
    double namXuatBan;
    double giaBan;
    String loai;

    //methood - function
    //hàm tạo mặc định
    Sach(){
        loai = "Sách Khoa Học";
        nhaXuatBan = "NXB Văn Hóa Nghệ Thuật";
        namXuatBan = 1998;
        giaBan = 50000;
    }
    //hàm tạo 1 tham số
    Sach(double a){
        loai = "Sách Giáo Dục";
        nhaXuatBan = "NXB Văn Học";
        namXuatBan = 1999;
        giaBan = a;
    }
    //hàm tạo 2 tham số
    Sach(double m, double n){
        loai = "Sách tuổi trẻ";
        nhaXuatBan = "NXB Tuổi trẻ";
        namXuatBan = m;
        giaBan = n;
    }

    void gioiThieuSach(){
        System.out.println("Loại Sách: "+loai);
        System.out.println("Nhà xuất bản: "+nhaXuatBan);
        System.out.println("Năm xuất bản: "+namXuatBan);
        System.out.println("Giá bán: "+giaBan);
    }

    double thanhTien(int soLuong){
        double tien;
        tien = soLuong*giaBan;
        return tien;
    }

}
