package com.baginarius.codewars;

import org.junit.jupiter.api.Test;

import static com.baginarius.codewars.FindTheParityOutlier.find;
import static org.assertj.core.api.Assertions.assertThat;

class FindTheParityOutlierTest {

    @Test
    void shouldGetOutlier() {
        assertThat(find(new int[]{2, 6, 8, -10, 3})).isEqualTo(3);
        assertThat(find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781})).isEqualTo(206847684);
        assertThat(find(new int[]{Integer.MAX_VALUE, 0, 1})).isEqualTo(0);
    }

}