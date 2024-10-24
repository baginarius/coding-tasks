package com.baginarius.codewars;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PeteTheBakerTest {

    @Test
    void shouldBakeOneCakeForEqualRecipeAndIngredients() {
        //given
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);

        //when
        int cakes = PeteTheBaker.cakes(recipe, available);

        //then
        assertThat(cakes).isEqualTo(1);
    }

    @Test
    void basicTest() {
        //given
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);

        //when
        int cakes = PeteTheBaker.cakes(recipe, available);

        //then
        assertThat(cakes).isEqualTo(2);
    }

    @Test
    void shouldBakeZeroIfOneIngredientsIsMissing() {
        //given
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 100,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);

        //when
        int cakes = PeteTheBaker.cakes(recipe, available);

        //then
        assertThat(cakes).isEqualTo(1);
    }

}