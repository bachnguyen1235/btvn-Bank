import service.InputService;
import view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputService inputService = new InputService();
        Menu menu = new Menu();
        menu.menu(scanner,inputService);
    }
}