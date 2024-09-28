package com.baginarius.codingtasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.baginarius.codingtasks.Task2.convertToUpperCase;
import static org.assertj.core.api.Assertions.assertThat;

class Task2Test {

    @Test
    void shouldHandleEmptyList() {
        assertThat(convertToUpperCase(List.of())).isEmpty();
        assertThat(convertToUpperCase(null)).isEmpty();
    }

    @Test
    void shouldConvertToUpperCase() {
        assertThat(convertToUpperCase(List.of("aa","BB","aaBBcc",""))).containsExactly("AA","BB","AABBCC","");
    }

    @Test
    void shouldHandleNullInList() {
        //given
        List<String> strings = new ArrayList<>();
        strings.add("aBcD");
        strings.add(null);
        strings.add("3abcZZaa");

        //when & then
        assertThat(convertToUpperCase(strings)).containsExactly("ABCD", null, "3ABCZZAA");
    }
}