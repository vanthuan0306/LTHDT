package com.thuanpv1731103117.kiemtragiuaky;

public class QuanLyTestDrive {
  public static void main(String[] args) {
      System.out.println("Thông tin học viên");
      HocVien hocVien = new HocVien("Phạm Văn Thuận", "Quảng Ngãi", 8, 9);
      hocVien.inSinhVien();
      System.out.println("");

      System.out.println("Thông tin khách hàng");
      KhachHang khachHang = new KhachHang("Nguyễn Văn A", "Sơn Tịnh", "Công Ty TNHH MTV", 170000);
      khachHang.inKhachHang();
      System.out.println("");

      System.out.println("Thông tin nhân viên");
      NhanVien nhanVien = new NhanVien("Nhân Viên 1", "HCM", 150000);
      nhanVien.inNhanVien();
  }
    
}
