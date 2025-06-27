package lesson19.bankExampleException;

public class CardLimitCletedException extends RuntimeException {
    public CardLimitCletedException() {
        super("Card limit cleted");
    }
}
