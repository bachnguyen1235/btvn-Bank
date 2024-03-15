package service;

import java.util.Scanner;

public class InputService {
    public int checkInputNumber(Scanner scanner, int min, int max){
        int pick = 0;
        while (true) {
            try {
                pick = Integer.parseInt(scanner.nextLine());
                if (pick >= min && pick <= max)
                    break;
                else
                    System.out.println("chi dc chon tu "+min+" den "+max);
            } catch (NumberFormatException e) {
                System.out.println("phai nhap so nguyen");
            }
        }
        return pick;
    }
}
