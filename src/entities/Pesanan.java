package entities;

public class Pesanan extends Entity implements Manageable {
    private final String pemesan;
    private final String size;
    private final String orderType;
    private final String paymentMethod;
    private int quantity;

    public Pesanan(String pemesan, String name, int quantity, String size, String orderType, String paymentMethod) {
        super(name);
        this.pemesan = pemesan;
        this.quantity = quantity;
        this.size = size;
        this.orderType = orderType;
        this.paymentMethod = paymentMethod;
    }

    public String getPemesan() {
        return pemesan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public void save() {
    }

    @Override
    public void delete() {
    }
}
