package lesson10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//Сама игра - тут реализуется логика игры и взаимодействие объектов в игре
public class Blackjack {
    private ArrayList<Player> players = new ArrayList<>();
    private Dealer dealer = new Dealer();
    private Deck deck = new Deck();

    public void start(int playersQuantity) {
        //Проверки на валидность количества игроков
        if (playersQuantity < 1) {
            System.out.println("Нельзя создать игру на " + playersQuantity + ". Укажите количество более 0.");
            return;
        }

        if (playersQuantity > 5) {
            System.out.println("Нельзя создать игру на " + playersQuantity + ". Укажите количество игроков менее 6 человек");
            return;
        }

        //1 - создание игроков
        createPlayers(playersQuantity);
        //2 - раздали всем по 2 карты
        dealTwoCardsToPlayers();
        //3 - раздали остальные карты, пока игроки берут
        dealRestCardsToPlayers();
        //4 - напечатали у кого сколько очков
        printPlayersTotalNominal();
        //5 - определили и напечатали победителя
        printWinner();
    }

    /**
     * Создание игроков
     * @param playersQuantity кол-во игроков
     */
    private void createPlayers(int playersQuantity) {
        players.add(dealer);
        for (int playerNumber = 1; playerNumber <= playersQuantity; playerNumber++) {
            System.out.println("Введите желаемое имя игрока " + playerNumber + ":");

            Scanner scanner = new Scanner(System.in);
            String playerName = scanner.nextLine();

            Player player = new Player(playerName);
            players.add(player);

            System.out.println("Игрок " + playerName + " успешно создан!\n");
        }
    }

    /**
     * Раздать по 2 карты каждому (при старте игры)
     */
    private void dealTwoCardsToPlayers() {
        for (Player player : players) {
            //Достали 2 карты из колоды
            Card card1 = deck.getRandomCard();
            Card card2 = deck.getRandomCard();
            //Передаем в руки игроку
            player.addCardToHand(card1);
            player.addCardToHand(card2);
        }
    }

    /**
     * Раздать все остальные карты
     */
    private void dealRestCardsToPlayers() {
        for (Player player : players) {
            while (player.doYouNeedMoreCards()) {
                //Достали 2 карты из колоды
                Card card = deck.getRandomCard();
                //Передаем в руки игроку
                player.addCardToHand(card);
            }
        }
    }

    /**
     * Вывод результатов по очкам
     */
    private void printPlayersTotalNominal() {
        for (Player player : players) {
            System.out.println(player.getName() + " - " + player.countNominalInHand() + " очков/очка");
        }
    }

    /**
     * Определение и печать победителей
     */
    private void printWinner() {
        //Сначала определяем какой максимум очков
        int maxTotalNominal = 0;
        for (Player player : players) {
            int playerTotalNominal = player.countNominalInHand();
            if (playerTotalNominal > maxTotalNominal && player.isCanWin()) {
                maxTotalNominal = playerTotalNominal;
            }
        }

        //Проверяем, что диллер набрал больше всех очков (или не набрал)
        if (dealer.countNominalInHand() == maxTotalNominal) {
            System.out.println("Дилер выиграл");
            return;
        }

        //Выводим всех игроков набравших больше всех очков(победителей может быть несколько,
        // если больше всего очков у нескольких игроков)
        for (Player player : players) {
            int playerTotalNominal = player.countNominalInHand();
            if (playerTotalNominal == maxTotalNominal) {
                System.out.println(player.getName() + " победил, набрав " + playerTotalNominal + " очков");
            }
        }
    }
}
