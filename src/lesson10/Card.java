package lesson10;

import java.util.Objects;

//Карта
public class Card {
    private final int nominal;
    private final String suit;

    public Card(int nominal, String suit) {
        this.nominal = nominal;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public int getNominal() {
        return nominal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return nominal == card.nominal && Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, suit);
    }

    @Override
    public String toString() {
        return "Карта - " + suit + ", весит " + nominal + " очков";
    }
}
