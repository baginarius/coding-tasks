package com.baginarius.codingtasks;

import java.util.List;
import java.util.Objects;

/*
Filter even numbers from the list using Stream API
 */
public class Task1 {

    public static List<Integer> filterEvenNumbers(List<Integer> input) {
        if (null == input) {
            return List.of();
        }
        return input.stream().filter(Objects::nonNull).filter(number -> number % 2 == 0).toList();
    }
}
