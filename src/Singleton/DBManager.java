package Singleton;

public class DBManager {

    private static DBManager dbManager = new DBManager();

    private DBManager() {}     // Private contractor

    public static DBManager getDbManager() {
        return dbManager;
    }
}
