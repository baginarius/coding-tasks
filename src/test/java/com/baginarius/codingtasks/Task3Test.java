package com.baginarius.codingtasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.baginarius.codingtasks.Task3.findMaxValue;
import static org.assertj.core.api.Assertions.assertThat;

class Task3Test {

    @Test
    void shouldHandleEmptyList() {
        assertThat(findMaxValue(List.of())).isEmpty();
        assertThat(findMaxValue(null)).isEmpty();
    }

    @Test
    void shouldFilterEvenNumbers() {
        assertThat(findMaxValue(List.of(1,-2,-13,47,41,8))).hasValue(47);
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
        assertThat(findMaxValue(integers)).hasValue(3);
    }

    @Test
    void shouldHandleOnlyNullInList() {
        //given
        List<Integer> integers = new ArrayList<>();
        integers.add(null);
        integers.add(null);

        //when & then
        assertThat(findMaxValue(integers)).isEmpty();
    }
}