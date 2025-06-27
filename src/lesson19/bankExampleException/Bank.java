package lesson19.bankExampleException;

public class Bank {
    int totalAmount = 100;
    int dailyLimit = 50;
    int cardLimit = 40;
    public void withdraw(double needAmount) {
        if (cardLimit < needAmount) {
            throw new CardLimitCletedException();
        } else if (dailyLimit < needAmount) {
            throw new DailyLimitCletedException();
        } else if (totalAmount < needAmount) {
            throw new NotEnoughMoneyException();
        } else {
            System.out.println("Снятие " + needAmount + " рублей.");
        }
    }
}
