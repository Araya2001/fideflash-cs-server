package fideflash.cs.server.config;

public enum DBConfig {
    MYSQL_LOCALHOST_CONFIG("localhost", "3306", "fideflash", "root", "password");

    private static final String MYSQL_JDBC_ID = "mysql";
    private final String host;
    private final String tcpPort;
    private final String dbName;
    private final String builtUrl;

    private final String username;

    private final String password;

    DBConfig(String host, String tcpPort, String dbName, String username, String password) {
        this.host = host;
        this.tcpPort = tcpPort;
        this.dbName = dbName;
        this.username = username;
        this.password = password;
        this.builtUrl = buildUrl(host, tcpPort, dbName);
    }

    private String buildUrl(String host, String tcpPort, String dbName) {
        return new StringBuffer()
                .append("jdbc:")
                .append(MYSQL_JDBC_ID)
                .append("://")
                .append(host)
                .append(":")
                .append(tcpPort)
                .append("/")
                .append(dbName)
                .toString();
    }

    public String getHost() {
        return host;
    }

    public String getTcpPort() {
        return tcpPort;
    }

    public String getDbName() {
        return dbName;
    }

    public String getBuiltUrl() {
        return builtUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
