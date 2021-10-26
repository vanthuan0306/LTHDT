package com.thuanpv1731103117.tuan06;

public class SquareTestDrive {
    public static void main(String[] args) {
        Square square = new Square();
        if(square.nhapChuot==true){
            square.veHinh();
            square.xoay360Do();
            square.phatAmThanh();  
        } else System.out.println("Chưa nhấp chuột vào hình vuông.");
        
        
    }
    
}
