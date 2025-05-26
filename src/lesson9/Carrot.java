package lesson9;

public class Carrot extends Vegetable {

    public Carrot(String name, double price, int expirationDate, String size) {
        super(name, price, expirationDate, size);
    }

    @Override
    void learnSize() {
        System.out.printf("\"%s\" %s размера.", getName(), getSize());
    }

    @Override
    void learnPrice() {
        System.out.printf("Цена на \"%s\" составляет %.2f рублей.\n", getName(), getPrice());

    }

    @Override
    void learnExpirationDate() {
        System.out.printf("\"%s\" испортится через %d дней.\n", getName(), getExpirationDate());
    }
}
