package com.thuanpv1731103117.kiemtragiuaky;

public class NhanVien extends Nguoi {
    private float heSoLuong;

    public NhanVien(){

    }

    public NhanVien(String hoTen, String diaChi, float heSoLuong) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }

    protected float tinhLuong() {
        return heSoLuong * 1500000;
    }

    public String toString() {
        return "heSoLuong: " + heSoLuong + ", tinhLuong = " + tinhLuong();
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        if (heSoLuong < 0) {
            System.out.println("He so luong khong am");
        } else {
            this.heSoLuong = heSoLuong;
        }
    }
    public void inNhanVien(){
        System.out.print(hoTen +" "+ diaChi +" "+ tinhLuong());
    }

}
