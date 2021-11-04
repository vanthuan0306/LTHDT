package com.thuanpv1731103117.kiemtragiuaky;

public class HocVien extends Nguoi{
    protected float diemMonhoc1;
    protected float diemMonhoc2;
    protected int soLuongHV;
    
    public HocVien(){

    }
    public HocVien(String hoTen, String diaChi, float diemMonHoc1, float diemMonhoc2){
        super(hoTen, diaChi);
        this.diemMonhoc1 = diemMonHoc1;
        this.diemMonhoc2 = diemMonhoc2;
    }
    public void setDiemMonHoc1(float diemMonHoc1) {
        if (diemMonHoc1 < 0 || diemMonHoc1 > 10) {
            System.out.println("Diem mon hoc khong am, khong lon hon 10");
        } else {
            this.diemMonhoc1 = diemMonHoc1;
        }
    }   

    public float diemTrungBinh(){
        return (diemMonhoc1+diemMonhoc2)/2;
    }

    public String toString(){
        return hoTen + "    " + diaChi + "   " + diemTrungBinh();
    }
    

    public void inSinhVien(){
        System.out.println(hoTen +" "+ diaChi +" - điểm môn 1: "+ diemMonhoc1 +" - điểm môn 2: "+ diemMonhoc2 +" - điểm trung bình: "+ diemTrungBinh());
    }
}
