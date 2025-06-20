package lesson20.hw.Consumer;

import lesson20.hw.Human;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Human> humans = List.of(new Human("Жанна", "Женщина", 25), new Human("Антон", "Мужчина", 5),
                new Human("Иван", "Мужчина", 25), new Human("Настя", "Женщина", 10), new Human("Артур", "Мужчина", 18),
                new Human("Глеб", "Мужчина", 27), new Human("Виктория", "Женщина", 45), new Human("Эдуард", "Мужчина", 17));

        System.out.println("Выведим в консоль имена всех людей англискими буквами через consumer");
        PrintConsumer consumer = new PrintConsumer();
        for (Human human : humans) {
            consumer.accept(human);
        }

        System.out.println("\nВыведим в консоль имена всех людей англискими буквами через consumer + forEach");
        humans.forEach(consumer);

        System.out.println("\nВыведим в консоль имена всех людей англискими буквами через consumer + stream");
        humans
                .stream()
                .forEach(consumer);

        System.out.println("\nВыведим в консоль имена всех людей англискими буквами через " +
                "consumer без отдельного класса + forEach");
        Map<Character, String> translate = new HashMap<>() {{
            put('a', "a");
            put('б', "b");
            put('в', "v");
            put('г', "g");
            put('д', "d");
            put('е', "e");
            put('ё', "e");
            put('ж', "zh");
            put('з', "z");
            put('и', "i");
            put('й', "y");
            put('к', "k");
            put('л', "l");
            put('м', "m");
            put('н', "n");
            put('о', "o");
            put('п', "p");
            put('р', "r");
            put('с', "s");
            put('т', "t");
            put('у', "u");
            put('ф', "f");
            put('х', "h");
            put('ц', "c");
            put('ч', "ch");
            put('ш', "sh");
            put('щ', "sch");
            put('ъ', "");
            put('ы', "y");
            put('ь', "");
            put('э', "e");
            put('ю', "yu");
            put('я', "ya");
        }};
        humans.forEach(human -> {
            StringBuilder result = new StringBuilder();
            String name = human.getName().toLowerCase();
            for (char c : name.toCharArray()) {
                if (translate.containsKey(c)) {
                    result.append(translate.get(c));
                } else {
                    result.append(c);
                }
            }
            result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
            System.out.println(result);
        });
    }

}
