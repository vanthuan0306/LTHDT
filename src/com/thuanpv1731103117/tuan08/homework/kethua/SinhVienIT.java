package com.thuanpv1731103117.tuan08.homework.kethua;

public class SinhVienIT extends SinhVienGD{
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    // public SinhVienIT(){
        
    // }

    public SinhVienIT(String hoTen, String nganh){
        super(hoTen,"IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml ;
    }
    @Override
    public double getDiem() {
        double diem;
        diem = (2*diemJava + diemHtml + diemCss)/4 ;
        return diem;
    }
}
