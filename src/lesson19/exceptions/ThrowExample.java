package lesson19.exceptions;

import lesson19.bankExampleException.Bank;

public class ThrowExample {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.withdraw(150);

//        try {
//            System.out.println("Попытка снятия наличных:");
//            bank.withdraw(150);
//        } catch (NotEnoughMoneyException e) {
//            System.out.println("Недостаточно средств.");
//        } catch (DailyLimitCletedException | CardLimitCletedException e) {
//            System.out.println("Лимит исчерпан");
//        } catch (RuntimeException e) {
//            System.out.println("Что-то пошло не так, не удалось снять деньги");
//        }

    }
}
