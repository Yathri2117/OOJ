package com.company;

import java.util.Scanner;

 public class account {
    String name;
    int account_number, account_type, option;
    double dbalance = 1000;
    float deposit_amount, withdraw_amount, service_charge = 140;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        name = sc.next();
        System.out.print("\nEnter the type of account:\n1. Savings account\t 2. Current account\n");
        account_type = sc.nextInt();
        System.out.print("\nEnter account number:");
        account_number = sc.nextInt();
    }

    void withdraw_deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nSystem has default balance Rs." + dbalance);
        System.out.print("\nEnter the option!!\n1. Deposit\t2. Withdraw\t 3. Exit");
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.print("\nEnter the amount you want to deposit:");
                deposit_amount = sc.nextFloat();
                dbalance = dbalance + deposit_amount;
                System.out.print("\nYour balance Rs." + dbalance);
                System.out.print("\nEnter the option!!\n 1. Deposit 2. Withdraw 3.Exit\t");
                option = sc.nextInt();
            case 2:
                System.out.print("\nEnter the amount you want to withdraw:");
                withdraw_amount = sc.nextFloat();
                if(withdraw_amount>dbalance){
                    System.out.print("\nInsufficient funds!!");
                }
                else
                dbalance = dbalance - withdraw_amount;
                if (account_type == 2 && dbalance < 1000) {
                    System.out.print("\nYour balance is less than minimum!!\n Services Charge Rs." + service_charge + "applied!!");
                    dbalance = dbalance + service_charge;
                    System.out.print("\nBalance is : Rs." + dbalance);
                } else {
                    System.out.print("\nBalance is : Rs." + dbalance);
                }
            default:return;
        }

    }
     void compound_interest() {
         double ci=0;
         if (account_type == 1) {
             System.out.print("\nCompound interest is available for your type of account would you like to offer??\n1. Yes\t 2. No");
             Scanner sc=new Scanner(System.in);
             int coption=sc.nextInt();
             switch (coption){
                 case 1:System.out.print("\nEnter the principal amount : ");
                     float p=sc.nextFloat();
                     if(p>dbalance)System.out.print("\nYou dont have enough balance!");
                     else{
                     System.out.print("\nEnter annual interest rate:");
                     float r=sc.nextFloat();
                     System.out.print("\nEnter the number of times interest applied per unit period: ");
                     float n=sc.nextFloat();
                     System.out.print("\nEnter the time elapse:");
                     int t=sc.nextInt();
                     ci=p*Math.pow(1+(r/n),n*t);
                     dbalance=dbalance+ci;
                     System.out.print("\nBalance : "+dbalance);}
                 case 2: return;
             }
         }
         else
             System.out.print("\nCompound Interest is not available for your type of account!!");
     }
     void check(){
         if(account_type==2){
             System.out.print("\nCheck facility is available");
         }
         else
         {
             System.out.print("\nCheck facility is not available");
         }
     }
}
    class sav_acct extends account{
     void print(){
         System.out.println();
     }
    }
    class curr_acct extends account{
     void print1(){
         System.out.println();
     }
    }
    class bank{
    public static void main(String args[]){
        account a1=new account();
        sav_acct s1=new sav_acct();
        curr_acct c1=new curr_acct();
        s1.accept();
        s1.print();
        s1.withdraw_deposit();
        s1.compound_interest();
        s1.check();
        c1.accept();
        c1.print1();
        c1.withdraw_deposit();
        c1.compound_interest();
        c1.check();
    }
    }

