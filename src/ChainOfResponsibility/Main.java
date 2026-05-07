package ChainOfResponsibility;

public class Main {

    public static void main(String[] args) {

        SupportHandler l1 = new LevelOneSupport();
        SupportHandler l2 = new LevelTwoSupport();
        SupportHandler l3 = new LevelThreeSupport();

        l1.setNext(l2);
        l2.setNext(l3);


        SupportTicket wifiTicket = new SupportTicket("INC-001" , "Wifi issue" , 2);
        SupportTicket printerTicket = new SupportTicket("INC-002", "Printer not working", 1);
        SupportTicket networkTicket = new SupportTicket("INC-003", "Network connection failed", 3);
        SupportTicket emailTicket = new SupportTicket("INC-004", "Email login problem", 3);


        l1.processRequest(wifiTicket);
        l1.processRequest(printerTicket);
        l1.processRequest(networkTicket);
        l1.processRequest(emailTicket);

    }
}
