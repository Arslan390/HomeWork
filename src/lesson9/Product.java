package lesson9;

public abstract class Product {
    private String name;
    private double price;
    private int expirationDate;

    public Product(String name, double price, int expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    abstract void learnPrice();

    abstract void learnExpirationDate();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
}
