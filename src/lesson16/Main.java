package lesson16;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаем новый список");
        Set<Integer> set = new TreeSet<>();

        System.out.println("\nadd(E e): Добавляет элемент в множество, если он отсутствует.\n");
        set.add(4);
        set.add(1);
        set.add(8);
        set.add(2);
        set.add(99);
        set.add(2);

        System.out.println("\nsize(): Возвращает количество элементов в множестве.");
        System.out.println("Размер коллекции - " + set.size());

        System.out.println("\nisEmpty(): Проверяет, пусто ли множество.\n");
        System.out.println("Коллекция пустая? - " + set.isEmpty());

        System.out.println("\nremove(Object o): Удаляет элемент из множества, если элемент присутствует.");
        System.out.println("Удаляем число 8 - " + set.remove(8));
        System.out.println("Удаляем число 15 - " + set.remove(15));

        System.out.println("\ncontains(Object o): Проверяет, содержится ли элемент в множестве.");
        System.out.println("Проверка, есть ли элемент 8 - " + (set.contains(8) ? "присутствует" : "отсутствует"));
        System.out.println("Проверка, есть ли элемент 1 - " + (set.contains(1) ? sayContains() : sayNotContains()));

        System.out.println("\nВывод всех элементов множества");
        System.out.println(set);

//        for (Integer num : set) {
//            if (num == 2) {
//                set.remove(num);
//            }
//        }

        // 0 1 5 3 2 6 3
        //Iterator
        //hasNext - метод Итератора, который отвечает на вопрос "Есть ли следующий элемент?" true или false
        //next - метод Итератора, с помощью которого происходит получение следующего элемента
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == 2) {
                iterator.remove();
            }
        }

//        set.removeIf(num -> {
//            if (num == 99) {
//                return true;
//            } else if (num % 2 == 0) {
//                return false;
//            } else {
//                return true;
//            }
//        });
//        set.removeIf(num -> num == 2);
//        System.out.println(set);


    }

    //Пример для тернарных операторов
    public static String sayContains() {
        return "присутствует";
    }

    public static String sayNotContains() {
        return "отсутствует";
    }
}
