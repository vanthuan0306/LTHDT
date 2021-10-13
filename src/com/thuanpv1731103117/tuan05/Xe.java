package com.thuanpv1731103117.tuan05;

public class Xe {
    
    //attribute - thuộc tính
    String tenChuXe;
    String dongXe;
    String hangSX;
    double giayPhep;
    double dtXang;

    //methood - function
    //hàm tạo mặc định
    Xe(){
        tenChuXe = "Phạm Văn Thuận";
        dongXe = "Xe côn tay";
        hangSX = "Yamaha";
        giayPhep = 2019;
        dtXang = 2.25;
    }

    // hàm tạo 1 tham số
    Xe(double a){
        tenChuXe = "Văn Thuận";
        dongXe = "Xe ga";
        hangSX = "Honda";
        giayPhep = 2020;
        dtXang = a;
    }

    //hàm tạo 2 tham số
    Xe(double x , double y){
        tenChuXe = "Thuận";
        dongXe = "Xe số";
        hangSX = "Suzuki";
        giayPhep = x;
        dtXang = y;
    }

    void xuatThongTin(){
        System.out.println("Tên chủ xe: "+tenChuXe);
        System.out.println("Dòng xe: "+dongXe);
        System.out.println("Hãng xe: "+hangSX);
        System.out.print("Giấy phép sản xuất: Năm "+giayPhep);
        System.out.print("Dung tích bình xăng: "+dtXang);
        System.out.println(" lít");
    }
}
