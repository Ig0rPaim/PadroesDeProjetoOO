public abstract class Adapter implements Target{
    private Adaptee adaptee;
    private DatasForPayment datasForPayment;

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public DatasForPayment getDatasForPayment() {
        return datasForPayment;
    }

    public Adapter(Adaptee adaptee, DatasForPayment datasForPayment) {
        this.adaptee = adaptee;
        this.datasForPayment = datasForPayment;
    }

    public void processPayment(double amount){
        adaptee.processPayment(amount, datasForPayment);
    }
    
}
