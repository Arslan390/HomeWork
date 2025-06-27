package lesson22;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Дмитрий", 1, 19, "Россия"));
        students.add(new Student("Владислав", 2, 20, "Беларусь"));
        students.add(new Student("Ольга", 1, 20, "Россия"));
        students.add(new Student("Джон", 2, 20, "Америка"));
        students.add(new Student("Иван", 1, 22, "Казахстан"));
        students.add(new Student("Акмал", 1, 18, "Казахстан"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Евгения", 3, 22, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Алена", 2, 20, "Молдова"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));
        students.add(new Student("Олег", 1, 18, "Россия"));

        System.out.println("\nНа основе полученных данных из списка list найти сколько уникальных студентов учиться в ВУЗЕ.");
        long quantityOfStudents = students.stream()
                .distinct()
                .count();
        System.out.println("Реальное количество студентов в вузе " + quantityOfStudents);

        System.out.println("\nНа основе полученных данных из списка students\n" +
                "найти всех студентов, которые учатся в России,\n" +
                "отсортировать их по алфавитному порядку имени\n" +
                "преобразовать их в короткую версию записи о студенте,\n" +
                "ограничиться только первыми 2\n" +
                "вывести в консоль");

        //анонимная функция
        //название переменной -> что с ней делать

        students.stream()
                .filter(student -> student.getCountry().equals("Россия"))
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
//                .sorted(Comparator.comparing(Student::getName)) :: - это ссылка на метод, то же самое, что строка выше
                .map(student -> new StudentShort(student.getName(), student.getAge()))
                .limit(2)
                .forEach(student -> System.out.println(student));
        //                .forEach(System.out::println) - то же самое, что строка выше, только со ссылкой на метод

        System.out.println("1)\nНайдите все уникальные имена и соберите их в отдельную переменную списка " +
                "2) Выведите данный цикл в консоль с помощью метода forEach и ссылки на метод");
        Set<String> names = students.stream()
                .map(Student::getName)
                .collect(Collectors.toSet());
        names.forEach(System.out::println);

        System.out.println("\nНа основе полученных данных из списка list\n" +
                "найти всех студентов, которые не из России и старше 19,\n" +
                "проверить, все ли учатся на первом курсе");
        boolean isAllFirstCourse = students.stream()
                .filter(student -> !student.getCountry().equals("Россия") && student.getAge() > 19)
                .allMatch(student -> student.getCourse() == 1);
        System.out.println(isAllFirstCourse ? "да" : "нет");

        System.out.println("\nНа основе полученных данных из списка list\n" +
                "найти всех студентов, которые не из Америки,\n" +
                "при этом старше 10\n" +
                "если такие есть, то любого вывести в консоль\n");
        students.stream()
                .filter(student -> !student.getCountry().equals("Америка") && student.getAge() > 10)
                .findAny()
                .ifPresent(System.out::println);

        //пример Optional вне стрима
        Optional<Student> optStudent = Optional.ofNullable(students.get(0)); //кладет в Optional либо null, либо объект
        if (optStudent.isPresent()) { //проверяет, есть ли внутри Optional объект
            Student student = optStudent.get(); //достает объект их Optional
        }

        System.out.println("\nНа основе полученных данных из списка list\n" +
                "найти всех студентов, и собрать их имена в строку через запятую\n");
        String row = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
        System.out.println(row);
    }
}
