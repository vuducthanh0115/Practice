package bai9;

public class Receipt {
    private int oldId;
    private int newId;
    private double paymentMoney;
    private Customer customer;

    public Receipt(int oldId, int newId, Customer customer) {
        this.oldId = oldId;
        this.newId = newId;
        this.paymentMoney = (newId - oldId) * 5;
        this.customer = customer;
    }

    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        return "Thong tin ho gia dinh{" +
                "name='" + customer.getName() + '\'' +
                ", So cu=" + oldId +
                ", So moi='" + newId + '\'' +
                ", So tien phai tra='" + paymentMoney + '\'' +
                '}';
    }

}
