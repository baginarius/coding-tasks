package com.baginarius.codingtasks;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/*
Find max value in the List<Integer>
 */
public class Task3 {

    public static Optional<Integer> findMaxValue(List<Integer> input) {
        if (null == input) {
            return Optional.empty();
        }
        return input.stream().filter(Objects::nonNull).max(Integer::compareTo);
    }
}
