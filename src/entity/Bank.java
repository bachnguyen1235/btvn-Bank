package entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    private static int idAuto = 100;
    private int id;
    private String name;
    private double interestRast;

    public Bank() {
        this.id = idAuto++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInterestRast() {
        return interestRast;
    }

    public void setInterestRast(double interestRast) {
        this.interestRast = interestRast;
    }
public void inputNewBank(){
    System.out.println("nhap name bank:");
    name = new Scanner(System.in).nextLine();
    System.out.println("nhap lai suat");
    while (true){
        try{
            float interestRast = new Scanner(System.in).nextFloat();
            if (interestRast>0){
                this.interestRast = interestRast;
                break;
            }
            throw new InputMismatchException();
        }catch (InputMismatchException e){
            System.out.println("lai xuat la so duong, vui long nhap lai");

        }
    }
}

    @Override
    public String toString() {
        return "entity.Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", interestRast=" + interestRast +
                '}';
    }

    public int getId() {
        return id;
    }
}
