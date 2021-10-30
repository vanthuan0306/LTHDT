package com.thuanpv1731103117.tuan08.homework;

public class SanPham {
    protected String tenSp;
    protected double donGia;
    protected double giamGia;
    protected double thueNhapKhau;

    protected void xuat(){

    }

    protected void nhap (){

    }
    public SanPham(){
        tenSp = "Máy Tính Dell I5-9700F";
        donGia = 7000000;
        giamGia = 0;
        thueNhapKhau = donGia*10/100;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }
    
    protected void xuatThongTin(){
        System.out.println("Tên sản phẩm: "+ tenSp);
        System.out.println("Đơn giá sản phẩm: " + donGia);
        System.out.println("Giá giảm: " +giamGia);
        System.out.println("Thuế nhập khẩu: " +getThueNhapKhau());
    }
}
