package lesson17;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin2 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin3 = new Coin(10, 1990, "Золото", 2.5);
        Coin coin4 = new Coin(50, 1899, "Олово", 2.5);
        Coin coin5 = new Coin(5, 1869, "Серебро", 2.5);
        Coin coin6 = new Coin(5, 1896, "Паладий", 2.5);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        System.out.println(coins.size());
        for (Coin coin : coins) {
            System.out.println(coin);
        }
    }
}
