package ChainOfResponsibility;

public class SupportTicket {

    private String id;
    private String issue;
    private int severity;
    private boolean resolved;

    public SupportTicket( String id , String issue , int severity) {

        this.id = id;
        this.issue = id;
        this.severity = severity;
        this.resolved = false;
    }

    public String getId() {
        return id;
    }

    public String getIssue() {
        return issue;
    }

    public int getSeverity() {
        return severity;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void markResolved() {
        this.resolved = true;
    }
}