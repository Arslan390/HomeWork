package lesson19.hm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CustomException {
        String a = "У лукоморья дуб65.24зелёный; 0.54Златая цепь на дубе том:85.14 И днём и ночью кот учёный " +
                "Всё ходит 10 по цепи кругом; Идёт направо — песнь65.41заводит, Налево — сказку говорит." +
                "Там 12.43чудеса: там леший бродит, Русалка на ветвях сидит;";

        StringUtilsImpl utils = new StringUtilsImpl();
        System.out.println(Arrays.toString(utils.findNumbers(a)));
    }
}
