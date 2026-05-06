package Singleton;

public class DBManager {

    private static volatile DBManager dbManager;  // eager loading

    private DBManager() {}     // Private contractor

    public static DBManager getDbManager() {

        if (dbManager == null) {

            synchronized (DBManager.class) {
                if (dbManager == null) {     // Double-checking singleton
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }
}
