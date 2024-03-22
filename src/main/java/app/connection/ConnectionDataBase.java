package app.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {

    private final String DRIVER = "jdbc:mysql";
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DATABASE = "messages_app_database";
    private final String USER = "root";
    private final String PASSWORD = "Guayacolato";
    private Connection connection = null;

    public Connection getConnection() {

        try {
            this.connection = DriverManager.
                    getConnection(
                            this.DRIVER+"://"+this.HOST+":"+this.PORT+"/"+this.DATABASE,
                            this.USER,
                            this.PASSWORD
                    );
        }catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return this.connection;
    }
}
