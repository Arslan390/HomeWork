package lesson9;

public class Apple extends Fruit {
    private String taste;

    public Apple(String name, double price, int expirationDate, String color, String taste) {
        super(name, price,expirationDate,color);
        this.taste = taste;
    }


    @Override
    void learColor() {
        System.out.printf("\"%s\" %s цвета.\n", getName(), getColor());
    }

    @Override
    void learnPrice() {
        System.out.printf("Цена на \"%s\" составляет %.2f рублей.\n", getName(), getPrice());
    }

    @Override
    void learnExpirationDate() {
        System.out.printf("\"%s\" испортятся через %d дней.\n", getName(), getExpirationDate());
    }

    void FindOutTheTaste(){
        System.out.printf("\"%s\" имеют %s вкус.\n", getName(), taste);
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
