package com.baginarius.codingtasks;

import org.junit.jupiter.api.Test;

import static com.baginarius.codingtasks.FibonacciGenerator.generate;
import static org.assertj.core.api.Assertions.assertThat;

class PowerOfTwoTest {
    @Test
    void shouldGenerateForN() {
        assertThat(PowerOfTwo.isPowerOfTwoBruteForce(0)).isFalse();
        assertThat(PowerOfTwo.isPowerOfTwoBruteForce(1)).isTrue();
        assertThat(PowerOfTwo.isPowerOfTwoBruteForce(2)).isTrue();
        assertThat(PowerOfTwo.isPowerOfTwoBruteForce(3)).isFalse();
        assertThat(PowerOfTwo.isPowerOfTwoBruteForce(4)).isTrue();
        assertThat(PowerOfTwo.isPowerOfTwoBruteForce(5)).isFalse();
        assertThat(PowerOfTwo.isPowerOfTwoBruteForce(6)).isFalse();
        assertThat(PowerOfTwo.isPowerOfTwoBruteForce(8)).isTrue();
        assertThat(PowerOfTwo.isPowerOfTwoBruteForce(16)).isTrue();
    }

    @Test
    void shouldGenerate() {
        assertThat(PowerOfTwo.isPowerOfTwo(0)).isFalse();
        assertThat(PowerOfTwo.isPowerOfTwo(1)).isTrue();
        assertThat(PowerOfTwo.isPowerOfTwo(2)).isTrue();
        assertThat(PowerOfTwo.isPowerOfTwo(3)).isFalse();
        assertThat(PowerOfTwo.isPowerOfTwo(4)).isTrue();
        assertThat(PowerOfTwo.isPowerOfTwo(5)).isFalse();
        assertThat(PowerOfTwo.isPowerOfTwo(6)).isFalse();
        assertThat(PowerOfTwo.isPowerOfTwo(8)).isTrue();
        assertThat(PowerOfTwo.isPowerOfTwo(16)).isTrue();
    }
}