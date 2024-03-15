package view;

import entities.Bank;
import entities.Client;

import java.util.Scanner;

public class BankView implements IOput{
    @Override
    public Client inputInfor() {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("nhap ten nh:");
        bank.setName(scanner.nextLine());
        System.out.println("nhap lai suat tien gui:");
        bank.setInterestRrate(scanner.nextDouble());
        return bank;
    }

    @Override
    public void printInfor() {
        Bank bank = new Bank();
        System.out.println("ten hn la: "+bank.getName());
        System.out.println("lai suat la: "+bank.getInterestRrate());
    }
}
