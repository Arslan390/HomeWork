package lesson21.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RandomEvenNumbersGenerator implements Supplier<Integer> {

    @Override
    public Integer get() {
        int number = 1;
        while (number % 2 != 0) {
            number = ThreadLocalRandom.current().nextInt(1, 999);
        }
        return number;
    }
}
