package bai9;

import java.util.ArrayList;
import java.util.List;

public class Manager9 {
    private List<Receipt> receipts = new ArrayList<>();

    public boolean delete(String id) {
        Receipt receipt = this.receipts.stream().filter(o -> o.getCustomer().getId().equals(id)).findFirst().orElse(null);
        if (receipt == null) {
            return false;
        }
        this.receipts.remove(receipt);
        return true;
    }

    public void add(Receipt receipt) {
        this.receipts.add(receipt);
    }

    /*public double paymentMoney() {
    }*/

    public void showInfo() {
        receipts.forEach(o -> System.out.println(o.toString()));
    }
}
