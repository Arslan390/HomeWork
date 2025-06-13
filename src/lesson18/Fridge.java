package lesson18;

import java.util.*;

public class Fridge {
    private Map<String, Integer> products = new HashMap<>();

    // Положить продукт в холодильник
    public void putProduct(String product, int weight) {
        if (weight > 0) {
            if (products.containsKey(product)) {
                products.put(product, products.get(product) + weight);
            } else {
                products.put(product, weight);
            }
        } else {
            System.out.println("Нельзя поставить нулевое или отрицательное количество продуктов");
        }
    }

    // Взять продукт из холодильника
    public void takeProduct(String product, int weight) {
        if (products.containsKey(product)) {
            if (products.get(product) > weight) {
                products.put(product, products.get(product) - weight);
                System.out.printf("Продукт \"%s\" в количестве %d кг. взят, осталось %d кг.%n", product, weight, products.get(product));
            } else if (products.get(product) == weight) {
                products.remove(product);
                System.out.printf("Продукт \"%s\" в количестве %d кг. взят. \"%s\" больше не осталось.%n", product, weight, product);
            } else {
                System.out.printf("Недостаточно продукта \"%s\" в холодильнике, доступно %d кг.%n", product, products.get(product));
            }
        } else {
            System.out.printf("\"%s\" не найден в холодильнике.%n", product);
        }
    }

    // Вывести вес всех продуктов в холодильнике(сумма)
    public void getTotalWeight() {
        int weight = 0;
        Collection<Integer> weightProducts = products.values();
        for (Integer element : weightProducts) {
            weight += element;
        }
        System.out.printf("Общий вес всех продуктов в холодильнике %d кг.%n", weight);
    }

    // Вывести вес конкретного продукта в холодильнике
    public void getProductWeight(String product) {
        if (!products.containsKey(product) || products.get(product) == 0) {
            System.out.printf("Продукта \"%s\" нет в холодильнике", product);
        } else {
            System.out.printf("Продукта \"%s\", осталось %d кг.%n", product, products.get(product));
        }
    }

    // Вывести наименование продукта, который закончится первым
    public void getProductWithLeastWeight() {
        String productWithLeastWeight = null;
        int minWeight = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() < minWeight) {
                productWithLeastWeight = entry.getKey();
                minWeight = entry.getValue();
            }
        }

        if (productWithLeastWeight == null) {
            System.out.println("Список продуктов пуст.");
        } else {
            System.out.println("Продукт которого меньше всего: " + productWithLeastWeight);
        }
    }

    // Вывести наименование продукта, которого больше всего
    public void getProductWithMostWeight() {
        String productWithMostWeight = null;
        int maxWeight = 0;

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() > maxWeight) {
                productWithMostWeight = entry.getKey();
                maxWeight = entry.getValue();
            }
        }

        if (productWithMostWeight == null) {
            System.out.println("Список продуктов пуст.");
        } else {
            System.out.println("Продукт которого больше всего: " + productWithMostWeight);
        }
    }

    // Вывести все продукты (название + вес) по алфавиту от Я до А
    public void printAllProductsFromZToA() {
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder());
        productNames.addAll(products.keySet());
        productNames.forEach(productName -> {
            System.out.println(productName + " - " + products.get(productName));
        });
    }

    // Вывести все продукты (название + вес) по весу от большего к меньшему
    public void printAllProductsByWeightDesc() {
        Set<Map.Entry<String, Integer>> productEntries = new TreeSet<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        productEntries.addAll(products.entrySet());
        productEntries.forEach(entry -> {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        });
    }
}
