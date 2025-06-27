package lesson21.hw;

import lesson21.hw.function.ShortTourist;
import lesson21.hw.function.TouristsMapper;
import lesson21.hw.unaryOperator.AssignSeat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Tourist> tourists = new ArrayList<>();
        tourists.add(new Tourist("Алексей", 25, "Москва", true));
        tourists.add(new Tourist("Маша", 15, "Воронеж", true));
        tourists.add(new Tourist("Аленна", 55, "Санкт-Петербург", false));
        tourists.add(new Tourist("Анастасия", 46, "Москва", false));
        tourists.add(new Tourist("Глеб", 18, "Ростов", true));
        tourists.add(new Tourist("Дмитрий", 17, "Саратов", true));
        tourists.add(new Tourist("Александр", 43, "Новгород", true));
        tourists.add(new Tourist("Елизавета", 85, "Москва", true));
        tourists.add(new Tourist("Татьяна", 61, "Санкт-Петербург", false));
        tourists.add(new Tourist("Кристина", 27, "Москва", true));
        tourists.add(new Tourist("Константин", 33, "Волгоград", true));

        System.out.println("""
                Переводим объект(Entity) tourist в объект shortTourist без лишней информации(в DTO)
                 (маппинг данных). Необходимая информация только имя и была ли поизведенна оплата
                """);

        List<ShortTourist> shortTourists = tourists.stream()
                .map(tourist -> new ShortTourist(tourist.getName(), tourist.isPayment()))
                .toList();
        shortTourists.forEach(System.out::println);

        System.out.println("\nДелаем тоже самое с использованием TouristMapper\n");

        TouristsMapper touristsMapper = new TouristsMapper();
        List<ShortTourist> shortTourists1 = tourists.stream()
                .map(touristsMapper)
                .toList();
        shortTourists1.forEach(System.out::println);

        // Выдадим всем нашим туристом номера их мест в самолете с помошью AssignSeat имплимитируюший интерфейс
        // UnaryOperator. случайное место генерируется в RandomSeatSupplier имплемитирующий интерфейс Supplier

        System.out.println("\nСначала проверим какие места у наших пасажиров");
        tourists
                .forEach(tourist -> System.out.printf("\nПассажир %s сидит на месте %d", tourist.getName(), tourist.getSeatNumber()));

        System.out.println("\n\nРаспределим места и снова выведим на экран");
        AssignSeat assignSeat = new AssignSeat();
        tourists.stream()
                .map(assignSeat)
                .forEach(tourist -> System.out.printf("\nПассажир %s сидит на месте %d", tourist.getName(), tourist.getSeatNumber()));

    }
}
