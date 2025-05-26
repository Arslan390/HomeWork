package lesson9;

public abstract class Vegetable extends Product {
    private String size;

    public Vegetable(String name, double price, int expirationDate, String size) {
        super(name, price, expirationDate);
        this.size = size;
    }

    abstract void learnSize();

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
