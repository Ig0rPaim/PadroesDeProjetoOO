import java.time.LocalDateTime;

public class DatasForPayment {
    private String account;
    private Double value;
    private LocalDateTime time;
    private String sender;
    private String recipient;
    
    public String getAccount() {
        return account;
    }
    public Double getValue() {
        return value;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public String getSender() {
        return sender;
    }
    public String getRecipient() {
        return recipient;
    }
    public DatasForPayment(String account, Double value, LocalDateTime time, String sender, String recipient) {
        this.account = account;
        this.value = value;
        this.time = time;
        this.sender = sender;
        this.recipient = recipient;
    }
    
    
}
