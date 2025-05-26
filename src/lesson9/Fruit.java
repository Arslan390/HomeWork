package lesson9;

public abstract class Fruit extends Product {
    private String color;

    public Fruit(String name, double price, int expirationDate, String color) {
        super(name, price, expirationDate);
        this.color = color;
    }

    abstract void learColor();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
