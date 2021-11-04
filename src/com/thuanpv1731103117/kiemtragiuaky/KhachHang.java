package com.thuanpv1731103117.kiemtragiuaky;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;

    public KhachHang(){

    }

    public KhachHang(String hoTen, String diaChi, String tenCongTy, double triGiaHoaDon) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }

    public void setTriGiaHoaDon(double triGiaHoaDon) {
        if (triGiaHoaDon < 0) {
            System.out.println("Tri gia hoa don khong am");
        } else {
            this.triGiaHoaDon = triGiaHoaDon;
        }
    }

    public String toString() {
        return "tenCongTy: " + tenCongTy + "triGiaHoaDon: " + triGiaHoaDon;
    }

    public void inKhachHang(){
        System.out.println(hoTen +" "+ diaChi +" "+ tenCongTy +" "+triGiaHoaDon);
    }
}
