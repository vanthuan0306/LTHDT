package com.thuanpv1731103117.tuan05;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.xuatThongTin();
        System.out.println("Tiền lương của nhân viên là: "+nhanVien.tinhLuong(28)+ " triệu đồng.");

        nhanVien = new NhanVien((double) 200000);
        nhanVien.xuatThongTin();
        System.out.println("Tiền lương của nhân viên là: "+nhanVien.tinhLuong(30)+ " triệu đồng.");
    }
}
