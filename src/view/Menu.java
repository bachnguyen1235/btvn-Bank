package view;

import service.InputService;

import java.util.Scanner;

public class Menu {
    public void menu(Scanner scanner, InputService inputService,){
        System.out.println("hay nhap lua chon cua ban: ");
        System.out.println("1. nhap kh");
        System.out.println("2. nhap bank");
        int choose= inputService.checkInputNumber(scanner,1,2);
        switch (choose){
            case 1:

        }
    }
}
