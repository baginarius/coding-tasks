package com.baginarius.codingtasks;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    /**
     * Generate Fibonacci stream for given length (0 - empty, 1 - stream with one element, 2 - stream with 2 elements etc.)
     * @param lengthOfStream - length of the stream to generate
     */
    public static List<Long> generate(byte lengthOfStream) {
        if (lengthOfStream <= 0) {
            return List.of();
        }
        if (lengthOfStream == 1) {
            return List.of(0L);
        } else if (lengthOfStream == 2) {
            return List.of(0L, 1L);
        }
        List<Long> list = new ArrayList<>();
        list.add(0L);
        list.add(1L);
        for (int i = 2; i <lengthOfStream; i++){
            list.add(list.get(i-1) + list.get(i-2));
        }
        return list;
    }
}
