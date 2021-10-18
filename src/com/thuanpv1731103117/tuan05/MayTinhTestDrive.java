package com.thuanpv1731103117.tuan05;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mayTinh = new MayTinh();
        mayTinh.xuatThongTin();
        System.out.print("Tổng tiền là: " +mayTinh.tinhTien(2));
        System.out.println(" triệu đồng");
        
        mayTinh = new MayTinh(21);
        mayTinh.xuatThongTin();
        System.out.print("Tổng tiền là: " +mayTinh.tinhTien(3));
        System.out.println(" triệu đồng");

        mayTinh = new MayTinh(16,30);
        mayTinh.xuatThongTin();
        System.out.print("Tổng tiền là: " +mayTinh.tinhTien(1));
        System.out.println(" triệu đồng");
    }
    
}
