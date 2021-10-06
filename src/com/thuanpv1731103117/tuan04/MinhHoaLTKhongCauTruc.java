package com.thuanpv1731103117.tuan04;

public class MinhHoaLTKhongCauTruc {
    public static void main(String[] args) {
        int account_number = 20;
        int account_balance = 100;

        account_balance = account_balance + 100;
        System.out.println("Account number: " +account_number);
        System.out.println("Account balance: " +account_balance);

        account_balance = account_balance - 50;
        System.out.println("Account number: " +account_number);
        System.out.println("Account balance: " +account_balance);

        account_balance = account_balance - 10;
        System.out.println("Account number: " +account_number);
        System.out.println("Account balance: " +account_balance);
    }
}
