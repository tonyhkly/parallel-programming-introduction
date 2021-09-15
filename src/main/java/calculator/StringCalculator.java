package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int addSimple(Integer input1, Integer input2) {
        return input1 + input2;
    }

    public int add(String inputString) {
        String[] inputsSeperated = inputString.split(",");

        if (inputsSeperated.length > 3) {
            throw new IllegalArgumentException("Can only add up to 3 numbers but input was: " + inputString);
        }

        List<Integer> numbers = new ArrayList<>();

        for (String input : inputsSeperated) {
            numbers.add(parseIntegerOrZero(input));
        }

        int total = 0;

        for (Integer number : numbers) {
            total = total + number;
        }

        return total;
    }

    private int parseIntegerOrZero(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
