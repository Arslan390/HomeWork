package lesson21.hw.function;

import lesson21.hw.Tourist;

import java.util.function.Function;

public class TouristsMapper implements Function<Tourist, ShortTourist> {
    @Override
    public ShortTourist apply(Tourist tourists) {
        return new ShortTourist(tourists.getName(), tourists.isPayment());
    }
}
