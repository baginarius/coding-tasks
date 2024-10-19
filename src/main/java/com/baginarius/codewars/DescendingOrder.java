package com.baginarius.codewars;

import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        Arrays.sort(charArray);
        char[] output = new char[charArray.length];
        for (int i = charArray.length - 1; i >= 0; i--) {
            output[charArray.length - (i + 1)] = charArray[i];
        }

        return Integer.parseInt(String.valueOf(output));
    }

}
