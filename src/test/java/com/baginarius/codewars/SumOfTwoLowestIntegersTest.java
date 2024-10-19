package com.baginarius.codewars;

import org.junit.jupiter.api.Test;

import static com.baginarius.codewars.SumOfTwoLowestIntegers.sumTwoSmallestNumbers;
import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoLowestIntegersTest {

    @Test
    void basicTests() {
        assertEquals(13L, sumTwoSmallestNumbers(new long[]{5, 8, 12, 19, 22}));
        assertEquals(6L, sumTwoSmallestNumbers(new long[]{15, 28, 4, 2, 43}));
        assertEquals(6L, sumTwoSmallestNumbers(new long[]{3, 87, 3, 12, 7}));
        assertEquals(24L, sumTwoSmallestNumbers(new long[]{23, 71, 33, 82, 1}));
        assertEquals(16L, sumTwoSmallestNumbers(new long[]{52, 76, 14, 12, 4}));
    }

}