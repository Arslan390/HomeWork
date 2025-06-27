package lesson19.bankExampleException;

public class DailyLimitCletedException extends RuntimeException {
    public DailyLimitCletedException() {
        super("Limit cleted");
    }
}
