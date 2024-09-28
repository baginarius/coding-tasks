package com.baginarius.codingtasks;

import java.util.List;

/*
Convert String value in list to uppercase using Stream API. Ignore null values in the input and keep in the list.
 */
public class Task2 {

    public static List<String> convertToUpperCase(List<String> input) {
        if (null == input) {
            return List.of();
        }
        return input.stream().map(value -> value == null ? null : value.toUpperCase()).toList();
    }
}
