package fideflash.cs.server.service;

import fideflash.cs.server.config.DBConfig;

import java.sql.Connection;

public interface DatabaseService {
    Connection createNewConnection();

    default Boolean closeConnection(Connection connection){
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                return Boolean.TRUE;
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        return Boolean.FALSE;
    }
}
