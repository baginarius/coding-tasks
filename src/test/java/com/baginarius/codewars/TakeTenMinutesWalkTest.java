package com.baginarius.codewars;

import org.junit.jupiter.api.Test;

import static com.baginarius.codewars.TakeTenMinutesWalk.isValid;
import static org.assertj.core.api.Assertions.assertThat;

class TakeTenMinutesWalkTest {

    @Test
    void falseWalkTooShort() {
        assertThat(isValid(new char[]{'n'})).isFalse();
        assertThat(isValid(new char[]{'n', 's'})).isFalse();
    }

    @Test
    void falseWalkTooLong() {
        assertThat(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'})).isFalse();
        assertThat(isValid(new char[]{'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w'})).isFalse();
        assertThat(isValid(new char[]{'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w'})).isFalse();
    }

    @Test
    void falseDoesNotLoopBackToStart() {
        assertThat(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 'n'})).isFalse();
        assertThat(isValid(new char[]{'e', 'e', 'e', 'w', 'n', 's', 'n', 's', 'e', 'w'})).isFalse();
        assertThat(isValid(new char[]{'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e'})).isFalse();
        assertThat(isValid(new char[]{'n', 'w', 'n', 'w', 'n', 'w', 'n', 'w', 'n', 'w'})).isFalse();
        assertThat(isValid(new char[]{'s', 'e', 's', 'e', 's', 'e', 's', 'e', 's', 'e'})).isFalse();
        assertThat(isValid(new char[]{'s', 'w', 's', 'w', 's', 'w', 's', 'w', 's', 'w'})).isFalse();
    }

    @Test
    void trueIsValid10MinutesWalk() {
        assertThat(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'})).isTrue();
        assertThat(isValid(new char[]{'e', 'w', 'e', 'w', 'n', 's', 'n', 's', 'e', 'w'})).isTrue();
        assertThat(isValid(new char[]{'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's'})).isTrue();
    }

}