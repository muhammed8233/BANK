package org.example;

import Bank.Account;
import Bank.Bank;
import Bank.TYPE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();
         Bank bank = new Bank();

         int user = 1;
        while (user <= 6) {
            System.out.println("Welcome To Zenith Bank!");
            System.out.println("""
                    1 Create Account
                    2 Deposit
                    3 Withdraw
                    4 transfer
                    5 Balance inquiry
                    6 Exit
                    """);
             user = input.nextInt();

            if (user == 1) {
                System.out.println("Please Enter Account Name");
                String name = input.next();
                System.out.println("Please Enter Account Number");
                String accountNumber = input.next();
                System.out.println("Please Enter Account Type");
                TYPE type = TYPE.valueOf(input.next());
                bank.setCreateAccount(name, accountNumber, type, account.getBalance());
                System.out.println(bank.getCreateAccount());
                System.out.println();
            }

            if (user == 2) {
                System.out.println("Please Enter deposit Amount");
                account.deposit(input.nextDouble());
                System.out.println();

            }else if (user == 3) {
                System.out.println("Please Enter Amount to withdraw");
                account.withdraw(input.nextDouble());
                System.out.println();

            }else if (user == 4) {

            } else if (user == 5) {
                System.out.println("your account balance is: $" + account.getBalance());
                System.out.println();

            } else if (user == 6) {
                System.exit(700);
            }
        }
    }
}