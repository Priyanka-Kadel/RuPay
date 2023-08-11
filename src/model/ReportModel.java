package model;
public class ReportModel {

    private String rec;
    private String issue;
    private String mode;
    private String recieve_from;
    

    public ReportModel(String rec, String issue, String mode, String recieve_from) {
        this.rec = rec;
        this.issue = issue;
        this.mode = mode;
        this.recieve_from = recieve_from;
        
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getReceive() {
        return recieve_from;
    }

    public void setReceive(String recieve) {
        this.recieve_from = recieve_from;
    }
    
}
