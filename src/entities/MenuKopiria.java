package entities;

public class MenuKopiria extends Entity implements Manageable {
    private final String category;
    private int quantity;
    private int price; 

    public MenuKopiria(String name, int quantity, int price, String category) {
        super(name);
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() { 
        return price;
    }

    public void setPrice(int price) { 
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void save() {
    }

    @Override
    public void delete() {
    }
}
