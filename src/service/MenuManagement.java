package service;

import java.util.Scanner;

public class MenuManagement {
    private final SavingAccoutManagementsService savingAccoutManagementsService = new SavingAccoutManagementsService(customerService, bankService);
    private final CustomerService customerService = new CustomerService();
    private final BankService bankService = new BankService();
    public void menu() {

        while (true) {
            showConten();
            int featureChoose = new Scanner(System.in).nextInt();
            switch (featureChoose) {
                case 1:
                    customerService.inputCustomer();
                    break;
                case 2:
                    customerService.showCustomer();
                    break;
                case 3:
                    bankService.inputBank();
                    break;
                case 4:
                    bankService.showBank();
                    break;
                case 5:
                    savingAccoutManagementsService.creatSavingAccount();
                    break;
                case 6:
                    savingAccoutManagementsService.showSavingAccountManagements();
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

    private void showConten() {
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
