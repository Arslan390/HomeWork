package lesson20.stringBuilderExample;

import java.util.List;

public class StringBuilderExample {
    public static void main(String[] args) {
        List<String> words = List.of("Дом", "Город", "Пирамида", "Треугольник", "Тетрадь", "Танк", "Семечка");
        System.out.println("\nНайдем все слова с буквой Т большой или маленькой, с буквой е большой или маленькой " +
                "и без буквы к большой или маленькой обычным способом");
        String examleString = "Дом" + "Город" + "Пирамида" + "Треугольник" + "Тетрадь" + "Танк" + "Семечка";

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }

        examleString = sb.toString();
    }
}
