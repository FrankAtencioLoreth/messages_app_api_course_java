package app.main;

import app.connection.ConnectionDataBase;
import app.data.MessageService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {

            System.out.println("----APPLICATION MESSAGE MENU ----");
            System.out.println("1 - Create a new meesage");
            System.out.println("2 - To list meesages");
            System.out.println("3 - Update a meesage");
            System.out.println("4 - Delete a meesages");
            System.out.println("5 - Exit");
            System.out.print("Your option: ");
            option = scanner.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    MessageService.createMessageService();
                    break;
                case 2:
                    MessageService.listMessageService();
                    break;
                case 3:
                    MessageService.updateMessageService();
                    break;
                case 4:
                    MessageService.deleteMessageService();
                    break;
                default:
                    break;
            }

        } while(option!=5);

    }
}
