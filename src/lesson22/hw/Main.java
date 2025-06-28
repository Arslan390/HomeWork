package lesson22.hw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Магазин 1", 150000, 100));
        shops.add(new Shop("Магазин 2", 70000, 120));
        shops.add(new Shop("Магазин 3", 80000, 90));
        shops.add(new Shop("Магазин 4", 160000, 85));
        shops.add(new Shop("Магазин 5", 220000, 110));

        ShopUtils shopUtils = new ShopUtils();

        System.out.println("Считаем общий доход по всем магазинам сети.");
        System.out.println("Общий доход: " + shopUtils.calculateTotalIncome(shops) + " рублей.");

        System.out.println("\nСчитаем количество магазинов в сети.");
        System.out.println("В сети: " + shopUtils.countShopsInNetwork(shops) + " магазинов.");

        System.out.println("\nСчитаем средний доход на каждый магазин сети.");
        shopUtils.calculateAverageRevenuePerStore(shops);

        System.out.println("\nСортируем магазины сети по доходности от большего к меньшему");
        shopUtils.sortShopsByIncomeInReverseOrder(shops);

        System.out.println("\nСортируем магазины сети по соотношению дохода на 1м площади магазина.");
        shopUtils.sortShopsByIncomePerArea(shops);

        System.out.println("\nВывод в консоль топ 2 лучших и худших магазина.");
        shopUtils.printTopAndWorstTwoStoresByIncome(shops);

        System.out.println("\nВывод в консоль магазины с соотношением дохода на 1м больше 1000 рублей:");
        shopUtils.printShopsWithIncomePerAreaOver1000(shops);
    }
}
