package lesson21.hw.unaryOperator;

import lesson21.hw.Tourist;
import lesson21.hw.supplier.RandomSeatSupplier;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class AssignSeat implements UnaryOperator<Tourist> {
    Supplier<Integer> seatSupplier;

    public AssignSeat() {
        this.seatSupplier = new RandomSeatSupplier();
    }

    @Override
    public Tourist apply(Tourist tourists) {
        Integer seatNumber = seatSupplier.get();
        if (seatNumber != null) {
            tourists.setSeatNumber(seatNumber);
        }
        return tourists;
    }
}
