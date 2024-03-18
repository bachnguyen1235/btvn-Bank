package entity;

import statics.CustomerType;

import java.util.Scanner;

public class Customer {
    private static int idAuto = 10000;
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private CustomerType type;

    public Customer() {
        this.id = idAuto++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public void inputNewCustomer() {
        System.out.println("nhap ten: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("nhap dia chi: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("nhap sdt: ");
        this.setPhoneNumber(new Scanner(System.in).nextLine());
        System.out.println("chon loai kh: ");
        System.out.println("1, kh ca nhan");
        System.out.println("2. kh tap the");
        System.out.println("3. kh doanh nghiep");
        System.out.println("moi chon");
        int customerTypeChoose = new Scanner(System.in).nextInt();
        switch (customerTypeChoose) {
            case 1:
                this.setType(CustomerType.PERSONAL);
                break;
            case 2:
                this.setType(CustomerType.GROUP);
                break;
            case 3:
                this.setType(CustomerType.ENTERPRISE);
                break;
        }
    }

    @Override
    public String toString() {
        return "entity.Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", type='" + type.value + '\'' +
                '}';
    }
}
