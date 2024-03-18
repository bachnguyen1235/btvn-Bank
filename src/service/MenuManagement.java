package service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManagement {
    private final CustomerService customerService = new CustomerService();
    private final BankService bankService = new BankService();
    private final SavingAccoutManagementsService savingAccoutManagementsService = new SavingAccoutManagementsService(customerService, bankService);
    public void menu() {

        while (true) {
            showConten();
            int featureChoose = chooseFeature();
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
private int chooseFeature(){
    int featureChoose ;
    while (true){
        try{
            featureChoose = new Scanner(System.in).nextInt();
            if (featureChoose>0&&featureChoose<9){
                break;
            }
            throw new InputMismatchException();
        }catch (InputMismatchException e){
            System.out.println("chuc nang ko hop le, vui long nhap lai");

        }
    }
    return featureChoose;
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
