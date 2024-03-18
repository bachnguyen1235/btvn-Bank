package entity;

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
    interestRast = new Scanner(System.in).nextDouble();
}

    @Override
    public String toString() {
        return "entity.Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", interestRast=" + interestRast +
                '}';
    }
}
