package uk.co.ibm;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static final String produceFizzBuzzForRange(Integer start, Integer end) {

        return IntStream.range(start, end)
                .mapToObj(value -> produceFizzBuzzFor(value))
                .collect(Collectors.joining(", "))
                .toString();

    }

    private static String produceFizzBuzzFor(Integer integer) {

        if (integer % 15 == 0) {
            return "Fizz Buzz";
        }

        if (integer % 5 == 0) {
            return "Buzz";
        }

        if (integer % 3 == 0) {
            return "Fizz";
        }

        return integer.toString();
    }
}
