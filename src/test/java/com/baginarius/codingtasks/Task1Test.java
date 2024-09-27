package com.baginarius.codingtasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.baginarius.codingtasks.Task1.filterEvenNumbers;
import static org.assertj.core.api.Assertions.assertThat;

class Task1Test {

    @Test
    void shouldHandleEmptyList() {
        assertThat(filterEvenNumbers(List.of())).isEmpty();
        assertThat(filterEvenNumbers(null)).isEmpty();
    }

    @Test
    void shouldFilterEvenNumbers() {
        assertThat(filterEvenNumbers(List.of(1,2,3,4,4))).containsExactly(2,4,4);
        assertThat(filterEvenNumbers(List.of(1,3,5))).isEmpty();
    }

    @Test
    void shouldHandleNullInList() {
        //given
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(null);
        integers.add(3);

        //when & then
        assertThat(filterEvenNumbers(integers)).containsExactly(2);
    }
}