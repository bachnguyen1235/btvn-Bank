package service;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private  List<Customer> customers = new ArrayList<>();
    private  void showCustomer() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    private  void inputCustomer() {
        System.out.println("ban muon them moi bn khach hang:");
        int customerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("nhap thong tin cho kh thu " + (i + 1));
            Customer customer = new Customer();

            customer.inputNewCustomer();
            customers.add(customer);
        }
    }

}
