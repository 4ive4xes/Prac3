abstract public class Telephone {
    protected boolean telephoneState;
    protected double displayDiagonal;
    protected String OS;
    protected String model;

    abstract void call(String number);
    abstract void blockTelephone();
    abstract void unblockTelephone();
    abstract String sendSms(String sms);

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
