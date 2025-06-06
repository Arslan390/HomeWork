package lesson17;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>(new CoinSortComparator());

        coins.add(new Coin(25, 2020, "золото", 10.0));
        coins.add(new Coin(18, 1990, "серебро", 15.0));
        coins.add(new Coin(14, 2005, "медь", 20.0));
        coins.add(new Coin(22, 2010, "никель", 12.0));
        coins.add(new Coin(20, 2015, "платина", 8.0));

        System.out.printf("%-15s%-15s%-15s%-15s%n", "Диаметр", "Год", "Металл", "Номинал");
        for (Coin coin : coins) {
            System.out.printf("%-15.1f%-15d%-15s%-15d%n", coin.getDiameter(), coin.getYear(), coin.getMetalName(), coin.getNominal());
        }
        System.out.println("\n");


        // Отсортировать монеты в виде анонимного класса-сравнителя

        TreeSet<Coin> coins1 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                // Сортировка по металлу (по алфавиту от Я до А)
                if (!o1.getMetalName().equals(o2.getMetalName())) {
                    return o2.getMetalName().compareTo(o1.getMetalName());
                }

                // Сортировка по номиналу (от большего к меньшему)
                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal();
                }

                // Сортировка по диаметру (от меньшего к большему)
                return Double.compare(o1.getDiameter(), o2.getDiameter());
            }
        });

        coins1.add(new Coin(25, 2020, "золото", 10.0));
        coins1.add(new Coin(18, 1990, "серебро", 15.0));
        coins1.add(new Coin(14, 2005, "медь", 20.0));
        coins1.add(new Coin(22, 2010, "никель", 12.0));
        coins1.add(new Coin(20, 2015, "платина", 8.0));


        System.out.printf("%-15s%-15s%-15s%n", "Металл", "Номинал", "Диаметр");
        for (Coin coin : coins1) {
            System.out.printf("%-15s%-15d%-15.1f%n", coin.getMetalName(), coin.getNominal(), coin.getDiameter());
        }
    }
}
