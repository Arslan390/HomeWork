package lesson9;

public class Milk extends DairyProduct {

    double fatContent;

    public Milk(String name, double price, int expirationDate, boolean pasteurized,
                double fatContent) {
        super(name, price, expirationDate, pasteurized);
        this.fatContent = fatContent;
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
        System.out.printf("Процент жирности \"%s\" состовляет %.1f процентов. \n", getName(), fatContent);
    }
}
