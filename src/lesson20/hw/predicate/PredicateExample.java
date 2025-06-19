package lesson20.hw.predicate;

import lesson20.hw.Human;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Human> humans = List.of(new Human("Жанна", "Женщина", 25), new Human("Антон", "Мужчина", 5),
                new Human("Иван", "Мужчина", 25), new Human("Настя", "Женщина", 10), new Human("Артур", "Мужчина", 18),
                new Human("Глеб", "Мужчина", 27), new Human("Виктория", "Женщина", 45), new Human("Эдуард", "Мужчина", 17));
        System.out.println("Найдем всех людей подлежащих призыву обычным способом");
        for (Human human : humans) {
            if (human != null && human.getAge() > 17 && human.getAge() < 28 && human.getSex().equals("Мужчина")) {
                System.out.println(human);
            }
        }

        System.out.println("\nСделаем то же самое с помощью предиката");
        ConscriptionPredicate predicate = new ConscriptionPredicate();
        for (Human human : humans) {
            if (predicate.test(human)) System.out.println(human);
        }

        System.out.println("\nСделаем то же самое через стрим");
        humans
                .stream()
                .filter(predicate)
                .forEach(human -> System.out.println(human));

        System.out.println("\nНайдем всех женщин");
        humans
                .stream()
                .filter(human -> human.getSex().equals("Женщина"))
                .forEach(System.out::println);

        System.out.println("\nНайдем всех людей подлежащих призыву используя анонимную функцию");
        Predicate<Human> isConscription = (Human human) ->
                human != null && human.getAge() > 17 && human.getAge() < 28 && human.getSex().equals("Мужчина");

        humans.forEach(human -> {
            if (isConscription.test(human)) System.out.println(human);
        });
    }
}

