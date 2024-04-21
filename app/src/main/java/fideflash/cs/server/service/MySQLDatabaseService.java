package fideflash.cs.server.service;

import fideflash.cs.server.config.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLDatabaseService implements DatabaseService {

    private static final DBConfig MYSQL_DB_CONFIG = DBConfig.MYSQL_LOCALHOST_CONFIG;

    @Override
    public Connection createNewConnection() {
        try {
            return DriverManager.getConnection(MYSQL_DB_CONFIG.getBuiltUrl(), MYSQL_DB_CONFIG.getUsername(), MYSQL_DB_CONFIG.getPassword());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }


}
