package lesson9;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(8);
        Shape rectangle = new Rectangle(14, 18);
        Shape triangle = new Triangle(0.5, 4);

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
        System.out.println();
        System.out.println();

        // Второе задание.

        Product milk = new Milk("Домик в деревне", 25.45, 35, true, 25);
        Milk milk1 = new Milk("Простоквашина", 15.45, 15, false, 15.5);
        Cheese cheese = new Cheese("President", 105.45, 12, true, "Моцарелла");
        Apple apple = new Apple("Яблоки Шафран", 25.45, 10, "Красного", "горькие");
        Carrot carrot = new Carrot("Астраханская морковь", 25, 6, "крупного");


        System.out.println("Сравнение экземпляра класса Milk записанного в переменную типа Milk " +
                "и Product");
        System.out.printf("Наименования продукта \"%s\"\n", milk1.getName());
        milk1.learnPrice();
        milk1.learnExpirationDate();
        milk1.learnPasteurized();
        milk1.learnFatContent();
        System.out.println();
        System.out.printf("Наименования продукта \"%s\"\n", milk.getName());
        milk.learnPrice();
        milk.learnExpirationDate();
        // milk.learnPasteurized();
        // milk.learnFatContent();

        // Пакетная работа с экземплярами разных классов, которые являются родственниками
        System.out.println("\nПакетная работа с экземплярами разных классов, которые являются" +
                " родственниками");
        Product[] products = {milk, cheese, apple, carrot};
        for (Product product : products) {
            System.out.println();
            System.out.printf("Наименования продукта \"%s\"\n", product.getName());
            product.learnPrice();
            product.learnExpirationDate();
            // определяем какой именно это продукт
            if (product instanceof DairyProduct dairyProduct) {
                dairyProduct.learnPasteurized();
                if (dairyProduct instanceof Milk milkFromArray) {
                    milkFromArray.learnFatContent();
                } else if (dairyProduct instanceof Cheese cheeseFromArray) {
                    cheeseFromArray.learnFatContent();
                } else {
                    System.out.println("Такого вида молочных продуктов не предусмотренно ");
                }
            } else if (product instanceof Apple appleFromArray) {
                appleFromArray.FindOutTheTaste();
                appleFromArray.learColor();
            } else if (product instanceof Carrot carrotFromArray) {
                carrotFromArray.learnSize();
            } else {
                System.out.println("Такого вида продуктов не предусмотренно ");
            }
        }
    }
}
