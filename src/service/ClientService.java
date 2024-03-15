package service;

import entities.Client;
import view.BankView;
import view.ClientView;

import java.util.ArrayList;

public class ClientService {
    public ArrayList<Client> inputClient(ArrayList<Client> clients, ClientView clientView) {
        for (Client item : clients) {
            clients.add(clientView.inputInfor());
        }
        return clients;
    }
}
