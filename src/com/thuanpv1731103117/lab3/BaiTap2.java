package com.thuanpv1731103117.lab3;

public class BaiTap2 {
    public static void main(String[] args) {
        int x = 8;
        for(int i=1;i<=9;i++){
            System.out.printf("%d * %d = %d", x, i, x*i); 
            System.out.println();
            for(int j=1;j<=10;j++){
                System.out.printf("%d * %d = %d", i, j, i*j);
                System.out.println();
            }
        }
    }
}
