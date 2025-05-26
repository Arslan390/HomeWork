package lesson9;

public abstract class DairyProduct extends Product {
    private boolean pasteurized;


    public DairyProduct(String name, double price, int expirationDate, boolean pasteurized) {
        super(name, price, expirationDate);
        this.pasteurized = pasteurized;
    }


    abstract void learnPasteurized();


    public void setPasteurized(boolean pasteurized) {
        this.pasteurized = pasteurized;
    }

    public boolean getPasteurized() {
        return pasteurized;
    }
}
