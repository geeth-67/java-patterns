package Singleton;

public class Main {

    public static void main(String[] args) {

        DBManager dbManager = DBManager.getDbManager();   // called class method , not an object
        DBManager dbManager01 = DBManager.getDbManager();

        System.out.println(dbManager);   // Singleton.DBManager@8efb846      same hashcode
        System.out.println(dbManager01);  // Singleton.DBManager@8efb846
    }
}