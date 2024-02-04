package Sejal;

import java.text.NumberFormat;
import java.util.Scanner;

 class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        NumberFormat.getCurrencyInstance();
        System.out.println("Welcome to Automated Teller Machine! \nKindly Enter your UserId :");
        String Name = sc.nextLine();
        System.out.println("Kindly Enter your 4-digit Pin :");
        int Pin = sc.nextInt();

        while (true) {
            System.out.println("Welcome");
            System.out.println("ATM Menu:");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to Transfer Amount");
            System.out.println("Choose 5 to EXIT");
            System.out.print("Choose the operation you want to perform : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter amount to be withdrawn :");
                    int withdrawn = sc.nextInt();
                    if (balance >= withdrawn) {
                        balance -= withdrawn;
                        System.out.println("New balance : " + balance + "\nPlease collect your cash and card !");
                    } else {
                        System.out.println("Insufficient Balance...");
                    }
                }
                case 2 -> {
                    System.out.println("Enter amount to be deposited :");
                    int deposits = sc.nextInt();
                    balance += deposits;
                    System.out.println("New balance : " + balance);
                }
                case 3 -> System.out.println("Current Balance :" + balance);
                case 4 -> {
                    System.out.println("Enter Receiver's account number :");
                    double other=sc.nextDouble();
                    System.out.println("Enter amount to be transferred :");
                    int amount= sc.nextInt();
                    if(balance >= amount) {
                        System.out.println("Enter your PIN :");
                        int pin =sc.nextInt();

                        balance -= amount;
                        System.out.println("Amount has been transferred successfully");
                                System.out.println(" Balance:" + balance);

                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                }
                case 5 -> System.exit(0);
            }
            System.out.println("Thank You... Have a nice day !");
        }
    }
}
