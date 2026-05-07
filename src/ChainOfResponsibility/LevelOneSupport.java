package ChainOfResponsibility;

public class LevelOneSupport extends SupportHandler{

    @Override
    public boolean canHandler(SupportTicket supportTicket) {
        return supportTicket.getSeverity() == 1;
    }
}