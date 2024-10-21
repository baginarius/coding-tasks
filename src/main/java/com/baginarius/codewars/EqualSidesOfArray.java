package com.baginarius.codewars;

import java.util.Arrays;

public class EqualSidesOfArray {

    public static int findEvenIndex(int[] arr) {
        int sumStart = 0;
        int sumEnd = 0;

        for (int i = 1; i < arr.length; i++) {
            sumEnd += arr[i];
        }
        if (sumEnd == 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            sumStart += arr[i];
            sumEnd = 0;
            for (int j = i + 2; j < arr.length; j++) {
                sumEnd += arr[j];
            }

            if (sumStart == sumEnd) {
                return i + 1;
            }
        }
        return -1;
    }

}
