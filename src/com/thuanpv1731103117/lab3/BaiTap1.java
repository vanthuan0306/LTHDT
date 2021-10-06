package com.thuanpv1731103117.lab3;

import java.util.Scanner;

public class BaiTap1 {
    
    // số nguyên tố
    public static void main(String[] args) {
        System.out.print("Nhập một số N : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        checksnt(N);   
    }
    public static void checksnt(int n){
        boolean ok = true;
        for(int i = 2 ; i < n - 1 ; i++){
            if(n % i == 0){
                ok = false;
                break;
            }
        }
        if(ok == true){
            System.out.print("Đây là số nguyên tố");
        }
        else{
            System.out.print("Đây không là số nguyên tố");
        }
    }
}
