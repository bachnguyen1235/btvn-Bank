package entity;

import java.util.List;

public class SavingAccountManagement {
    private Customer customer;
    private List<SavingAccount> savingAccounts;

    public SavingAccountManagement(Customer customer, List<SavingAccount> savingAccounts) {
        this.customer = customer;
        this.savingAccounts = savingAccounts;
    }
}
