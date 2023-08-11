package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddModel {

    private String rec;
    private String issue;
    private String mode;
    private String recieve_from;
    private String ch_no;
    private String bank;
    private String from;
    private String to;
    private String course;
    private String fee;
    private String vat;
    private String discount;
    private String total;
    private String remarks;

    public AddModel(String rec, String issue, String mode, String recieve_from, String ch_no, String bank, String from, String to, String course, String fee, String vat, String discount, String total, String remarks) {
        this.rec = rec;
        this.issue = issue;
        this.mode = mode;
        this.recieve_from = recieve_from;
        this.ch_no = ch_no;
        this.bank = bank;
        this.from = from;
        this.to = to;
        this.course = course;
        this.fee = fee;
        this.vat = vat;
        this.discount = discount;
        this.total = total;
        this.remarks = remarks;
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

    public String getCh_no() {
        return ch_no;
    }

    public void setCh_no(String ch_no) {
        this.ch_no = ch_no;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public static boolean checkEmpty(String var) {
        if (var.equals("") || var.matches("\\s*")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validation() {
        if (true) {
            return true;
        } else {
            return false;
        }
    }

    public static String[] calculate(String amt, float VAT, String dis) {
        String calc[] = new String[3];

        Float amnt = Float.valueOf(amt);
        Float vat_amt = (float) (amnt * (VAT / 100));
        calc[0] = String.valueOf(vat_amt);
        
        Float disc_per = Float.valueOf(dis);
        Float disc_amt = ((amnt+vat_amt)* (disc_per / 100));
        calc[1] = String.valueOf(disc_amt);
        float total = amnt + vat_amt - disc_amt;
        calc[2] = String.valueOf(total);

        return calc;
    }

    public static String today() {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(today);
        return date;
    }

   


}
