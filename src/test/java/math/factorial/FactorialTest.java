package math.factorial;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FactorialTest {

    @Test
    void negativeNumbersGiveFactorialZero() {
        // arrange
        int result = 0;
        int n = -2;

        // act
        result = Factorial.of(n);

        // arrange
        assertThat(result).isEqualTo(0);

    }

    @Test
    void positiveNumbersGiveFactorial() {
        // arrange
        int result = 0;
        int n = 5;

        // act
        result = Factorial.of(n);

        // arrange
        assertThat(result).isEqualTo(120);

    }

    @Test
    void ZeroGivesFactorialOne() {
        int result = 0;
        int n = 0;

        result = Factorial.of(n);

        assertThat(result).isEqualTo(1);
    }


}
