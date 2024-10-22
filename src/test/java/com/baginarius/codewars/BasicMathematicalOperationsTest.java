package com.baginarius.codewars;

import org.junit.jupiter.api.Test;

import static com.baginarius.codewars.BasicMathematicalOperations.basicMath;
import static org.assertj.core.api.Assertions.assertThat;

class BasicMathematicalOperationsTest {

    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(basicMath("+", 4, 7)).isEqualTo(11);
        assertThat(basicMath("-", 15, 18)).isEqualTo(-3);
        assertThat(basicMath("*", 5, 5)).isEqualTo(25);
        assertThat(basicMath("/", 49, 7)).isEqualTo(7);
    }

}