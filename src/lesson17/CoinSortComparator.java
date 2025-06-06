package lesson17;

import java.util.Comparator;

public class CoinSortComparator implements Comparator<Coin> {

    @Override
    public int compare(Coin c1, Coin c2) {
        // Сортировка по диаметру (от большего к меньшему)
        if (c1.getDiameter() != c2.getDiameter()) {
            return Double.compare(c2.getDiameter(), c1.getDiameter());
        }

        // Сортировка по году (от меньшего к большему)
        if (c1.getYear() != c2.getYear()) {
            return c1.getYear() - c2.getYear();
        }

        // Сортировка по металлу (по алфавиту от А до Я)
        if (!c1.getMetalName().equals(c2.getMetalName())) {
            return c1.getMetalName().compareTo(c2.getMetalName());
        }

        // Сортировка по номиналу (от меньшего к большему)
        return c1.getNominal() - c2.getNominal();
    }
}