package Singleton;

public class Main {

    public static void main(String[] args) {

        DBManager dbManager = DBManager.getDbManager();   // called class method , not a object
        DBManager dbManager1 = DBManager.getDbManager();

        System.out.println(dbManager);   //Singleton.DBManager@8efb846      same hashcode
        System.out.println(dbManager1);  //Singleton.DBManager@8efb846
    }
}
