package com.thuanpv1731103117.tuan05;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan taiKhoan;

        
        taiKhoan = new TaiKhoan();
        taiKhoan.xuatThongTin();
        taiKhoan.guiTien(500);
        taiKhoan.xuatThongTin();
        taiKhoan.rutTien(200);
        taiKhoan.xuatThongTin();

        taiKhoan = new TaiKhoan(320000);
        taiKhoan.xuatThongTin();
        taiKhoan.guiTien(100000);
        taiKhoan.xuatThongTin();
        taiKhoan.rutTien(20000);
        taiKhoan.xuatThongTin();

        taiKhoan = new TaiKhoan(19021234,540100);
        taiKhoan.xuatThongTin();
        taiKhoan.guiTien(50000);
        taiKhoan.xuatThongTin();
        taiKhoan.rutTien(20000);
        taiKhoan.xuatThongTin();
    }
}
