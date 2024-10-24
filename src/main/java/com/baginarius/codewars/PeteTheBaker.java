package com.baginarius.codewars;

import java.util.Map;

public class PeteTheBaker {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        return recipe
                .entrySet()
                .stream()
                .mapToInt(it -> available.getOrDefault(it.getKey(), 0) / it.getValue())
                .min()
                .orElse(0);
    }

}
