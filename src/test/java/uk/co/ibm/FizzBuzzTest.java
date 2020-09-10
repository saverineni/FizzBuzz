package uk.co.ibm;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzForPositiveRange() {
        String fizzBuzzResult = FizzBuzz.produceFizzBuzzForRange(1, 101);
        String expectedFizzBuzzResult = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, " +
                "16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, " +
                "Fizz, 37, 38, Fizz, Buzz, 41, Fizz, 43, 44, Fizz Buzz, 46, 47, Fizz, 49, Buzz, Fizz, 52, 53, Fizz, Buzz, 56, " +
                "Fizz, 58, 59, Fizz Buzz, 61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, 71, Fizz, 73, 74, Fizz Buzz, 76, 77, " +
                "Fizz, 79, Buzz, Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, Fizz Buzz, 91, 92, Fizz, 94, Buzz, Fizz, 97, 98, " +
                "Fizz, Buzz";
        assertThat(fizzBuzzResult, is(expectedFizzBuzzResult));
    }

    @Test
    public void fizzBuzzForNegativeRange() {
        String fizzBuzzResult = FizzBuzz.produceFizzBuzzForRange(-20, -0);
        String expectedFizzBuzzResult = "Buzz, -19, Fizz, -17, -16, Fizz Buzz, -14, -13, Fizz, -11, Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1";
        assertThat(fizzBuzzResult, is(expectedFizzBuzzResult));
    }

    @Test
    public void fizzBuzzForInvalidRange() {
        String fizzBuzzResult = FizzBuzz.produceFizzBuzzForRange(5, 0);
        String expectedFizzBuzzResult = "";
        assertThat(fizzBuzzResult, is(expectedFizzBuzzResult));
    }
}
