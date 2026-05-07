package ChainOfResponsibility;

public class LevelThreeSupport extends SupportHandler{

    @Override
    public boolean canHandler(SupportTicket supportTicket) {
        return supportTicket.getSeverity() == 3;
    }
}