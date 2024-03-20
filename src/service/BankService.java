package service;

import entity.Bank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankService {
    private static List<Bank> banks = new ArrayList<>();

    public void showBank() {
        banks.forEach(System.out::println);
    }

    public void inputBank() {
        System.out.println("ban muon them moi bn bank:");
        int bankNumber  ;
        while (true){
            try{
                bankNumber = new Scanner(System.in).nextInt();
                if (bankNumber>0){
                    break;
                }
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.println("vui long nhap so duong, vui long nhap lai");

            }
        }
        for (int i = 0; i < bankNumber; i++) {
            System.out.println("nhap thong tin cho bank thu " + (i + 1));
            Bank bank = new Bank();

            bank.inputNewBank();
            banks.add(bank);
        }
    }


    public Bank findByID(int bankId) {
        for (int f = 0; f < banks.size(); f++) {
            if (bankId == banks.get(f).getId()) {
                return banks.get(f);
            }
        }
        return null;
    }
}
