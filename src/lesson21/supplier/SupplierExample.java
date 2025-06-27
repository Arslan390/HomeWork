package lesson21.supplier;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println("Сгенерируем 10 случайных чисел, от 1 до 999, только четные");
        for (int index = 0; index < 10; index++) {
            int number = ThreadLocalRandom.current().nextInt(1, 999);
            if (number % 2 == 0) {
                System.out.println(number);
            } else {
                index--;
            }
        }

        System.out.println("\nСгенерируем 10 случайных чисел, от 1 до 999, только четные с использованием doubleGenerator");
        RandomEvenNumbersGenerator generator = new RandomEvenNumbersGenerator();
        for (int index = 0; index < 10; index++) {
            System.out.println(generator.get());
        }

        //реализация supplier в виде анонимной функции
        Supplier<Double> doubleGenerator = () -> ThreadLocalRandom.current().nextDouble();
        System.out.println(doubleGenerator.get());
    }
}
