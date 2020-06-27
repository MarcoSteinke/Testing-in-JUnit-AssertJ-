package math.summation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SummationTest {

    @Test
    void sumOfNoParametersIsZero() {
        // arrange
        double result = 0;

        // act

        result = Sum.of();

        // assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    void sumOfPositiveNumbersIsPositive() {
        double result = 0;

        result = Sum.of(22, 33, 11);

        assertThat(result).isGreaterThan(0);
    }

    @Test
    void sumOfAnyNumbers() {
        double result = 0;

        result = Sum.of(3, 8, Sum.of(1, 2, 3));

        assertThat(result).isEqualTo(17);
    }
}
