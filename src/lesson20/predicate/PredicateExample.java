package lesson20.predicate;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = List.of("Дом", "Город", "Пирамида", "Треугольник", "Тетрадь", "Танк", "Семечка");
        System.out.println("\nНайдем все слова с буквой Т большой или маленькой и с буквой е большой или маленькой " +
                "и без буквы к большой или маленькой обычным способом");
        for (String word : words) {
            if ((word.contains("Т") || word.contains("т")) && (word.contains("е") || word.contains("Е"))
                    && (!word.contains("К") && !word.contains("к"))) {
                System.out.println(word);
            }
        }

        System.out.println("\nОпределим то же самое с помощью предиката");
        WordValidationPredicate predicate = new WordValidationPredicate();
        for (String word : words) {
            if (predicate.test(word)) {
                System.out.println(word);
            }
        }

        System.out.println("\nНайдем то же самое через стрим");
        words
                .stream() //Запустили конвеер
                .filter(word -> predicate.test(word)) //отфильтровали на основе ответов Предиката по фильтру, который внутри
                .forEach(word -> System.out.println(word)); //вывели на консоль те, что подошли под фильтр

        System.out.println("\nНайдем все слова с буквой Т");
        words
                .stream() //Запустили конвеер
                .filter(word -> word.contains("Т")) //отфильтровали на основе ответов Предиката по фильтру, который внутри
                .forEach(word -> System.out.println(word)); //вывели на консоль те, что подошли под фильтр
    }
}
