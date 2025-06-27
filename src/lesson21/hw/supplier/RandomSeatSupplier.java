package lesson21.hw.supplier;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class RandomSeatSupplier implements Supplier<Integer> {
    private final int totalSeats;
    private final Random random;
    private final Set<Integer> occupiedSeats = new HashSet<>();

    public RandomSeatSupplier() {
        this.totalSeats = 30;
        this.random = new Random();
    }

    @Override
    public Integer get() {
        while (true) {
            int seatNumber = random.nextInt(totalSeats) + 1;
            if (!occupiedSeats.contains(seatNumber)) {
                occupiedSeats.add(seatNumber);
                return seatNumber;
            }
            if (occupiedSeats.size() == totalSeats) {
                return null; // Все места заняты
            }
        }
    }
}
