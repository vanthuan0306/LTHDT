package com.thuanpv1731103117.tuan04;

public class MinhHoaLapTrinhCoCauTruc {
    public static void main(String[] args) {
        int account_number = 20;
        int account_balance = 100;

        account_balance = account_balance + 100;
        Show_Balance(account_number,account_balance);
        account_balance = account_balance - 20;
        Show_Balance(account_number,account_balance);
    }

    private static void Show_Balance(int account_number, int account_balance) {
        System.out.println("Account number: " +account_number);
        System.out.println("Account balance: " +account_balance);

    }
    
}
