package lesson21.function;

import lesson17.Coin;

public class FunctionExample {
    public static void main(String[] args) {
        //Мы отправляем монеты транспортной компанией и заказчику предоставляем только нужную информацию о монете
        Coin coin = new Coin(5, 1999, "Gold", 2.5);

        //Переводим в объект(Entity) монеты без лишней информации(в DTO) (маппинг данных)
        ShortCoin shortCoin = new ShortCoin(coin.getNominal(), coin.getMetalName());
        System.out.println(shortCoin);

        //Теперь делаем то же самое, только с использованием coin маппера
        CoinMapper coinMapper = new CoinMapper();
        ShortCoin shortCoin2 = coinMapper.apply(coin);
        System.out.println(shortCoin2);
    }
}
