package lesson19.hm;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Arguments cannot be null");
        }

        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("Arguments cannot be null");
        }

        int index = text.indexOf(word);
        ArrayList<Integer> indexes = new ArrayList<>();

        while (index != -1) {
            indexes.add(index);
            index = text.indexOf(word, index + word.length());
        }

        int[] result = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            result[i] = indexes.get(i);
        }

        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        ArrayList<Double> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\d+\\.\\d+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            numbers.add(Double.parseDouble(matcher.group()));
        }

        if (numbers.isEmpty()) {
            throw new CustomException("Not found");
        } else {
            double[] result = new double[numbers.size()];
            for (int i = 0; i < numbers.size(); i++) {
                result[i] = numbers.get(i);
            }
            return result;
        }
    }
}
