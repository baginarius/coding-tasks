package com.baginarius.codewars;

import org.junit.jupiter.api.Test;

import static com.baginarius.codewars.BitCounting.countBits;
import static org.assertj.core.api.Assertions.assertThat;

class BitCountingTest {

    @Test
    void shouldGetNoOfBits() {
        assertThat(countBits(1)).isEqualTo(1);
        assertThat(countBits(2)).isEqualTo(1);
        assertThat(countBits(3)).isEqualTo(2);
        assertThat(countBits(4)).isEqualTo(1);
        assertThat(countBits(7)).isEqualTo(3);
        assertThat(countBits(9)).isEqualTo(2);
        assertThat(countBits(10)).isEqualTo(2);
        assertThat(countBits(1234)).isEqualTo(5);
    }
}