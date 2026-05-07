package ChainOfResponsibility;

public class LevelTwoSupport extends SupportHandler{

    @Override
    public boolean canHandler(SupportTicket supportTicket) {
        return supportTicket.getSeverity() == 2;
    }
}