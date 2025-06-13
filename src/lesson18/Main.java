package lesson18;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // создаем Холодильник
        Fridge fridge = new Fridge();

        // C помощью метода putProduct добовляем продукты в холодильник
        fridge.putProduct("Масло", 15);
        fridge.putProduct("Говядина", 8);
        fridge.putProduct("Молоко", 2);
        fridge.putProduct("Куринное филе", 4);
        fridge.putProduct("Сметана", 1);
        fridge.putProduct("Творог", 3);
        fridge.putProduct("Молоко", 7);
        fridge.putProduct("Масло", 9);

        System.out.println("Проверим как работает метод takeProduct.");
        // Возьмем из холодильника 7 кг говядины с помощью метода takeProduct.
        fridge.takeProduct("Говядина", 7);
        // Возьмем из холодильника 1кг Йогурта.
        fridge.takeProduct("Йогурт", 1);
        // Возьмем из холодильника 4кг куриного филе.
        fridge.takeProduct("Куринное филе", 4);
        // Возьмем 3 кг сметаны.
        fridge.takeProduct("Сметана", 3);

        System.out.println("\nПроверим работу метода getTotalWeight");
        // Вывести вес всех продуктов в холодильнике(сумма) с помощью метода getTotalWeight
        fridge.getTotalWeight();

        System.out.println("\nПроверим работу метода getProductWeight");
        // Вывести вес конкретного продукта в холодильнике (масло, сметана, молоко)
        fridge.getProductWeight("Масло");
        fridge.getProductWeight("Сметана");
        fridge.getProductWeight("Молоко");

        System.out.println("\nПроверим работу метода getProductWithLeastWeight");
        // Вывести наименование продукта, который закончится первым
        fridge.getProductWithLeastWeight();

        System.out.println("\nПроверим работу метода getProductWithMostWeight");
        // Вывести наименование продукта, которого больше всего
        fridge.getProductWithMostWeight();

        System.out.println("\nПроверим работу метода printAllProductsFromZToA");
        // Вывести все продукты (название + вес) по алфавиту от Я до А
        fridge.printAllProductsFromZToA();

        System.out.println("\nПроверим работу метода printAllProductsByWeightDesc");
        // Вывести все продукты (название + вес) по весу от большего к меньшему
        fridge.printAllProductsByWeightDesc();
    }
}
