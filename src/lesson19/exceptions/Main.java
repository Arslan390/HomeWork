package lesson19.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.get(10);
//        System.out.println("Какой-то текст после исключения");

        //Исключение - это ошибка, которая возникает во время выполнения программы и может нарушить ее нормальное поведение

        //Исключения позволяют:
        // - узнать, что пошло не так и где пошло не так (в каком месте кода)
        // - остановить выполнение программы
        // - Обработать ошибку и прописать свое поведение, в случае если она произошла

        //Делятся на проверяемые и не проверяемые исключения

        //Проверяемые обязательно нужно обрабатывать через try - catch или пробрасывать дальше throws
        //Пример throw в классе Bank + ThrowExample
        try {
            List<String> list = new ArrayList<>();
            list.get(10);
            int result = 10 / 0;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Ошибка: нельзя делить на ноль");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Ошибка: выход за пределы массива");
//            int result = 10 / 0;
//            System.exit(0);
        } catch (RuntimeException exception) {
            System.out.println("Ошибка: не удалось определить тип ошибку, текст ошибки: " + exception.getMessage());
        } finally {
            System.out.println("Демонстрация try catch завершена");
        }

        //try with resourses - автовызов close после использвания

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите текст:");
            int value = scanner.nextInt();
            System.out.println("Ваш текст: " + value);
        }

        //Альтернатива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        int value = scanner.nextInt();
        System.out.println("Ваш текст: " + value);
        scanner.close();

//        TextReader reader = new TextReader();
//        reader.readFileWithTryCatch("example.txt");
//        reader.readFileWithThrows("example.txt");


        // 1) Просто обрабатывать Exception нет смысла,
        // нужно ловить конкретные ошибки (ArithmeticException, IndexOutOfBoundsException и так далее)
        // 2) try with resourse - позволяет всегда закрыть ресурса
        // 3) Можно использовать исключения, чтобы пробрасывать их самому (например свои Кастомные или уже существующие)
        // для построения логики программы
        // 4) Не оставлять catch пустым
    }
}
