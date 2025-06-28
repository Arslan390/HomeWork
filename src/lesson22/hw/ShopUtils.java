package lesson22.hw;

import java.util.Comparator;
import java.util.List;

public class ShopUtils {
    // Считаем общий доход по всем магазинам сети
    public int calculateTotalIncome(List<Shop> shops) {
        int totalIncome = shops.stream()
                .mapToInt(Shop::getIncome)
                .sum();
        return totalIncome;
    }

    // Считаем количество магазинов в сети
    public int countShopsInNetwork(List<Shop> shops) {
        return shops.size();
    }

    // Считаем средний доход на каждый магазин сети
    public void calculateAverageRevenuePerStore(List<Shop> shops) {
        double averageRevenuePerStore = (double) calculateTotalIncome(shops) / countShopsInNetwork(shops);
        System.out.println("Средний доход на каждый магазин: " + averageRevenuePerStore + " рублей.");
    }

    // Сортируем магазины сети по доходности от большего к меньшему
    public void sortShopsByIncomeInReverseOrder(List<Shop> shops) {
        shops.stream()
                .sorted(Comparator.comparing(Shop::getIncome).reversed())
                .forEach(shop -> System.out.println(shop.getName() + ": " + shop.getIncome() + " рублей"));
    }

    // Сортируем магазины сети по соотношению дохода на 1м площади магазина
    public void sortShopsByIncomePerArea(List<Shop> shops) {
        shops.stream()
                .sorted(Comparator.comparingDouble(shop -> (double) shop.getIncome() / shop.getArea()))
                .forEach(shop -> System.out.printf("%s: %.2f рублей/м²%n", shop.getName(), (double) shop.getIncome() / shop.getArea()));
    }

    // выдает топ 2 лучших и худших магазина по доходу, в процессе расчета выводит каждый магазин в консоль
    public void printTopAndWorstTwoStoresByIncome(List<Shop> shops) {
        System.out.println("Топ 2 лучших магазина:");
        shops.stream()
                .sorted(Comparator.comparing(Shop::getIncome).reversed())
                .limit(2)
                .forEach(shop -> System.out.println(shop.getName() + ": " + shop.getIncome() + " рублей"));

        System.out.println("Топ 2 худших магазина:");
        shops.stream()
                .sorted(Comparator.comparing(Shop::getIncome))
                .limit(2)
                .forEach(shop -> System.out.println(shop.getName() + ": " + shop.getIncome() + " рублей"));

    }

    // выдает только магазины, в которых соотношение доход на 1м квадратный больше 1000 рублей
    public void printShopsWithIncomePerAreaOver1000(List<Shop> shops) {
        shops.stream()
                .filter(shop -> (double) shop.getIncome() / shop.getArea() > 1000)
                .sorted(Comparator.comparing(Shop::getIncome).reversed())
                .forEach(shop -> System.out.printf("%s: %.2f рублей/м²%n", shop.getName(), (double) shop.getIncome() / shop.getArea()));
    }
}
