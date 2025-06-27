package lesson20.consumer;

import java.util.function.Consumer;

public class PrintConsumer implements Consumer<String> {

    @Override
    public void accept(String word) {
        if (word != null && !word.isEmpty()) {
            System.out.println(word);
        }
    }
}
