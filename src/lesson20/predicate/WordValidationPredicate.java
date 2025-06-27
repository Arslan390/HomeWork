package lesson20.predicate;

import java.util.function.Predicate;

public class WordValidationPredicate implements Predicate<String> {
    @Override
    public boolean test(String word) {
        //Проверим, что слово не пустое (если пустое, оно не соответствует - false)
        if (word == null || word.isEmpty()) {
            return false;
        }

        //Делаем слово капслоком
        String upperCaseWord = word.toUpperCase();

        //Проверим, что в слове есть буква Т или Т (если нет, оно не соответствует - false)
        if (!upperCaseWord.contains("Т")) {
            return false;
        }

        //Проверим, что в слове есть буква Е или е (если нет, оно не соответствует - false)
        if (!upperCaseWord.contains("Е")) {
            return false;
        }

        //Возвращаем true, если в слове нету буквы К или к, иначе false
        return !upperCaseWord.contains("К");
    }
}
