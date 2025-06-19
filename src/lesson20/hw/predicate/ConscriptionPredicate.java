package lesson20.hw.predicate;

import lesson20.hw.Human;

import java.util.function.Predicate;

// Проверка подлежит ли человек призыву
public class ConscriptionPredicate implements Predicate<Human> {
    @Override
    public boolean test(Human human) {
        // проверяем что объект не равен null
        if (human == null) {
            return false;
        }

        // проверяем что человек не моложе призыного возраста
        if (human.getAge() < 18) {
            return false;
        }

        // проверяем что человек не старше призывного возроста
        if (human.getAge() > 27) {
            return false;
        }

        // если человек мужчина возвращяем true
        return human.getSex().equals("Мужчина");
    }

}
