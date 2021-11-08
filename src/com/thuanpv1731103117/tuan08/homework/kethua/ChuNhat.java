package com.thuanpv1731103117.tuan08.homework.kethua;

public class ChuNhat {
    private double rong;
	private double dai;

	public void setDai(double dai) {
		this.dai = dai;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	public double getDai() {
		return dai;
	}
	public double getRong() {
		return rong;
	}
	public ChuNhat(double rong, double dai) {
		this.rong = rong;
		this.dai = dai;
	}

	protected double getChuVi() {
		return (dai + rong) * 2;
	}

	protected double getDienTich(){
		return dai * rong;
	}

	public void xuat(){
		System.out.println("Chiêu dài: " +dai);
		System.out.println("Chiều rộng: " +rong);
		System.out.println("Chu vi hcn = " + getChuVi());
		System.out.println("Diện tích hcn = " + getDienTich());
	}
}
