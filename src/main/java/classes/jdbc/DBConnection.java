package classes.jdbc;

import classes.Punk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DB_URL = System.getenv("DB_URL"); // environment variables
    private static final String DB_USER = System.getenv("DB_USER");
    private static final String DB_PASSWORD = System.getenv("DB_PASS");
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

    private static final Logger logger = LogManager.getLogger(DBConnection.class);

    public static Connection getConnection() throws SQLException {
        Connection conn = null;

        try {
            // Registering JDBC driver
            Class.forName(DB_DRIVER);

            // Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            if (conn != null) {
                logger.info("Successfully connected to the database.");
            } else {
                logger.error("Failed to connect to the database.");
            }
        } catch (Exception e) {
            logger.error("Error connecting to the database: ", e);
            throw new SQLException("Error establishing a connection to the database.", e); // Lanza la excepción
        }

        return conn;
    }
}
