package app.connection;

import java.sql.DriverManager;

public class Connection {

    private final String DRIVER = "jdbc:mysql";
    private final String HOST = "localhost";
    private final String PORT = "localhost";


    public Conec getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(this.DRIVER+"://"+this.HOST+":"+this.PORT);
        }catch (Exception e) {

        }
    }
}
