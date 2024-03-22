package app.data;

import app.connection.ConnectionDataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MessageDAO {

    private static Connection connection;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static void createMessage(MessageModel message) {

        try {

            String query = "INSERT INTO messages(message_body, message_author, ) VALUES (?,?)";

            connection = new ConnectionDataBase().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, message.getMessageBody());
            ps.setString(2, message.getMessageAuthor());
            ps.executeUpdate();

            System.out.println("Message created successfully");

        }catch (SQLException e) {

            System.out.println("Exception: " + e.getMessage());

        }finally {

            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static void getAllMessages() {

        try {

            String query = "SELECT * FROM messages";

            connection = new ConnectionDataBase().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            ArrayList<MessageModel> messages = new ArrayList<>();

            while (rs.next())
                messages.add(new MessageModel(
                        rs.getInt("message_id"),
                        rs.getString("message_body"),
                        rs.getString("message_author"),
                        rs.getString("creation_date")
                ));

            messages.forEach(System.out::println);

        }catch (SQLException e) {

            System.out.println("Exception: " + e.getMessage());

        }finally {

            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static void deleteMessage(Integer messageId) {

        try {

            String query = "DELETE FROM messages WHERE message_id = ?";

            connection = new ConnectionDataBase().getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, messageId);
            ps.executeUpdate();

            System.out.println("Message has been deleted!");

        }catch (SQLException e) {

            System.out.println("Exception: " + e.getMessage());

        }finally {

            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static void updateMessage(MessageModel message) {

        try {

            String query = "UPDATE messages SET message_body = ? WHERE message_id = ?";

            connection = new ConnectionDataBase().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, message.getMessageBody());
            ps.setInt(2, message.getMessageId());
            ps.executeUpdate();

            System.out.println("Message has been update successfully");

        }catch (SQLException e) {

            System.out.println("Exception: " + e.getMessage());

        }finally {

            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
