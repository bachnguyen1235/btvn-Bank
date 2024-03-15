package view;

import entities.Client;

import java.util.Scanner;

public interface IOput {
Scanner scanner = new Scanner(System.in);
    Client inputInfor();
    void printInfor();
}
