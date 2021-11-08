package com.thuanpv1731103117.tuan08.homework.kethua;

public class Vuong extends ChuNhat{
    public Vuong(double canh){
		super(canh, canh);
	}

	public void xuat(){
		System.out.println("Cạnh: " + getDai());
		System.out.println("Chu vi hình vuông : " + getChuVi());
		System.out.println("Diện tích hình vuông : " + getDienTich());
    }
}
