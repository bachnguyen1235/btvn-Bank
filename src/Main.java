import entity.Bank;
import entity.Customer;
import entity.SavingAccount;
import entity.SavingAccountManagement;
import service.BankService;
import service.CustomerService;
import service.MenuManagement;
import service.SavingAccoutManagementsService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        MenuManagement menuManagement = new MenuManagement();
        menuManagement.menu();
    }
}