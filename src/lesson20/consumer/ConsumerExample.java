package lesson20.consumer;

import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> words = List.of("Дом", "Город", "Пирамида", "Треугольник", "Тетрадь", "Танк", "", "Семечека");

        System.out.println("Выведем на консоль все не пустые слова");
        for (String word : words) {
            if (word != null && !word.isEmpty()) {
                System.out.println(word);
            }
        }

        System.out.println("\nВыведем на консоль все не пустые слова через Consumer");
        PrintConsumer printConsumer = new PrintConsumer();
        for (String word : words) {
            printConsumer.accept(word);
        }

        System.out.println("\nВыведем на консоль все не пустые слова через forEach + Consumer");
        words.forEach(printConsumer);

        System.out.println("\nВыведем на консоль все не пустые слова через Stream + Consumer");
        words
                .stream()
                .forEach(printConsumer);

        System.out.println("\nВыведем на консоль все не пустые слова через forEach + Consumer без отдельного");
        words.forEach(word -> {
            if (word != null && !word.isEmpty()) {
                System.out.println(word);
            }
        });
    }
}
