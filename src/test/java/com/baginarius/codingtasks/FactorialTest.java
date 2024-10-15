package com.baginarius.codingtasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,1",
            "2,2",
            "3,6",
            "4,24",
            "5,120",
            "10,3628800",
            "20,2_432_902_008_176_640_000"
    })
    void shouldCalculateFactorial(int input, long expectedValue) {
        assertThat(Factorial.factorial(input)).isEqualTo(expectedValue);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,1",
            "2,2",
            "3,6",
            "4,24",
            "5,120",
            "10,3628800",
            "20,2_432_902_008_176_640_000"
    })
    void shouldCalculateFactorialRecursive(int input, long expectedValue) {
        assertThat(Factorial.factorialRecusrive(input)).isEqualTo(expectedValue);
    }
}