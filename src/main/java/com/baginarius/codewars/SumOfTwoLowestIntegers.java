package com.baginarius.codewars;

import java.util.Arrays;

public class SumOfTwoLowestIntegers {

    public static long sumTwoSmallestNumbers(final long [] numbers) {
        //Arrays.stream(numbers).sorted().limit(2).sum();
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];


    }

}
