package com.thuanpv1731103117.tuan08.homework.kethua;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVienIT it =new SinhVienIT("hoTen", "IT");
        it.getDiem();
        it.getHocLuc();
        SinhVienKT kt =new SinhVienKT("hoTen",9,9);
        kt.getDiem();
        kt.getHocLuc();
    }
}
