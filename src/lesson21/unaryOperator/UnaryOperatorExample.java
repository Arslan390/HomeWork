package lesson21.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        //Предположим, что у нас есть сайт, где при регистрации пользователя приветствуют по имени, которое он указал
        //... предположим, что мы реализуем программу с этапа, на котором данные от пользователя мы уже получили
        String name = "Сергей";
        System.out.println("Добро пожаловать, " + name + "!");

        //Сделаем то же самое с использованием Unary Operator
        HelloOperator helloOperator = new HelloOperator();
        System.out.println(helloOperator.apply(name));

        UnaryOperator<String> helloOperator2 = text -> "Добро пожаловать, " + text + "!";
        System.out.println(helloOperator2.apply(name));
    }
}
