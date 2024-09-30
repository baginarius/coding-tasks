package com.baginarius.codingtasks;

import org.junit.jupiter.api.Test;

import static com.baginarius.codingtasks.FibonacciGenerator.generate;
import static org.assertj.core.api.Assertions.assertThat;

class FibonacciGeneratorTest {

    @Test
    void shouldGenerateForMinus() {
        assertThat(generate((byte) -10)).isEmpty();
    }

    @Test
    void shouldGenerateFor0() {
        assertThat(generate((byte) 0)).isEmpty();
    }

    @Test
    void shouldGenerateFor1() {
        assertThat(generate((byte) 1)).containsExactly(0L);
    }

    @Test
    void shouldGenerateFor2() {
        assertThat(generate((byte) 2)).containsExactly(0L, 1L);
    }

    @Test
    void shouldGenerateForN() {
        assertThat(generate((byte) 3)).containsExactly(0L, 1L, 1L);
        assertThat(generate((byte) 4)).containsExactly(0L, 1L, 1L, 2L);
        assertThat(generate((byte) 5)).containsExactly(0L, 1L, 1L, 2L, 3L);
        assertThat(generate((byte) 6)).containsExactly(0L, 1L, 1L, 2L, 3L, 5L);
        assertThat(generate((byte) 7)).containsExactly(0L, 1L, 1L, 2L, 3L, 5L, 8L);
        assertThat(generate((byte) 8)).containsExactly(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L);
        assertThat(generate((byte) 9)).containsExactly(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L);
        assertThat(generate((byte) 10)).containsExactly(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L);
    }
}