package lesson9;

public class Cheese extends DairyProduct {

    String type;

    public Cheese(String name, double price, int expirationDate, boolean pasteurized,
                  String type) {
        super(name, price, expirationDate, pasteurized);
        this.type = type;
    }


    @Override
    void learnPasteurized() {
        if (getPasteurized()) {
            System.out.println("\"" + getName() + "\" пастеризовано.");
        } else {
            System.out.println("\"" + getName() + "\" не пастеризовано.");
        }
    }

    @Override
    void learnPrice() {
        System.out.printf("Цена на \"%s\" составляет %.2f рублей.\n", getName(), getPrice());
    }

    @Override
    void learnExpirationDate() {
        System.out.printf("\"%s\" испортится через %d дней.\n", getName(), getExpirationDate());

    }

    void learnFatContent() {
        System.out.println("Разновидность сыра " + type);
    }
}
