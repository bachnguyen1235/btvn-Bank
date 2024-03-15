package service;

import entities.Bank;
import view.BankView;

import java.util.ArrayList;

public class BankService {
    public ArrayList<Bank> inputBanks(ArrayList<Bank>banks, BankView bankView){
        for (Bank item: banks){
            banks.add(bankView.inputInfor());
        }
        return banks;
    }
}
