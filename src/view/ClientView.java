package view;

import entities.Client;

import java.util.Scanner;

public class ClientView implements IOput {

    @Override
    public Client inputInfor() {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.print("nhap ho ten kh: ");
        client.setName(scanner.nextLine());
        System.out.print("nhap dia chi:");
        client.setAddress(scanner.nextLine());
        client.setPhoneNumber(Integer.parseInt(scanner.nextLine())); ;
        System.out.print("nhap loai khach hang: ");
        client.setTypeClient(scanner.nextLine());
        return client;
    }

    @Override
    public void printInfor() {
        Client client = new Client();
        System.out.println("ten kh la: "+client.getName());
        System.out.println("dia chi kh la: "+client.getAddress());
        System.out.println("sdt kh la: "+client.getPhoneNumber());
        System.out.println("loai kh la: "+client.getTypeClient());
    }
}
