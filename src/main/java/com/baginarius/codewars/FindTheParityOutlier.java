package com.baginarius.codewars;

import java.util.Arrays;

public class FindTheParityOutlier {
    static int find(int[] integers) {
        int[] evenInts = Arrays.stream(integers).filter(value -> value % 2 == 0).limit(2).toArray();
        int[] oddInts = Arrays.stream(integers).filter(value -> value % 2 != 0).limit(2).toArray();
        if (evenInts.length == 1) {
            return evenInts[0];
        } else {
            return oddInts[0];
        }
    }
}
