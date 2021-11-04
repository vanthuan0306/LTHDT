package com.thuanpv1731103117.kiemtragiuaky;

public class Nguoi {
    protected String hoTen;
    protected String diaChi;

    public Nguoi(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public Nguoi() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String toString() {
        return "hoTen: " + hoTen + ", diaChi: " + diaChi;
    }
    
}
