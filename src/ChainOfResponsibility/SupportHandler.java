package ChainOfResponsibility;

public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public void setNext(SupportHandler supportHandler) {
        this.nextHandler = supportHandler;
    }

    public void processRequest(SupportTicket supportTicket) {

        if (canHandler(supportTicket)) {
            System.out.println(this.getClass().getSimpleName() + " Resolved ticket : " + supportTicket.getIssue());

        }else if (nextHandler != null) {
            System.out.println(this.getClass().getSimpleName() + " Escalated the ticket : " + supportTicket.getIssue());

        }else {
            System.out.println("Ticket could not be resolved");
        }
    }

    public abstract boolean canHandler(SupportTicket supportTicket);
}