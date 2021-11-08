package com.thuanpv1731103117.tuan08.homework.kethua;

public class SinhVienKT extends SinhVienGD{
    private double diemMarketing;
    private double diemSales;

    // public SinhVienKT(){
        
    // }

    public SinhVienKT(String hoTen,double diemMarketin,double diemSales){
        super(hoTen,"KT");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
        
    }
    public double getDiem(){
        return(2* diemMarketing+ diemSales)/3;
}
    
}
