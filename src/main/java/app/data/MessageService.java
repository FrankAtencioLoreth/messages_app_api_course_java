package app.data;

import java.util.Scanner;

public class MessageService {

    private static Scanner scanner = new Scanner(System.in);

    public static void createMessageService() {
        System.out.println("Whrite your message: ");
        String messageBody = scanner.nextLine();
        System.out.println("Message's author: ");
        String messageAuthor = scanner.nextLine();

        MessageModel messageModel = new MessageModel();
        messageModel.setMessageBody(messageBody);
        messageModel.setMessageAuthor(messageAuthor);

        MessageDAO.createMessage(messageModel);
    }

    public static void listMessageService() {
        MessageDAO.getAllMessages();
    }

    public static void updateMessageService() {

        System.out.println("Whrite a new message: ");
        String messageBody = scanner.nextLine();

        System.out.println("Whrite message id to update: ");
        Integer messageId = scanner.nextInt();

        MessageModel messageModel = new MessageModel();
        messageModel.setMessageBody(messageBody);
        messageModel.setMessageId(messageId);

        MessageDAO.updateMessage(messageModel);
    }

    public static void deleteMessageService() {
        System.out.println("Whrite message id to delete: ");
        Integer id = scanner.nextInt();
        MessageDAO.deleteMessage(id);
    }
}
