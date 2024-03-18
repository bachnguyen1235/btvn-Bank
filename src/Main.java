import entity.Bank;
import entity.Customer;
import entity.SavingAccount;
import entity.SavingAccountManagement;
import statics.CustomerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<SavingAccountManagement> savingAccountManagements = new ArrayList<>();


    public static void main(String[] args) {
        menu();

    }


    private static void menu() {
        while (true) {
            showConten();
            int featureChoose = new Scanner(System.in).nextInt();
            switch (featureChoose) {
                case 1:
                    inputCustomer();
                    break;
                case 2:
                    showCustomer();
                    break;
                case 3:
                    inputBank();
                    break;
                case 4:
                    showBank();
                    break;
                case 5:
                    creatSavingAccount();
                    break;
                case 6:
                    showSavingAccountManagements();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;
            }
        }
    }

    private static void showSavingAccountManagements() {
        savingAccountManagements.forEach(System.out::println);
    }

    private static void creatSavingAccount() {
        System.out.println("co bao nhieu kh muon gui tiet kiem: ");
        int customerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("nhap thong tin gui tiet kiem cho kh thu: " + (i + 1));
            System.out.println("nhap ma kh:");
            Customer customer = null;
            int customerID ;
            while (true){
                customerID = new Scanner(System.in).nextInt();
                for (int j = 0; j < customers.size(); j++) {
                    if (customerID == customers.get(j).getId()) {
                        customer = customers.get(j);
                        break;
                    }

                }
                if (customer != null){
                    break;
                }
                System.out.println("ma kh ko ton tai, hay nhap lai");
            }
            System.out.println("nhap so luong ngan hang gui tiet kiem:");
            int bankNumber = new Scanner(System.in).nextInt();
            List<SavingAccount> savingAccounts = new ArrayList<>();
            for (int j = 0; j < bankNumber; j++) {
                System.out.println("nhap thong tin cho so: "+(j+1));
                System.out.println("nhap ma ngan hang muon gui:");
                Bank bank = null;
                int bankID ;
                while (true){
                    customerID = new Scanner(System.in).nextInt();
                    for (int f = 0; f < customers.size(); f++) {
                        if (customerID == customers.get(f).getId()) {
                            customer = customers.get(f);
                            break;
                        }

                    }
                    if (customer != null){
                        break;
                    }
                    System.out.println("ma bank ko ton tai, hay nhap lai");
                }

                System.out.println(" nhap so tien muon gui o ngan hang nay");
                double money = new Scanner(System.in).nextInt();
                SavingAccount savingAccount = new SavingAccount(bank,money);
                savingAccounts.add(savingAccount);
                
            }
            SavingAccountManagement savingAccountManagement = new SavingAccountManagement(customer,savingAccounts);
        }
    }




    private static void showConten() {
        System.out.println("-------phan men quan li so tiet kiem--------");
        System.out.println("1. them moi kh:");
        System.out.println("2. hien thi danh sach kh dang co: ");
        System.out.println("3. them moi ngan hang: ");
        System.out.println("4. hien thi danh sach ngan hang:");
        System.out.println("5. lap so tiet kiem:");
        System.out.println("6. hien thi dang sach so tiet kiem:");
        System.out.println("7. sap xep danh sach so tiet kiem:");
        System.out.println("8. lap bang thong ke tien gui:");
        System.out.println("9. exit");
        System.out.println("moi chon chuc nang: ");
    }
}