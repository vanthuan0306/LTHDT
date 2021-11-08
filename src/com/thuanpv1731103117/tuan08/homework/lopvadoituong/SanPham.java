package com.thuanpv1731103117.tuan08.homework.lopvadoituong;

public class SanPham {
    protected int maSp;
    protected String tenSp;
    protected double donGia;
    protected double giamGia;
    protected double thueNhapKhau;

    
    public SanPham(){
        // tenSp = "Máy Tính Dell I5-9700F";
        // donGia = 7000000;
        // giamGia = 0;
        //thueNhapKhau = donGia*10/100;

    }
    public SanPham(int maSp,String tenSp, double donGia, double giamGia, double thueNhapKhau ){
        this.maSp = maSp;
        this.tenSp= tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia; 
    }
    public SanPham(String a, double b, double c){
        tenSp = a;
        donGia = b;
        giamGia = c;
    }
    public SanPham(String x, double y){
        tenSp = x;
        donGia = y;
        giamGia = 0;
       
    }
    
    protected void xuat(){

    }

    protected void nhap (){

    }
    
    
    
    public int getMaSp() {
        return maSp;
    }

    public String getTenSp() {
        return tenSp;
    }
    public double getDonGia() {
        return donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }
    
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    private double getThueNhapKhau() {
        thueNhapKhau = donGia*10/100;
        return thueNhapKhau;
    }
    

    
    protected void xuatThongTin(){
        System.out.println("Tên sản phẩm: "+ getTenSp());
        System.out.println("Đơn giá sản phẩm: " + getDonGia());
        System.out.println("Giá giảm: " +getGiamGia());
        System.out.println("Thuế nhập khẩu: " +getThueNhapKhau());
    }
    

}
