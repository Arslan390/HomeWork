package lesson10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//Игрок
public class Player {
    private final String name;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    /**
     * Взять в руки карту
     * @param card Карта
     */
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    /**
     * Нужна ли еще карта
     * @return true - если нужна, false - если не нужна
     */
    public boolean doYouNeedMoreCards() {
        if (!isCanWin()) {
            System.out.println(name + " достиг/достигла значения " + countNominalInHand() + ", больше нельзя брать карты");
            return false;
        }

        //Показываем карты на руках игрока
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println(name + ", у вас " + countNominalInHand() + " очков/очка, хотите ли вы взять следующую карту?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("да")) {
            return true;
        }

        return false;
    }

    /**
     * Проверка, можем ли выиграть
     * @return true - если да, false - если нет
     */
    public boolean isCanWin() {
        return countNominalInHand() <= 21;
    }

    /**
     * Подсчет номинала на руках
     * @return int значение по сумме очков на картах
     */
    public int countNominalInHand() {
        int totalNominal = 0;
        for (Card card : hand) {
            totalNominal += card.getNominal();
        }

        return totalNominal;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(hand, player.hand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hand);
    }

    @Override
    public String toString() {
        return "Игрок по имени " + name;
    }
}
