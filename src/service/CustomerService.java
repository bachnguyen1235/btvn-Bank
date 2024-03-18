package service;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();


    public void showCustomer() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }


    public void inputCustomer() {
        System.out.println("ban muon them moi bn khach hang:");
        int customerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("nhap thong tin cho kh thu " + (i + 1));
            Customer customer = new Customer();

            customer.inputNewCustomer();
            customers.add(customer);
        }
    }
    public Customer findById(int customerID){
        for (int j = 0; j < customers.size(); j++) {
            if (customerID == customers.get(j).getId()) {
                return customers.get(j);
            }

        }
        return null;
    }

}
