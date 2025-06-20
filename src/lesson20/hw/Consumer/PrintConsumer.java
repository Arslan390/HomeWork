package lesson20.hw.Consumer;

import lesson20.hw.Human;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class PrintConsumer implements Consumer<Human> {
    private final Map<Character, String> translate = new HashMap<>() {{
        put('a', "a");
        put('б', "b");
        put('в', "v");
        put('г', "g");
        put('д', "d");
        put('е', "e");
        put('ё', "e");
        put('ж', "zh");
        put('з', "z");
        put('и', "i");
        put('й', "y");
        put('к', "k");
        put('л', "l");
        put('м', "m");
        put('н', "n");
        put('о', "o");
        put('п', "p");
        put('р', "r");
        put('с', "s");
        put('т', "t");
        put('у', "u");
        put('ф', "f");
        put('х', "h");
        put('ц', "c");
        put('ч', "ch");
        put('ш', "sh");
        put('щ', "sch");
        put('ъ', "");
        put('ы', "y");
        put('ь', "");
        put('э', "e");
        put('ю', "yu");
        put('я', "ya");
    }};

    @Override
    public void accept(Human human) {
        StringBuilder result = new StringBuilder();
        String name = human.getName().toLowerCase();
        for (char c : name.toCharArray()) {
            if (translate.containsKey(c)) {
                result.append(translate.get(c));
            } else {
                result.append(c);
            }
        }
        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        System.out.println(result);
    }
}
